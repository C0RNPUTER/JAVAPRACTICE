package org.dimigo.basic;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snackArr = new Snack[]{
            new Snack("새우깡","농심",1100,2),
            new Snack("콘칩","크라운",1200,1),
            new Snack("프링글스","켈로그",1500,4)
        };
        System.out.println(snackArr[0].toString());
        System.out.println(snackArr[1].toString());
        System.out.println(snackArr[2].toString());
        System.out.printf("총 구매 금액 : %,d원",snackArr[0].calcPrice()+snackArr[1].calcPrice()+snackArr[2].calcPrice());
        System.out.printf("총 구매 금액 : %,d원",snackArr[0].getPrice()*snackArr[0].getCount()+snackArr[1].calcPrice()+snackArr[2].calcPrice());

    }
}
