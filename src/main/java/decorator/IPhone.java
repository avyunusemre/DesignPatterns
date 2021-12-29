package decorator;

public class IPhone implements Phone{

    protected IPhone() {

    }

    @Override
    public String getName() {
        return "IPhone";
    }

    @Override
    public int getCameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 699.90;
    }
}
