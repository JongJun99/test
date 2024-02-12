package test;

public class Sanrio {
    private String name;    //굿즈명
    private int price;
    private double size;

    public Sanrio(){}   //기본생성자

    public Sanrio(String name, int price, double size){     //매개변수 생성자
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String info(){   //출력메소드
        return "캐릭터 :" + name + "가격 :" + price + "사이즈 :" + size;
    }
}
