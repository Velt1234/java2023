package de.baleipzig.classes;
import java.util.ArrayList;
import java.util.Iterator;
public class TestList {
	 public static void main(String[] args) {
		 ArrayList<String> destination = new ArrayList<>(1000);
		 destination.add("Leipzig");
		 destination.add("Berlin");
		 destination.add("Rostock");
		 destination.add("Leipzig");
		 destination.add("Frankfurt");
		 destination.add("Hamburg");
		 destination.add("Leipzig");
		 destination.remove("Leipzig");
		 for (int i = 0;i<destination.size();i++){
		 System.out.println(destination.get(i));
		 
		 } 
		 Iterator<String> destinationIterator = destination.iterator();
		 System.out.print("Destinations: ");
		 while(destinationIterator.hasNext()) {
		  System.out.print(destinationIterator.next() + " ");
		 }
	 }
}
