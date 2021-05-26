package by.voloshchuk.factory.method;

public class CarFactory implements Factoryable {

    @Override
    public Transportable create() {
        return new Car();
    }

}
