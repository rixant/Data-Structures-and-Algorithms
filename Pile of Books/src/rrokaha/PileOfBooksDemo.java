/** Rishant Rokaha */
/** Professor Vohra */
/** Data Structure and Algorithms */
/** 26 September 2020 */
/** Assignment 3 */

package rrokaha;
import java.util.*;

public class PileOfBooksDemo {




    public static void main(String[] args) {
        PileOfBooks<String> Demo=new PileOfBooks<>();

        int n;
        String TitleofBook;

        System.out.println("Enter the number of book you want to add: ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();

        System.out.println("Enter the title of books you want to add: ");

        for(int i=0; i<=n;i++){

            TitleofBook=input.nextLine();
            Demo.add(TitleofBook);
        }


        System.out.println("***Books in pile: ***");
        displayBooks(Demo);

        System.out.println("Book at top: "+Demo.getTopBook());
        System.out.println("******************************************");

        Demo.remove();
        System.out.println("*** Books after removing one book at top: ***");
        displayBooks(Demo);


        System.out.println("Book at top: "+ Demo.getTopBook());
        System.out.println("******************************************");

        System.out.println("All books cleared ......");
        Demo.clear();

        Demo.add("The Alchemist");
        Demo.add("The Twilight Saga");
        System.out.println();
        System.out.println("Added books after cleared....");
        displayBooks(Demo);

    }

    public static <T>  void displayBooks(PileOfBooks<T> ebook){
        T[] PileArray = ebook.toArray();
        for(int i=0;i<PileArray.length;i++){
            System.out.println(PileArray[i] + " ");
        }
        System.out.println();
    }

}
