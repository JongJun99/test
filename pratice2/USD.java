package qwerty.pratice2;

public class USD extends Money{

    {
        unit = "미국달러";
        notified = 1331.6;
        buy = 1355.31;
        rate = 90;
        limit = 10000;
    }

    public USD() {
        super("미국달러", 1331.6, 1355.31, 90, 10000);
    }
}
