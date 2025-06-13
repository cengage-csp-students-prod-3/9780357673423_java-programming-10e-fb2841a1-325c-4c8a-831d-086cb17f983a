package Lab4;
// Creates a class called "Main".

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Book object
        Book myBook = new Book("Made an Example", 19.99);
        
        // Creates an Author object.
        Author bookAuthor = new Author("Nolan Hollingsworth", "nolan@example.com", "American");
        
        // Links author to book and print book title.
        myBook.setWriter(bookAuthor);
        System.out.println(myBook);

        // Links book to author and print book author.
        bookAuthor.setBook(myBook);
    }
}