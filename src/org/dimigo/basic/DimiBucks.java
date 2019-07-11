package org.dimigo.basic;

public class DimiBucks {
    public static void main(String[] args) {
        long month = 1700000;
        long staff = 3;
        long store = 1500;
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.println(String.format("월 평균 급여 : %,d원", month));
        System.out.println("점포 내 직원 수 : "+staff+"명");
        System.out.println(String.format("점포 수 : %,d개", store));
        long year = month*staff*store*12;
        System.out.printf("\n연간 인건비 : %,d원",year);
    }
}
