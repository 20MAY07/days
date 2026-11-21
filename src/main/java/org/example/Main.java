package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int days=250;
        int years;
        int weeks;

        weeks=days/7;
        years=days/365;
        System.out.printf("Days: %d\n Weeks: %d\n Years: %d",days,weeks,years);
    }
}