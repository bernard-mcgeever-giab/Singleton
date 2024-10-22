
public class Main {
    public static void main(String[] args) {
            Singleton singletonOne = Singleton.getInstance();
            Singleton singletonTwo = Singleton.getInstance();

            System.out.println(singletonOne);
            System.out.println(singletonTwo);
    }
}
