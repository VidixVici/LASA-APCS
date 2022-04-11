// VidixVici - Zach - LASA AP CS 2021-2022
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanOne = new Scanner(System.in);
        System.out.println("What is your name? ");
        String outName = scanOne.nextLine();
        System.out.println("Hello " + outName + "!");
        System.out.println("How old are you? ");
        int ageInMonths = scanOne.nextInt();
        System.out.println("Your age in months is " + (ageInMonths * 12) + ".");
        String wasteTime = scanOne.nextLine();
        System.out.println("What is your favorite band? ");
        String favBand = scanOne.nextLine();
        System.out.println("What is your 2nd favorite band? ");
        String secondFavBand = scanOne.nextLine();
        System.out.println("I like " + favBand + " and " + secondFavBand + " too!!! ");

    }
}