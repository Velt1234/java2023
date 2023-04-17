package de.baleipzig.classes;
import java.util.Objects;
public record Alien(String name, int alienID, String homePlanet) {
 public Alien {
 Objects.requireNonNull(name);
 Objects.requireNonNull(homePlanet);
 }
 public Alien(String name, int alienID) {
 this(name, alienID, UNKNOWN_HOME_PLANET);
 }
 public static String UNKNOWN_HOME_PLANET = "Unknown";
 
 public Alien(String name, String homePlanet) {
	 this(name, ARTIFICIAL_ID, homePlanet);
	 ARTIFICIAL_ID++;
	 }
	 
	 public static int ARTIFICIAL_ID = 10000;
	 public void greetEarth() {
		 System.out.println("Hallo, hier ist " + name + " von " + homePlanet + ".");
		 }

 
}