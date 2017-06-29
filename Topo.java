
import java.util.*;
import java.io.*;


class Graph
{
		private int V;
		private ArrayList<Integer> adj[];

		public Graph(int k)
		{
			V=k;
			adj=new ArrayList[V];	

			for(int i=0;i<V;i++)	
			{
				adj[i]=new ArrayList();
			}	

		}

		public void topologicalUtilSort(int k,boolean visited[],Stack stack)
		{
			visited[k]=true;	

			Iterator<Integer> iter=adj[k].iterator();

			while(iter.hasNext())
			{
				int val=(int)iter.next();

				if(!visited[val])
				topologicalUtilSort(val,visited,stack);	
			}	

			stack.push(new Integer(k));
		}

		public void topologicalSort()
		{
			Stack stack=new Stack();
			boolean visited[]=new boolean[V];	

			for(int i=0;i<V;i++)
			{
				if(!visited[i])
				topologicalUtilSort(i,visited,stack);	
			}	


			while(stack.empty()==false)
			{
				int val=(int)stack.pop();
				System.out.print(val+" ");
			}	

		}


		public void addEdge(int v,int w)
		{
			adj[v].add(w);
		}

		public static void main(String args[])
		{

			Graph g = new Graph(6);
   		  	g.addEdge(5, 2);
        	g.addEdge(5, 0);
       		g.addEdge(4, 0);
     		g.addEdge(4, 1);
        	g.addEdge(2, 3);
        	g.addEdge(3, 1);


        	System.out.println("Following is a Topological " +
            	               "sort of the given graph");
        
        	g.topologicalSort();

		}


}