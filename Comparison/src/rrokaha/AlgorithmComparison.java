/** Rishant Rokaha
    Professor Vohra
    Data Structures and Algorithms
    1 October 2020
    Assignment 4 */

package rrokaha;

import java.util.Date;
public class AlgorithmComparison {


    public static void method1() {
        long sum = 0;
        long n = 10000;
        for (long i = 1; i <= n; i++) {
            sum = sum + i;

        }
    //    System.out.println("Alg1 sum : "+sum);

    }


    public static void method2() {
        long sum = 0;
        long n = 10000;
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= i; j++) {
                sum = sum + 1;
            }
        }
      //  System.out.println("Alg2 sum : "+sum);

    }

    public static void method3() {
        long n = 10000;
        long sum;

        sum = n * (n + 1) / 2;
      //  System.out.println("Alg3 sum: "+sum);


    }





    public static void main(String[] args) {


        for (int num = 0; num < 300; num++) {


            /** for Algorithm 1 */

            if(num%20==0)
            System.out.println("when n ="+ num);
            Date current = new Date(); // Get current time
            long startTime = current.getTime();
            method1();
            current = new Date(); // Get current time
            long stopTime = current.getTime();
            long elapsedTime = stopTime - startTime; // Milliseconds
            if(num%20==0)
            System.out.println("The execution time for Algorithm1: "+ elapsedTime);


            /** for Algorithm 2 */
            current = new Date(); // Get current time
            startTime = current.getTime();
            method2(); // Code to be timed
            current = new Date(); // Get current time
            stopTime = current.getTime();
            elapsedTime = stopTime - startTime; // Milliseconds
            if(num%20==0)
            System.out.println("The execution time for Algorithm1: "+ elapsedTime);




            /** for Algorithm 3 */
            current = new Date(); // Get current time
            startTime = current.getTime();
            method3(); // Code to be timed
            current = new Date(); // Get current time
            stopTime = current.getTime();
            elapsedTime = stopTime - startTime; // Milliseconds
            if(num%20==0){
            System.out.println("The execution time for Algorithm1: "+ elapsedTime);

            System.out.println("*******************************************************");}
        }
    }

}
