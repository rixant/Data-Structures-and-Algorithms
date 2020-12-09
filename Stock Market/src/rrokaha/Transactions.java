/** Rishant Rokaha
 * Professor Vohra
 * Data Structure and Algorithms
 * 16 October 2020
 * Assignment 5
 */

package rrokaha;

public class Transactions<T> {



    public static void main(String[] args) {
        MyStock<Stock> myStocks = new MyStock<>();

        myStocks.buy("Nikola",20,45);
        myStocks.buy("Tesla",30,35);
        myStocks.buy("Ford",50,95);
        myStocks.buy("GM",70,65);


        System.out.println("*************************************************");
        System.out.println("My  Portofolio  Value: " + myStocks.PortofolioValue());
        System.out.println("*************************************************");


        System.out.println("-----After 1st sell-----");
        double ProfitLoss1= myStocks.sell(70, 75);

        System.out.println();
        System.out.println("Profit/Loss : " + ProfitLoss1 );
        System.out.println("Net Worth of my Portofolio : " + myStocks.calculateNetWorth());
        System.out.println("My  Portofolio  Value: " + myStocks.PortofolioValue());
        System.out.println("Stock at top: " + myStocks.lastBoughtStock());

        System.out.println("*************************************************");

        System.out.println("-----After 2nd sell-----");
        double ProfitLoss2= myStocks.sell(25, 80);

        System.out.println();
        System.out.println("Profit/Loss : " + ProfitLoss2 );
        System.out.println("Net Worth of my Portofolio : " + myStocks.calculateNetWorth());
        System.out.println("My  Portofolio  Value: " + myStocks.PortofolioValue());
        System.out.println("Stock at top : " + myStocks.lastBoughtStock());







    }
}
