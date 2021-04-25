public abstract class Book {
    String mBookTitle;
    double mPrice;

    public Book(String title ){
        mBookTitle=title;
    }

    public String gettitle(){
        return mBookTitle;
    }

    public double getPrice(){
        return mPrice;
    }

    public abstract void setPrice();
}
