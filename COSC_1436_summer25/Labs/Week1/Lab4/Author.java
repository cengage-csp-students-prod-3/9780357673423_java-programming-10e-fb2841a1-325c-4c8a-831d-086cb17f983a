package Lab4;
// Creates a class called "Author".

public class Author
{
    // Attributes of the author.
    private String name;
    private Book book;
    private String email;
    private String nationality;

    /**
     * default constructor
     */
    public Author()
    {

    }

    /**
     * Parameterized constructor that sets the author to the name of the passed in name.
     * @param name - consstructing an author with a name.
     */
    public Author(String name, String email, String nationality)
    {
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }

    /**
     * This sets the book to it's author.
     * @param book - The title of the book.
     */
   public void setBook(Book book)
    {
        this.book = book;
    }

    /**
     * Gets the author's name.
     *@return - the Author
     */
    public String getName()
    {
        return name;
    }

    /**
    * This is the overridden toString method.
    */
    @Override
    public String toString()
    {
        return "Author: " + name + ", Email: " + email + ", Nationality: " + nationality;
    }

}