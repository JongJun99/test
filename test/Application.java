package test;

public class Application {

    public static void main(String[] args) {


        BookVo bv = new BookVo();
        bv.reuslt();

        BookVo bv1 = new BookVo("자바의 정석", "도우출판", "남궁성");
        bv1.reuslt();

        BookVo bv2 = new BookVo("홍길동전", "활빈당", "허균", 5000000, 0.5 );
        bv2.reuslt();

    }
}
