/** Rishant Rokaha
 * Professor Vohra
 * Data Structure and Algorithms
 * 16 October 2020
 * Assignment 5
 */

package rrokaha;

public class Stock<T> {

    private String Ticker;
    private int numOfShares;
    private double costPerShare;



    Stock(String Ticker, int numOfShares, double costPerShare){
        this.Ticker = Ticker;
        this.numOfShares = numOfShares;
        this.costPerShare = costPerShare;

    }

    // set ticker name
    void setTicker(String Ticker){
        this.Ticker = Ticker;
    }


    // set price per share
    void setcostPerShare(double costPerShare) {
        this.costPerShare = costPerShare;
    }

    // set number od shares
    void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    // returns price per share
    double getCostPerShare() {
        return costPerShare;
    }

    // returns number of shares
    int getNumOfShares() {
        return numOfShares;
    }

    // returns the ticker name
    String getTicker() {
        return Ticker;
    }
}
