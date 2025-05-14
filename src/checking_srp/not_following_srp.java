package srp;

class BadEmp {
    String name = "EDA";
    double sal = 20000;

    void show() {
        double total = sal + (0.1 * sal);
        System.out.println(name + ": " + total);
    }
}

public class not_following_srp {
    public static void main(String[] args) {
        BadEmp b = new BadEmp();
        b.show();
    }
}