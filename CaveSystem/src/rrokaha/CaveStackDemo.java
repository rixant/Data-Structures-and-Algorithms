/** Rishant Rokaha
 * Professor Vohra
 * Data Structures and Algorithms
 * 21 October 2020
 * Assignment 6
 */
package rrokaha;

import java.util.Scanner;

public class CaveStackDemo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of caves you discovered: ");
        int n=input.nextInt();
        input.nextLine();
        CaveStack<String> RR = new CaveStack<>();


        for(int i = 0;i < n;i++){
            System.out.println(" For Cave"+(i+1));
            System.out.println("Enter the name of cave: ");
            String nameOfCave = input.nextLine();
            System.out.println("Enter latitude: ");
            double lat = input.nextDouble();
            System.out.println("Enter longitude: ");
            double lon = input.nextDouble();
            input.nextLine();
            RR.push(nameOfCave, lat, lon);
            System.out.println("------------------------");
        }


        System.out.println("The list of Caves in system are: ");
        displayCaves(RR);
        System.out.println("Most recently discovered cave in system: "+ RR.peek());
        System.out.println(" ");


        System.out.println("Removing newly discovered cave from the system.........");
        RR.pop();
        System.out.println("Most recently discovered cave in system: "+ RR.peek());



    }


    //displays the list of caves
    public static <T>  void displayCaves(CaveStack<T> cavee){
        T[] CaveArray = cavee.toArray();
        for(int i=0;i<CaveArray.length;i++){
            System.out.println(CaveArray[i] + " ");
        }
        System.out.println();
    }
}
