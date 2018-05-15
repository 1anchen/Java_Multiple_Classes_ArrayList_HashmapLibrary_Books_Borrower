import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;
    private Book book1, book2, book3;
    private Borrower yang;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("IntroToJava","Education");
        book2 = new Book("LearnRuby","Education");
        book3 = new Book("1984","Fiction");
        yang = new Borrower();
    }
    @Test
    public void canCountBook(){
        assertEquals(0,library.countBook());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1,library.countBook());
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(2,library.checkCapacity());
    }

    @Test
    public void canCheckStock(){
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(2,library.countBook());
    }

    @Test
    public void canCheckStockReachMaxValue(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(4,library.countBook());
    }

    @Test
    public void canLoanOutBook(){
        library.addBook(book1);
        library.addBook(book1);
        yang.borrowBook(book1);
        library.loanOutBook();
        assertEquals(1,library.countBook());
        assertEquals(1,yang.countBook());

    }

    @Test
    public void canAccessGenre() {
        assertEquals(0,library.accessGenre("Education"));
    }

    @Test
    public void canCheckGenre(){
        library.checkGenre(book1.checkGenreType());
        assertEquals(1,library.accessGenre("Education"));
    }

    @Test
    public void canCheckGenreWithTwoBooks(){
        library.checkGenre(book1.checkGenreType());
        library.checkGenre(book2.checkGenreType());
        assertEquals(2,library.accessGenre("Education"));
    }

    @Test
    public void canCheckGenreWithThreeBooks(){
        library.checkGenre(book1.checkGenreType());
        library.checkGenre(book2.checkGenreType());
        library.checkGenre(book3.checkGenreType());
        assertEquals(2,library.accessGenre("Education"));
        assertEquals(1,library.accessGenre("Fiction"));
    }


}
