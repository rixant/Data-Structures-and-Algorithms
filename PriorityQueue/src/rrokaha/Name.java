/** Rishant Rokaha
 Professor Vohra
 Data Structures and Algorithms
 29 October 2020
 Assignment 7 : Part 2
 */

package rrokaha;

import java.util.Comparator;

class Name implements Comparable{
     String name;


    Name(String  name){
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

     String getName() {
        return name;
    }


    @Override
    public int compareTo(Object o) {
         return Comparator.comparing(Name::getName)
                .compare(this, (Name) o);

    }

}
