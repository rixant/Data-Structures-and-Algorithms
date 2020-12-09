/** Rishant Rokaha
 * Professor Vohra
 * Data Structures and Algorithms
 * 21 October 2020
 * Assignment 6
 */
package rrokaha;

class Cave<T> {
    private T caveName;
    private Cave nextCave;

    public void setNextCave(Cave nextCave) {
        this.nextCave = nextCave;
    }

    private double latitude;
    private double longitude;

    Cave(T caveName){
        this(caveName, null, 0, 0);

    }

    Cave(T caveName,Cave nextCave, double latitude, double longitude){
        this.caveName=caveName;
        this.nextCave=nextCave;
        this.latitude=latitude;
        this.longitude=longitude;

    }

    void setCaveName(T caveName) {
        this.caveName = caveName;

    }


    void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    T getCaveName() {
        return this.caveName;
    }

    Cave getNextCave() {
        return nextCave;
    }

    double getLatitude() {
        return this.latitude;
    }

    double getLongitude() {
        return this.longitude;
    }


}
