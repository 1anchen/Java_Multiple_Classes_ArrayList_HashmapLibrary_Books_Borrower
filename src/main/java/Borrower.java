import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        collection = new ArrayList<>();

    }


    public int countBook() {
        return this.collection.size();
    }

    public void borrowBook(Book book) {
        this.collection.add(book);
    }
}
