import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;
        private Book book;

        @Before
        public void setUp(){
                library = new Library(3);
                book = new Book("Lord of the Rings", "J.R.R Tolkien", "Fantasy");
        }

        @Test
        public void libraryStartsEmpty(){
                assertEquals(0, library.bookCount());
        }

        @Test
        public void libraryCanAddBook(){
                library.addToCollection(book);
                assertEquals(1, library.bookCount());
        }

        @Test
        public void libraryCantAddBeyondCapacity(){
                library.addToCollection(book);
                library.addToCollection(book);
                library.addToCollection(book);
                library.addToCollection(book);
                assertEquals(3, library.bookCount());
        }
}
