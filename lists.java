package tasklist;
// Java program to demonstrate working of ArrayList in Java

import java.io.*;
import java.util.*;
import java.util.Collections;

public class lists
{
    ArrayList<Integer> arrlist = new ArrayList<Integer>();

int size()
{
    return arrlist.size();
}

void insert(int element)
{
   int ele=element;
   arrlist.add(ele);
}

void remove(int index)
{
   if (index<=arrlist.size())
   {
      System.out.println("The element getting removed is :"+arrlist.get(index));
      arrlist.remove(index);
   }
       
  else
      System.out.println("Please do verify the index");
}

void display()
{
   System.out.println(arrlist);
}

void fetch(int index)
{
   if (index<=arrlist.size())
System.out.print(arrlist.get(index)+" ");
else
   System.out.println("Please enter a valid index");
}

} 