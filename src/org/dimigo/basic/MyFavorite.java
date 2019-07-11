package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String[] questions = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "};
        String[] answer = {"아이유", "원빈", "자료구조"};
        StringBuilder answerprint = new StringBuilder();
        answerprint.append(questions[0]).append(answer[0]).append("입니다.\n").append(questions[1]).append(answer[1]).append("입니다.\n").append(questions[2]).append(answer[2]).append("입니다.");
        while(true){
            System.out.println("--------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.print("메뉴 선택 => ");
            int a = s.nextInt();
            int b = r.nextInt(12345) % 3;
            if(a==1){
                System.out.print(questions[b]);
                String getanswer = s.next();
                if(getanswer.equals(answer[b])){
                    System.out.println("정답입니다!");
                }
                else{
                    System.out.println("틀렸습니다!");
                }
            }
            else if(a==2){
                System.out.println("<< 정답 출력 >>");
                System.out.println(answerprint);
            }
            else if(a==9){
                System.out.println("Bye~");
                s.close();
                break;
            }
            else{
                System.out.println("없는 메뉴입니다.");
            }
        }
    }
}
