package qwerty.pratice1;

public class Application {
    public static void main(String[] args) {

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;

        float e =5.0f;
        double f = 6.0;

        char g = 'A';
        boolean h = true;

        int sum = c + (int)e;

        String result = (sum>=0)? "양수입니다." : "음수입니다.";
        System.out.println("결과값은 ?" + result);

        TestMethod t = new TestMethod();
//        t.Calculator(1,2);

//        t.CircleArea();
        int randomResult = TestMethod.TestRandom();
        System.out.println(randomResult);   //이해가 잘 안감



    }
}
