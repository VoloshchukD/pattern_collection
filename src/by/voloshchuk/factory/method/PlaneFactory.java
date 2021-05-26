package by.voloshchuk.factory.method;

public class PlaneFactory implements Factoryable {

    @Override
    public Transportable create() {
        return new Plane();
    }

}
