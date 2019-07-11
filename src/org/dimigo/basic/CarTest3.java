package org.dimigo.basic;

public class CarTest3 {
    public static void main(String[] args) {
        Car3 car1 = new Car3("현대기아자동차","제네시스","검정색",225,50000000);
        Car3 car2 = new Car3("기아현대자동차","K7","흰색",246);
        Car3 car3 = new Car3("르노자동차","SM7","회색");

        System.out.println("<< 자동차 목록>>");

        car3.printCarInfo(car1);
        System.out.println();
        car3.printCarInfo(car2);
        System.out.println();
        car3.printCarInfo(car3);

    }

}
