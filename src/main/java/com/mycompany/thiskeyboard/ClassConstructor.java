package com.mycompany.thiskeyboard;

/**
 *WAP to illustrate the “this” keyword for following use cases.

3.this() can be used to invoke current class constructor.

 */
public class ClassConstructor {
 public static void main(String[] args)
    {
      classCon e=new classCon();  
      
    }
}
class classCon
{
    int i;           //class instance variable
    classCon(int i)
    {
        this.i=i;
        System.out.println("this is first construtor ");
           
    }
    classCon()
    {
        this(10);  //this() can be used to invoke current class constructor.
        System.out.println("value of i is "+i);
    }
}