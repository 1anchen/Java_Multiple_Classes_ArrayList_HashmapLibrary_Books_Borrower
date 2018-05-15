import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> shelf;
    private int capacity;
    private HashMap<String, Integer> genre;
    private int educationBookCount=0;
    private int fictionBookCount=0;

    public  Library(){
        capacity = 4;
        shelf = new ArrayList<>(capacity);
        genre = new HashMap<>();
        genre.put("Education",educationBookCount);
        genre.put("Fiction",fictionBookCount);
    }


    public int countBook() {
        return this.shelf.size();
    }

    public int checkCapacity(){
        return this.capacity;
    }

    public void addBook(Book book) {
        if (this.capacity > this.shelf.size()) {
            this.shelf.add(book);
        }
    }


    public void loanOutBook() {
        this.shelf.remove(0);
    }


    public int accessGenre(String genre) {
        return this.genre.get(genre);
    }

    public void checkGenre(String genre) {

        if (genre.equals("Education")) {
            this.genre.put("Education", ++educationBookCount);
        }
        if (genre.equals("Fiction")) {
            this.genre.put("Fiction", ++fictionBookCount);
        }
    }
}


