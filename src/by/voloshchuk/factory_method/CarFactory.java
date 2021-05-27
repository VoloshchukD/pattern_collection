package by.voloshchuk.factory_method;

public class CarFactory implements Factoryable {

    @Override
    public Transportable create() {
        return new Car();
    }

}
