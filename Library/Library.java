import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {

	//ArrayList instance variable that can store Book references
	private ArrayList<Book> books;
	
	/**
	 * Initialization Constructor
	 * Initializes a Library from a text file in the format
	 * # of Books
	 * Title Author Rating
	 * ...
	 * 
	 * Fields must be tab delimited. First line of the file is the number of entries
	 * that follow.
	 * 
	 * @param filename text file to read
	 * @throws FileNotFoundException
	 */
	public Library(String filename) throws FileNotFoundException
	{
		File top100 = new File(filename);
		Scanner topReader = new Scanner(top100);
		
		//instantiate ArrayList
		books = new ArrayList<Book>();
      
		//We need 2 Scanners to read the file because it is tab delimited.
		//The first Scanner reads an entire line and feeds it into the second.
		//The second Scanner can then parse the line on tabs.
		while (topReader.hasNextLine()) {
			Scanner lineReader = new Scanner(topReader.nextLine()).useDelimiter("\\t");

			String title, author;
			int rating;

			if (lineReader.hasNext()) {
				title = lineReader.next();
			} else {
				continue;
			}

			if (lineReader.hasNext()) {
				author = lineReader.next();
			} else {
				continue;
			}

			if (lineReader.hasNextInt()) {
				rating = lineReader.nextInt();
			} else {
				continue;
			}
			addBook(new Book(title, author, rating));
		}
	}
	
	//TODO complete default constructor
	public Library()
	{
		 books = new ArrayList<Book>();
	}
	
	//TODO complete initialization constuctor
	public Library(ArrayList<Book> b)
	{
		books = new ArrayList<Book>();
    for (int i = 0; i < b.size(); i++){
      books.add(b.get(i));
    }
	}

	//initialization constructor
	public Library(Library other)
	{
		other.getBooks();
	}

	//TODO get the union of two ArrayLists
	public Library union(Library other)
	{
    books.addAll(other.getBooks());
		return new Library(books);
	}
	
    //TODO complete modifier method for instance variable books
    public void setBooks(ArrayList<Book> b)
    {
       books = new ArrayList<Book>();
       for(int i = 0; i < b.size(); i++){
         books.add(b.get(i));
       }
    }
   
	//TODO complete accessor for instance variable books
	public ArrayList<Book> getBooks()
	{
		return books;
	}
	
	//TODO complete method to get book at a specified index   
    public Book getBook(int index)
    {
        return books.get(index);
    }
   
	//TODO complete method to set book at a specified index
    public void setBook(int index, Book b)
    {
      books.set(index, b);
    }   
   
	//TODO complete method to add a book at the end of the books ArrayList
	public void addBook(Book addMe)
	{
		books.add(addMe);
	}

	//TODO complete method to add entire ArrayList paramter to end of the books ArrayList
	public void addBooks(ArrayList<Book> addUs)
	{
		books.addAll(addUs);
	}
    
    //TODO complete method to remove book at specified index
    public Book removeBook(int index)
    {
       return books.remove(index);
    }
   
	//TODO complete method to remove first instance of a specified book   
    public boolean removeBook(Book b)
    {
       if(books.contains(b)){
         books.remove(b);
         return true;
       }
       else {
         return false;
       }
    }
	
	//TODO complete method to check for a book in the books instance variable
	public boolean contains(Book findMe)
 	{
		return books.contains(findMe);
	}
   
	//TODO complete method to get index of specified book
    public int indexOf(Book b)
    {
       return books.indexOf(b);
    }   
	
	//TODO complete method to return a Library containing all books with specified title
	public Library searchByTitle(String title)
	{
		Library sByTitle = new Library();
    for(Book book:books){
      if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
        sByTitle.addBook(book);
      }
    }
    return sByTitle;
	}
	
	//TODO complete method to return a Library containing all books with specified author
	public Library searchByAuthor(String author)
	{
    Library sByAuth = new Library();
    for(Book book:books){
      if(book.getAuthor().toLowerCase().contains(author.toLowerCase())){
        sByAuth.addBook(book);
      }
    }
		return sByAuth;
	}

	/**
	 * Find all books with an equal or greater rating.
	 * 
	 * @param rating
	 * @return array of all books with an equal or better rating
	 */
	public Library searchByRating(int rating)
	{
    Library sByRating = new Library();
    for(Book book:books){
      if(book.getRating() >= rating){
        sByRating.addBook(book);
      }
    }
		return sByRating;
	}
   
 	//TODO complete equals method
    public boolean equals(Object obj)
    {
      Library equal = (Library)obj;
      return books.equals(equal.getBooks());
    }
	
	//TODO complete toString method
	public String toString()
	{
		return "" + books;
	}
}