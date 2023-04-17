package de.baleipzig.classes;
public enum RIR {
 AFRINIC("African Network Information Centre", "www.afrinic.net"),
 ARIN("American Registry for Internet Numbers", "www.arin.net"),
 APNIC("Asia-Pacific Network Information Centre", "www.apnic.net"),
 LACNIC("Latin America and Caribbean Network Information Centre", "www.lacnic.net"),
 RIPENCC("Réseaux IP Européens Network Coordination Centre", "www.ripe.net");
 private final String name;
 private final String website;
 RIR(String aName, String aWebsite) {
 name = aName;
 website = aWebsite;
 }
 public String getName() { return name; }
 public String getWebsite() { return website; }
}