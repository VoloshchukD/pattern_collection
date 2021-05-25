package by.voloshchuk.strategy;

public class Runner {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.leadWay(new RoadRoute());
        navigator.leadWay(new WalkingRoute());
    }
}
