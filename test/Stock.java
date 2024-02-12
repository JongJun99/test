package test;

public class Stock {
    protected String name;
    private int price;
    static int volume;
    static double value;

    public Stock() {}   //기본생성자

    public Stock(String name, int price){   //매개변수 생성자
        this.name = name;
        this.price = price;
    }
}
