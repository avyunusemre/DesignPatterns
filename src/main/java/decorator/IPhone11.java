package decorator;

public class IPhone11 extends PhoneDecorator{
    public IPhone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return basicPhone.getName() + " 11";
    }


}
