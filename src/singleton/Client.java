package singleton;

public class Client {
    public static void main(String[] args) {
        EagerSingletone e1 = EagerSingletone.getInstance();
        EagerSingletone e2 = EagerSingletone.getInstance();

        System.out.println(e1 == e2 );
    }
}
