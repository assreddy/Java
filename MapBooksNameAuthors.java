/*
You have been given a map which holds book name and book author.
One author might have several different books. But books are unique.
Now, write a function which will return you a Map which will have the author name as
unique and all the books he has written as values.

    Collection<String> authorNames = bookMap.values();
    Set<String> authoerSet = new HashSet<>(authorNames);
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapBooksNameAuthors {

  public static void main(String args[]){
    System.out.println("Testing");

    HashMap<String, String> bookMap = new HashMap<String, String>();
    bookMap.put("Java", "Amita");
    bookMap.put("C#", "Dheeraj");
    bookMap.put("Python", "Amita");
    bookMap.put(".Net", "Amita");

    for(Map.Entry<String, String> bookInfo : bookMap.entrySet()){
      System.out.println("Book Name =" +bookInfo.getKey() +" && Author = "+  bookInfo.getValue());
    }

    Set<String> bookNames = bookMap.keySet();
    List<String> listAmita = new ArrayList<>();
    List<String> listDheeraj = new ArrayList<>();

    Map<String, List> hMap = new HashMap<>();
    Iterator<String> it = bookNames.iterator();
    String val, temp;

    while(it.hasNext()){
      val = it.next();
      temp = bookMap.get(val);
      if(temp.equals("Amita")){
        listAmita.add(val);
        hMap.put("Amita", listAmita);
      }
      if(temp.equals("Dheeraj")){
        listDheeraj.add(val);
        hMap.put("Dheeraj", listDheeraj);
      }

    }
     for(Map.Entry<String, List> pair : hMap.entrySet()){
       System.out.println(pair.getKey() +"::"+ pair.getValue());
     }
  }
}
