package qwerty.pratice2;

public class EUR extends Money{

    {
        unit = "유로";
        notified = 1433.8;
        buy = 1462.64;
        rate = 80;
        limit = 7000;
    }

    public EUR() {
        super("유로", 1433.8, 1462.64, 80, 7000);
    }
}
