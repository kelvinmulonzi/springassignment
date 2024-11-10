package Services;

import com.example.library.entity.Book;
import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}