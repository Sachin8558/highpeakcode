//import java.io.*;
//import java.util.*;
public class Item {
  String name;
  int price;
  
  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }
  
  public String toString() { 
      return this.name + ": " + this.price;
  }
}




