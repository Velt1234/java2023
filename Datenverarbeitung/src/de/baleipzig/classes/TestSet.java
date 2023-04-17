package de.baleipzig.classes;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.TreeSet;
public class TestSet {
 public static void main(String[] args) {
 //...
 TreeSet<Integer> primeNumbers = new TreeSet<>();
 primeNumbers.add(2);
 primeNumbers.add(3);
 primeNumbers.add(4);
 primeNumbers.add(5);
 System.out.println("Prime Numbers: " + primeNumbers);
 
//...
primeNumbers.remove(4);
Iterator<Integer> primeNumberIterator = primeNumbers.iterator();
System.out.print("Prime Numbers using Iterator: ");
while(primeNumberIterator.hasNext()) {
System.out.print(primeNumberIterator.next() + " ");
}
 }
}
