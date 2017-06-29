import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
 

public class HashMapSortByValueInDescending 
{

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in); 
        
        int n=sc.nextInt();   
        int k,l,i=1;
        
 
        
        Map<Integer, Integer> lMap = new HashMap<Integer, Integer>();
		
	      
       while(n-->0)
       {
           k=sc.nextInt();   
           l=sc.nextInt();   
           
        
           lMap.put(k,l);
           
       }
        
           Set<Entry<Integer, Integer>> entrySet = lMap.entrySet();
        List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(entrySet);
        
        
         Collections.sort(listOfentrySet, new SortByValue());

 
 
        
        
        for(Map.Entry<Integer, Integer> entry:listOfentrySet)
         System.out.print(lMap.get(entry.getKey())+" ");
        
}
    
    
}


class SortByValue implements Comparator<Map.Entry<Integer, Integer>>{
 
   @Override
   public int compare( Map.Entry<Integer,Integer> entry1, Map.Entry<Integer,Integer> entry2){
        
       int second=entry2.getValue();
       int first=entry1.getValue();
       
          if(second>first)
            return 1;
          if(second<first) 
            return -1;
          else
             return 0;
           
           
       //return (entry2.getValue()).compareTo(entry1.getValue() );
   }
}


