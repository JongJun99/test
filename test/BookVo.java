package test;

public class BookVo {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookVo() {}

    public BookVo(String title, String publisher, String author){   //필드값 3개 초기화 필드값출력
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookVo(String title, String publisher, String author, int price, double discountRate){   //모든 필드초기화 및 필드값 출력
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price =  price;
        this.discountRate = discountRate;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    //getter
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void reuslt() {
        System.out.println(title + ", " + publisher + ", " + author + ", " + price + ", " + discountRate);
    }
}
