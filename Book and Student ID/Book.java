// Declare a Book class here.
//   Time to solo...
public class Book {
  private String bookName;
  private int bookISBN;
  public Book(){
    bookName = "";
    bookISBN = 0;
  }
  public Book(String name, int ISBN){
    bookName = name;
    bookISBN = ISBN;
  }
  public void setName(String nameNew){
    bookName = nameNew;
  }
  public void setISBN(int ISBNNew){
    bookISBN = ISBNNew;
  }
  public String getBookName(){
    return bookName;
  }
  public int getBookISBN(){
    return bookISBN;
  }
  public String toString(){
    return bookName + " " + bookISBN;
  }
  
}