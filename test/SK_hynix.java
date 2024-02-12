package test;

public class SK_hynix extends Stock{
    //초기화 블록에서 거래량 시가총액 초기화
    static{
        Stock.volume = 5396970;
        Stock.value = 103.9587;
    }
    public SK_hynix(){}     //기본생성자 초기화

    public SK_hynix(String name, int price, double value){  //매개변수 생성자
        super(name, price);     //부모클래스 생성자호출해서 초기화
        Stock.value = value;    //SK_hynix 시가총액 초기화
    }
}
