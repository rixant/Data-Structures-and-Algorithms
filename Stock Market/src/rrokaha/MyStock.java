/** Rishant Rokaha
 * Professor Vohra
 * Data Structure and Algorithms
 * 16 October 2020
 * Assignment 5
 */

package rrokaha;

public class MyStock<T> {
    private StackInterface<T> stocksledger;
    private static double netWorth = 0;
    private static double portofolioValue = 0;


    public MyStock() {
        stocksledger = new OurStack<>();
    }

    ;


    // buy stocks
    public void buy(String Ticker, int sharesBought, double buyingPrice) {
        double totalAMount = sharesBought * buyingPrice;
        if (sharesBought > 0) {
            T purchase = (T) new Stock<>(Ticker, sharesBought, buyingPrice);
            stocksledger.push(purchase);
        }
        portofolioValue += totalAMount;


    }


    // return last bought stocks
    public String lastBoughtStock() {
        Stock<T> last = (Stock) stocksledger.peek();
        return last.getTicker();

    }


    // sell stocks
    public double sell(int sharesSold, double sellingPrice) {
        double saleAmount = 0;
        double totalCost = 0;
        if (sharesSold > 0) {
            Stock<T> share = (Stock) stocksledger.pop();
            double shareCost = share.getCostPerShare();
            int numberOfShares = share.getNumOfShares();
            String stockTicker = share.getTicker();
            System.out.println("Sold Stock : " + stockTicker);

            if (numberOfShares > sharesSold) {
                totalCost += sharesSold * shareCost;
                int remainingNoOfShares = numberOfShares - sharesSold;
                T remaining = (T) new Stock<>(stockTicker, remainingNoOfShares, shareCost);
                stocksledger.push(remaining);
                saleAmount = sharesSold * sellingPrice;

                //portoflio value with the current selling price
                portofolioValue -= numberOfShares*shareCost;
                portofolioValue += remainingNoOfShares*sellingPrice;


            } else {

                portofolioValue -= sharesSold*shareCost;
                saleAmount = numberOfShares * sellingPrice;
                totalCost += numberOfShares * shareCost;
            }
        }
            System.out.println("No of Shares Sold : " + sharesSold);
            System.out.println("Selling Price Per Each Share : " + sellingPrice);
            double Profitloss = saleAmount - totalCost;
            netWorth += Profitloss;
            return Profitloss;

    }


        // networth can be calculated only after the stock is sold
        // and is sum of profits
        public double calculateNetWorth() {
            return netWorth;
        }


    public double PortofolioValue() {
        return portofolioValue;
    }


    }

