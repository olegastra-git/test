package seminars.fourth.book;

import org.junit.Test;
import org.mockito.Mockito;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    @Test
    public void testFindBookById() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepositoryMock = Mockito.mock(BookRepository.class);

        // Создание объекта BookService с использованием мок-объекта BookRepository
        BookService bookService = new BookService(bookRepositoryMock);

        // Создание объекта Book для ожидания
        Book expectedBook = new Book("1", "Book1", "Author1");

        // Указываем, что при вызове метода findById("1") должен возвращаться объект expectedBook
        when(bookRepositoryMock.findById("1")).thenReturn(expectedBook);

        // Вызов метода findBookById("1") и проверка, что возвращаемый объект равен expectedBook
        Book actualBook = bookService.findBookById("1");
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void testFindAllBooks() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepositoryMock = Mockito.mock(BookRepository.class);

        // Создание объекта BookService с использованием мок-объекта BookRepository
        BookService bookService = new BookService(bookRepositoryMock);

        // Создание объектов Book для ожидания
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> expectedBooks = Arrays.asList(book1, book2);

        // Указываем, что при вызове метода findAll() должен возвращаться список expectedBooks
        when(bookRepositoryMock.findAll()).thenReturn(expectedBooks);

        // Вызов метода findAllBooks() и проверка, что возвращаемый список равен expectedBooks
        List<Book> actualBooks = bookService.findAllBooks();
        assertEquals(expectedBooks, actualBooks);
    }
}
