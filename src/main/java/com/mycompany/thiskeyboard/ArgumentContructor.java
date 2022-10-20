package com.mycompany.thiskeyboard;

/**
 *WAP to illustrate the “this” keyword for following use cases.
 5.this can be passed as argument in the constructor call.
 */
public class ArgumentContructor {
public static void main(String[] args)
    {
      show e=new show(); 
      e.display();
      
    }
}
class argumentC
{
    argumentC(show obj)
    {
        System.out.println("this can be passed as argument in the constructor call. ");     
    }
}
class show{
    void display()
    {
        argumentC ct=new argumentC(this);
        System.out.println("this is first class method ");
    }
}