public class Main
{
	public static void main(String args[])
	{
		Book textBook = new Book();
		System.out.println(textBook);  //What does this line do?
    Book book2 = new Book("Hitchhikers Guide to the Galaxy", 345391802);
		System.out.println(book2);
    textBook.setName("Learn JAVA now!!!");
    textBook.setISBN(12345678);
    System.out.println(textBook);
    textBook.getBookName();
    System.out.println("Book 0 name: "+ textBook.getBookName() + " ISBN(" + textBook.getBookISBN() + ")");
    System.out.println("Book 1 name: "+ book2.getBookName() + " ISBN(" + book2.getBookISBN() + ")");
    System.out.println(textBook.toString());
    System.out.println(book2.toString());

	}
  
}