// Creates a class called "Book".
public class Book
{
    // attributes

    private String title;
    private double price;
    private Author writer;

    /**
    * This is the constructor for a book.
    */
    public Book(String title, double titlePrice)
    {
        this.title = title;
        price = titlePrice;
    }

    public void setWriter(Author writer)
    {
        this.writer = writer;
    }


    /**
    * This is a the overridden toString method.
    */
    @Override
    public String toString()
    {
    return "Book Title: " + title + ", Price: $" + price + "\n" +
           (writer != null ? writer.toString() : "Author: Unknown");
    }

    /*
    * This is the getter for the Book's title.
    */
    public String getTitle()
    {
        return title;
    }

    /*
    * This is the getter for the Book's price.
    * @return - the price of the book
    */
    public double getPrice()
    {
        return price;
    }
}