package singleton;

public class StaticBlockInitialization {

    private static StaticBlockInitialization staticBlockInitialization;

    static {
        try{
            staticBlockInitialization  = new StaticBlockInitialization();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private StaticBlockInitialization() {

    }

    public static StaticBlockInitialization getInstance() {
        return staticBlockInitialization;
    }

    public void singletonTest() {
        System.out.println("Static Block initialization calisti");
    }
}
