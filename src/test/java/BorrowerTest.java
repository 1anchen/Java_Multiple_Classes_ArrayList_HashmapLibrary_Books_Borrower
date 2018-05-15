import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Book book1;
    private Borrower yang;

    @Before
    public void before(){
         book1 = new Book("IntroToJava","Education");
         yang = new Borrower();

    }

    @Test
    public void canCountBook(){
        assertEquals(0,yang.countBook());
    }

    @Test
    public void canBorrowBook(){
        yang.borrowBook(book1);
        assertEquals(1,yang.countBook());

    }


}
