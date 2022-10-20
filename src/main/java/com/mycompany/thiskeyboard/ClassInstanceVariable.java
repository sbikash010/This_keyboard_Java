package com.mycompany.thiskeyboard;

/**
 *WAP to illustrate the “this” keyword for following use cases.

1.this can be used to refer current class instance variable.

 */
public class ClassInstanceVariable {
    public static void main(String[] args)
    {
      ClassInstance e=new ClassInstance(30);  
      e.show();
    }
}
class ClassInstance
{
    int i;           //instance variable
    ClassInstance(int i)
    {
        this.i=i;     //class instance variable
    }
    void show()
    {
        System.out.println("value of i is "+i);
    }
}