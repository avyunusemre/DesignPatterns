package singleton;

import factory.FileExporterFactory;

public class Runner {
    public static void main(String[] args) {

        EagerInitialization.getInstance().singletonTest();
        StaticBlockInitialization.getInstance().singletonTest();
        LazyInitialization.getInstance().singletonTest();
        ThreadSafeSingleton.getInstance().singletonTest();
        BillPughSingleton.getInstance().singletonTest();

        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL)
                .export("Test context");

        System.out.println(file);
    }
}
