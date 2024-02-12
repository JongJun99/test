package test;

public class Cinnamoroll extends Sanrio{

    private String goodstype;

    public Cinnamoroll(){}

    public Cinnamoroll(String name, int price, double size, String goodstype){ //매개변수 생성자
        super(name, price, size);
        this.goodstype = goodstype;
    }


    public String info(){   //출력메소드
        return super.info() + "인형타입 :" + goodstype;
    }
}
