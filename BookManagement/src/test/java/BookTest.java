import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void checkBookTitle(){
        Book OldManAndOcean = new Book("Ernest Hemingway", "The Old Man and the Sea");
        assertEquals(OldManAndOcean.getTitle(), "The Old Man and the Sea");
    }

    @Test
    public void checkBookAuthor(){

    }
}