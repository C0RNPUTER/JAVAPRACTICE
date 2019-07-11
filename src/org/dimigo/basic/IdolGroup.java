package org.dimigo.basic;

public class IdolGroup {
    public static void main(String[] args) {
        String[] groupName = {"아이즈원", "트와이스", "보라카이 보이즈"};

        String[][] memberName = {
                {"권은비", "미야와키 사쿠라", "강혜원", "최예나", "이채연", "김채원", "김민주", "야부키 나코", "혼다 히토미", "조유리", "안유진", "장원영", },
                {"나봉쓰","정연","모모","사나","지효","미나","다현","채영","쯔위"},
                {"김종수","양재덕","하성봉","허관무"}
        };

        for(int q=0; q<groupName.length;q++){
            System.out.println("<< "+groupName[q]+" >>");
            for(int w=0; w<memberName[q].length;w++){
                System.out.println(memberName[q][w]);
            }
            System.out.println();
        }
    }
}

