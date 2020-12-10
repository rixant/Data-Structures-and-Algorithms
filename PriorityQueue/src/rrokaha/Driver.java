/** Rishant Rokaha
Professor Vohra
 Data Structures and Algorithms
 29 October 2020
 Assignment 7 : Part 2
 */

package rrokaha;

import java.util.Scanner;

public class Driver<T> {


    public static void main(String[] args) {
        PriorityQueueInterface<String> PQ1 = new OurPriorityQueue<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number(n) of elements in first queue(Q1) : ");
        int n = input.nextInt();
        input.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Enter the names in first queue(Q1) :");
            String names = input.nextLine();
        PQ1.add(names);
        }
        System.out.println("---------------------------");

        PriorityQueueInterface<String> PQ2 = new OurPriorityQueue<>();
        System.out.println("Enter the number(m) of elements in second queue(Q2) : ");
        int m = input.nextInt();
        input.nextLine();

        for(int j = 0; j < m; j++){
            System.out.println("Enter the names in second queue(Q2)");
            String names = input.nextLine();
            PQ2.add(names);
        }


        System.out.println();
        System.out.println("The intersection of Q1 & Q2 is : ");
        intersection(PQ1, PQ2);

        System.out.println();

        System.out.println("The union of Q1 & Q2 is : ");
        union(PQ1,PQ2);


    }


    public static <T> void  intersection(PriorityQueueInterface<T> list1, PriorityQueueInterface<T> list2) {
        OurPriorityQueue<T> intersectionbag = new OurPriorityQueue<>();

        for (int i = 0; i < list2.getSize(); i++) {
           //System.out.println(list2.getEntry(i));
            if (list1.contains(list2.getEntry(i))) {
                intersectionbag.add(list2.getEntry(i));
            }
        }
        System.out.println(intersectionbag.queue);
    }


    public static <T> void union(PriorityQueueInterface<T> list1, PriorityQueueInterface<T> list2) {
        OurPriorityQueue<T> unionbag = new OurPriorityQueue<>();
        for (int i = 0; i < list1.getSize(); i++) {
            // System.out.println(list1.getEntry(i));
            if (!unionbag.contains(list1.getEntry(i))) {
                unionbag.add(list1.getEntry(i));
            }
        }

        for (int i = 0; i < list2.getSize(); i++) {
           // System.out.println(list2.getEntry(i));
            if (!unionbag.contains(list2.getEntry(i))) {
                unionbag.add(list2.getEntry(i));
            }
        }

        System.out.println(unionbag.queue);
    }
}