package main;

import enums.Season;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {
    public void execute(){
        System.out.println("Enter month? (December/June ... etc.)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String enteredMonth = null;

        try {
            enteredMonth = br.readLine();
        } catch (IOException e) {
            System.out.println("I got an exception: " + e.getLocalizedMessage());
        }

        Season season = null;

        if (enteredMonth != null) {
            switch (enteredMonth) {
                case "December":
                case "January":
                case "February":
                    season = Season.WINTER;
                    break;
                case "March":
                case "April":
                case "May":
                    season = Season.SPRING;
                    break;
                case "June":
                case "July":
                case "August":
                    season = Season.SUMMER;
                    break;
                case "September":
                case "October":
                case "November":
                    season = Season.AUTUMN;
                    break;
                default:
                    System.out.println("Invalid month");
            }
        }

        if (season != null) {
            System.out.println(season.toString());
        }
    }
}
