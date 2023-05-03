public class Jocker implements Demo {

    @Override
    public void run() {
        System.out.println("i am in run method");
    }

    @Override
    public void circle() {
        System.out.println(" I am in Circle method");
    }

    public static void main(String[] args) {
        Demo d = new Jocker();
        d.circle();
        d.run();
        Demo.hello();
        Demo.meta();
    }
}
