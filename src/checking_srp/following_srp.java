package srp;

class Emp {
    String name = "CHAAR DIwaari";
    double sal = 101;
}

class Calc {
    double getSal(double sal) {
        return sal + (0.1 * sal);
    }
}

class Show {
    void print(String name, double sal) {
        System.out.println(name + ": " + sal);
    }
}

public class following_srp {
    public static void main(String[] args) {
        Emp e = new Emp();
        Calc c = new Calc();
        Show s = new Show();
        double total = c.getSal(e.sal);
        s.print(e.name, total);
    }
}