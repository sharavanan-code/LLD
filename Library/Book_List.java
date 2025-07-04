package Library;

import java.util.HashMap;

public class Book_List {
    HashMap<String, Integer> map = new HashMap<>();
    
    public Book_List(){
        this.map = new HashMap<>();
    }

    public void addbook(String name, int count){
        map.put(name, map.getOrDefault(name,0)+count);
    }
    
    public boolean isAvaliable(String name){
        return map.getOrDefault(name, 0) > 0;
    }

    public void takebook(String name){
        if(isAvaliable(name)){
            map.put(name, map.get(name)-1);
        }else{
            System.out.println("this"+ name +" book is not avaliable");
        }
    }

    public void returnbook(String name){
        map.put(name, map.getOrDefault(name, 0)+1);
    }

     public int getAvailableCopies(String name) {
        return map.getOrDefault(name, 0);
    }

   

     public void printAvaliableBooks() {
        for(String name : map.keySet()){
            int count = map.get(name);
            if(count > 0){
                System.out.println(name+" "+count+" is Avaliable");
            }
        }
     }
}
