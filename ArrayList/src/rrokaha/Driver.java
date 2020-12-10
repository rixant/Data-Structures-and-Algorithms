/**Rishant Rokaha
 * Professor Vohra
 * Data Structures and ALgorithms
 * 22 November 2020
 * Assignment 9
 */

package rrokaha;

public class Driver {

    public static void main(String[] args) throws Exception {
        ListInterface<String> Stocks = new AList<>();
        Stocks.add(1, "Anne");
        Stocks.add(2, "Elvis");
        Stocks.add(2, "Bill");
        Stocks.add(3, "Darren");
        Stocks.add(1,"Aaron");
        Stocks.add(4, "Christine");
        Stocks.remove(4);
        displayList(Stocks);






    }

    public static <T>  void displayList(ListInterface<T> ebook) throws Exception {
        T[] ListArray = ebook.toArray();
        for(int i=0;i<ListArray.length;i++){
            System.out.println("Entry "+ (i+1) +" is "+ListArray[i] + " ");
        }
        System.out.println();
    }

}
