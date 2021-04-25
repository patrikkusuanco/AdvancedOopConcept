public class NonFiction extends Book{

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice(){
        super.mPrice=37.99;
    }
}
