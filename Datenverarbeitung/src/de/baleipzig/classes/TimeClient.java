package de.baleipzig.classes;
import java.time.*;
public interface TimeClient {
 void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
 LocalDateTime getLocalDateTime();
}