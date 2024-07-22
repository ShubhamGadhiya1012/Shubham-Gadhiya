package homework;

 class Author {
    private String firstName;
    private String lastName;

    // Constructor with parameters
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Setter for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}


 class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor with parameters
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for author
    public void setAuthor(Author author) {
        this.author = author;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public Author getAuthor() {
        return author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // toString method
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}



public class Question4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Author author = new Author("Russel", "Winder");

	        
	        Book book = new Book("Developing Java Software", author, 79.75);

	       
	        System.out.println(book);
		
	}

}
