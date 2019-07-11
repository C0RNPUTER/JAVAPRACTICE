package org.dimigo.basic;

public class IUprofile {
    public static void main(String[] args){
        String name = "아이유";
        boolean isMale =  false;
        int age = 25;
        double height = 161.8;
        float weight = 44.3f;
        char bloodType = 'A';
        String titleSong = "삐삐";
        System.out.println("<< 아이유 프로필 >>");
        System.out.println("이름 : "+name);
        System.out.printf("성별 : ");
        System.out.println(isMale ? "남자" : "여자");
        System.out.println("나이 : " + age+"세");
        System.out.println("키 : " + height+"cm");
        System.out.println("몸무게 : " + weight + "kg");
        System.out.println("혈액형 : "  +bloodType + "형");
        System.out.println("대표곡 : " + titleSong);
    }
}
