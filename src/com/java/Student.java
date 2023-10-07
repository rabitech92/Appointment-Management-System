package com.java;

 class A {
      public void print(){
          System.out.println("A");
      }

}
class B extends A{
    public void print(){
        System.out.println("B");
    }

}
class C extends A{
    public void print(){
        System.out.println("C");
    }

}
    public class Student {

    public static void main(String[] args) {
        A obj1 =new C();
        A obj2 =new C();
        C obj3 =  (C) obj1;
        C obj4 =  (C) obj2;
        obj3.print();
        obj4.print();

        System.out.println();

    }
}
