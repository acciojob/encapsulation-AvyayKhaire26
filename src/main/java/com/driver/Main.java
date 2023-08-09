package com.driver;

public class Main {
  public static void main(String[] args) {
      RWOnly obj = new RWOnly();
//      String result = obj.name("Avyay");
//      System.out.print(result);
        obj.setName("Avyay");
        String res = obj.getName();
        System.out.print(res);
  }
}