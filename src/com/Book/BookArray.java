import LibraryCollection.Books;
import java.util.ArrayList;
import java.util.List;

public class BookArray {
    static List<Book> booksList = new ArrayList<Book>();
    public static void main(String[] args){
        Book books;
        books=new Fiction("Beloved");
        booksList.add(books);
        books=new NonFiction("Silent spring");
        booksList.add(books);
        books=new Fiction("FuictionBook2");
        booksList.add(books);
        books=new Fiction("FuictionBook3");
        booksList.add(books);
        books=new Fiction("FuictionBook4");


    }

}
