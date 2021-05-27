package by.voloshchuk.factory_method;

public class PlaneFactory implements Factoryable {

    @Override
    public Transportable create() {
        return new Plane();
    }

}
