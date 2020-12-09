/** Rishant Rokaha */
/** Professor Vohra */
/** Data Structure and Algorithms */
/** 26 September 2020 */
/** Assignment 3 */

package rrokaha;


public class Book<T> {
    private T bookTitle;
    private Book<T> NextBook;


    Book(T bookTitle) {
        this(bookTitle, null);
    }

    Book(T bookTitle,Book<T> NextBook){
        this.bookTitle=bookTitle;
        this.NextBook=NextBook;
    }



    Book<T> getNextBook() {
        return this.NextBook;
    }


    void setBookTitle(T bookTitle) {
        this.bookTitle = bookTitle;
    }


    void setNextBook(Book NextBook) {
        this.NextBook = NextBook;
    }




    T getBookTitle() {
        return this.bookTitle;
    }
}
