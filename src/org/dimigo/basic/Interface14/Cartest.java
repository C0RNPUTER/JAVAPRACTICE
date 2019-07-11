package org.dimigo.basic.Interface14;

public class Cartest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new BenzEngine());
        car.start();
        car.stop();
        System.out.println("=== 엔진 교체 ===");
        car.setEngine(new BmwEngine());
        car.start();
        car.stop();
    }
}
