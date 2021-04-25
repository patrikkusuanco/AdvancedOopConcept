public class UseBook {


    public static void main(String[] args){
        Book books;
        books=new Fiction("Beloved");
        System.out.println(books.gettitle());
        books=new NonFiction("Silent spring");
        System.out.println(books);


    }
}
