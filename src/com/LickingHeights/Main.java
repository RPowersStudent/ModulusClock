package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void ModulusClock(){
        int hour;
        int minute;
        Scanner keyboard;
        keyboard= new Scanner(System.in);

        System.out.println("Please type the hour");
        hour=keyboard.nextInt();

        System.out.println("please type the minute");
        minute=keyboard.nextInt();

        hour = minute > 59? hour + (minute/60): hour;
        hour = (hour%12+1);
        minute = (minute%60);

    }
}
