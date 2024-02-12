package test;

public class Kuromi extends Sanrio{

    private char dollType;
    public Kuromi() {}
    public Kuromi(String name, int price, double size, char dollType) {     //매게변수 생성자
        super(name, price, size);
        this.dollType = dollType;
    }

    public String info(){   //출력메소드
        return super.info() + "인형 타입" + dollType;
    }
}
