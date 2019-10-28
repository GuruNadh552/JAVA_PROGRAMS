class B {
 // Main method
 public static void main(String[] args)
  {
   //Create the object of class A and call members of class A using reference variable 'a'.
      A a=new A(); // a is a reference variable.

   System.out.println(a.data): // Compile time error will occur because we cannot call private members of any class from outside the class.
   
   a.msg(); // Compile time error. So we cannot call the private method of any class because this is accessible within the class only.  
      }
 }
