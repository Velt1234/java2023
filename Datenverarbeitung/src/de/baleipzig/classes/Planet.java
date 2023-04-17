package de.baleipzig.classes;
public enum Planet {
 MERCURY (4879, 0.055),
 VENUS (12104, 0.815),
 //... 
 NEPTUNE (49528, 17.1);
 private final int diameter; // in km
 private final double mass; // in Earth masses
 Planet(int aDiameter, double aMass) {
 diameter = aDiameter;
 mass = aMass;
 }
 public int getDiameter() { return diameter; }
 public double getMass() { return mass; }
 // surface area (km2)
 public double surfaceArea() {
 return Math.PI *diameter * diameter; 
 }
 // Kepler's Constant (s3 / m3)
 public static final double K =2.97E-19;
}