package com.mycompany.thiskeyboard;

/**
 *WAP to illustrate the “this” keyword for following use cases.

2.this can be used to invoke current class method (implicitly)

 */
public class ClassMethod {
  public static void main(String[] args)
    {
      classM e=new classM();  
      e.setvalue(40);
    }
}
class classM
{
    int i;           //class instance variable
    void setvalue(int i)
    {
        this.i=i;   
        this.show();  //this can be used to invoke current class method (implicitly) 
    }
    void show()
    {
        System.out.println("value of i is "+i);
    }
}