package by.voloshchuk.factory.method;

public class Runner {
    public static void main(String[] args) {
        Factoryable planeFactory = new PlaneFactory();
        Factoryable carFactory = new CarFactory();
        System.out.println(createTransport(planeFactory).getClass());
        System.out.println(createTransport(carFactory).getClass());
    }

    private static Transportable createTransport(Factoryable factoryable) {
        return factoryable.create();
    }

}
