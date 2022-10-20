
package com.mycompany.thiskeyboard;

/**
 *WAP to illustrate the “this” keyword for following use cases.
 
 4.this can be passed as an argument in the method call.
 
 */
public class ArgumentMethod {
public static void main(String[] args)
    {
      argumentM e=new argumentM(); 
      e.show(20);
      
    }
}
class argumentM
{
    int i;           //instance variable
    public void setvalue(argumentM obj)
    {
        System.out.println("this is first method ");     
    }
    public void show(int i)
    {
        setvalue(this);   //this can be passed as an argument in the method call.
        this.i=i;            //class instance variable
        System.out.println("value of i is "+i);
    }
}