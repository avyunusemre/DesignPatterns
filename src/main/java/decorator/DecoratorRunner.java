package decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone phone = new IPhone11ProMax(new IPhone());

        System.out.println("Name : " + phone.getName());
        System.out.println("Price: " + phone.getPrice());
        System.out.println("Camera: " + phone.getCameraCount());

        Phone phone2 = new IPhone11Pro(new IPhone());

        System.out.println("Name : " + phone2.getName());
        System.out.println("Price: " + phone2.getPrice());
        System.out.println("Camera: " + phone2.getCameraCount());


    }
}
