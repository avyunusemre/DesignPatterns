package singleton;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if(lazyInitialization == null) {
            lazyInitialization = new LazyInitialization();
        }

        return lazyInitialization;
    }

    public void singletonTest() {
        System.out.println("Lazy initialization calisti");
    }

}
