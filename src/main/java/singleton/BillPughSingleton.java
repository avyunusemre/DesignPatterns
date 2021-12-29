package singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static class SingletonHelper {

        private static final  BillPughSingleton INSTANCE = new BillPughSingleton();

    }

    public void singletonTest() {
        System.out.println("Bill Pugh Singleton calisti");
    }
}
