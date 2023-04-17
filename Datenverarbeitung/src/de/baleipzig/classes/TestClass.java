package de.baleipzig.classes;
public class TestClass {
 public static boolean isBig(Planet p) {
 boolean b = false;
 switch (p) {
 case MERCURY:
 case VENUS:
 b = false;
 break;
 case NEPTUNE:
 b = true;
 break;
 default:
 b = false;
 }
 return b;
 }
 public static void main(String[] args) {
 Planet p1 = Planet.VENUS;
 System.out.println(isBig(p1));
 }
}