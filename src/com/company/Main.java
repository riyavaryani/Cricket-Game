package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int overs;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of overs: ");
        overs = sc.nextInt();
        Match createMatch = new Match(overs);
    }
}
