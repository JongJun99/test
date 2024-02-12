package test;

public class Samsung extends Stock{
    static{
        //초기화 블록에서 거래량 시가총액 초기화
        Stock.volume = 20248727;
        Stock.value = 442.3609;
    }
    public Samsung() {}     //기본생성자

    public Samsung(String name, int price, int volume){     //매개변수 생성자
        super(name, price);     //부모클래스 생성자호출해서 초기화
        Stock.volume = volume;  //samsung 거래량 초기화
    }

}

