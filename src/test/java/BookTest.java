import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;


    @Before
    public void before(){
        book1 = new Book("IntroToJava","Education");
    }

    @Test
    public void canCheckBookName(){
        assertEquals("IntroToJava",book1.checkBookName());
    }

    @Test
    public void canCheckGenreType(){
        assertEquals("Education",book1.checkGenreType());
    }

}
