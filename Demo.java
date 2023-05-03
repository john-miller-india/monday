
public interface Demo {

    public default void run() {

        System.out.println("my name is ankit");
    }

    public abstract void circle();
//    public abstract void demo();

    public static void hello() {
        System.out.println("i am in hello");
    }
    public static String meta()
    {
        return "Facebook";
    }

}
