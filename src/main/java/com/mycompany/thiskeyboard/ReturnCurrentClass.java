package com.mycompany.thiskeyboard;

/**
 *WAP to illustrate the “this” keyword for following use cases.
 6.this can be used to return the current class instance from the method
 */
public class ReturnCurrentClass {
    void display()
    {
        System.out.println("this can be used to return the current class instance from the method");
    }
     ReturnCurrentClass show()
    {
       return this ;    //this can be used to return the current class instance from the method
    }
public static void main(String[] args)
    {
      ReturnCurrentClass e=new ReturnCurrentClass(); 
      e.show().display();
      
    }
}
