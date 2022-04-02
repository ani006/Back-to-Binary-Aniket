// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DesignFileSystem {
    public static void main(String[] args) {
     String[] fNames = {"naruto","naruto(1)","naruto(2)","naruto(3)", "naruto"};
     List<String> result=new ArrayList<>();
     HashMap<String,Integer> map=new HashMap<>();
     
     for(String name:fNames)
     {
         if(map.containsKey(name))
         {
            String newName=getValidName(name,map);
            if(newName!=null){
                result.add(newName);
                map.put(newName,1);
            }
         }
         else 
         {
            result.add(name);
            map.put(name,1); 
         }
     }

    for(int i=0;i<result.size();i++)
    {
        System.out.println(result.get(i));
    }
    }
    static String getValidName(String name, HashMap<String,Integer> map)
    {
        for(int i=1; i<10000;i++)
        {
            String temp=name+'('+i+')';
            if(!map.containsKey(temp))
            {
                return temp;
            }
        }
        return null;
    }
}
