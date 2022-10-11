package bai2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 6", "Skyactiv 6");
//        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 3", "Skyactiv 3");
        Car car3 = new Car("Mazda 3", "Skyactiv 3");
        Car car4 = new Car("Mazda 3", "Skyactiv 3");
        Car car5 = new Car("Mazda 3", "Skyactiv 3");
        Car car6 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
    }
}
