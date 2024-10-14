package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear) {
        bookList.add(new Book(title, author, publicationYear));
    }

    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();

        if(!bookList.isEmpty()) {
            for( Book book : bookList ) {
                if(book.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(book);
                }
            }
        }

        return booksByAuthor;

    }

    public List<Book> findByYearRange(int initialYear, int finalYear) {

        List<Book> booksByYearRange = new ArrayList<>();

        if(! bookList.isEmpty()) {
            for (Book book : bookList ) {
                if(book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear) {
                    booksByYearRange.add(book);
                }
            }
        }
        return booksByYearRange;
    }
    
    public Book findByTitle( String title) {
        
        Book findedBook = null;
        if(! bookList.isEmpty()) {
            for (Book book : bookList ) {
                if( book.getTitle().equalsIgnoreCase(title)) {
                    
                    findedBook = book;
                    break; 

                }
            }
        }
        
        return findedBook;
    }

    public static void main(String[] args) {

        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("Book One", "Author One", 2020);
        bookCatalog.addBook("Book One", "Author Two", 2021);
        bookCatalog.addBook("Book Two", "Author Two", 2022);
        bookCatalog.addBook("Book Three", "Author Three", 2023);
        bookCatalog.addBook("Book Four", "Author Four", 1994);

        System.out.println( bookCatalog.findByAuthor("Author Two"));
        System.out.println( bookCatalog.findByYearRange(2020, 2021));
        System.out.println( bookCatalog.findByTitle("Book One"));
    }

}
