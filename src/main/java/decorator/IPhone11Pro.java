package decorator;

public class IPhone11Pro extends PhoneDecorator {
    public IPhone11Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return basicPhone.getName() + "11 Pro";
    }

    @Override
    public int getCameraCount() {
        return basicPhone.getCameraCount() + 1;
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice() + 100;
    }
}
