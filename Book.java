import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String address;
    private String status;
    private int qty;
    private double price;
    private int brwcopies;

    public Book() {
    }

    public Book(String name, String author, String publisher, String address, int qty, double price, int brwcopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.qty = qty;
        this.price = price;
        this.brwcopies = brwcopies;
    }

    public String toString() {
        String text = "Book Name : " + name + "Book Author: " + author +
                "Book Publisher: " + publisher + "Book Collection Address: " + address + "Qty: " + String.valueOf(qty)
                + "Price: " + String.valueOf(price) + "Borrowing Copies: " + String.valueOf(brwcopies);

        return text;
    }

    public String getName(){
        return name;
    }

}
