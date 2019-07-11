package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class VerySimipleGameProgram {
    public static void main(String[] args) {
        int[] attackPoint = {100, 100, 100, 100};
        String[] character = {"마법사", "영주", "기사", "농민"};
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int a=0 , b = 5;
        do {
            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.print("메뉴 입력 => ");
            a = s.nextInt();

            switch(a){
                case 1:
                    b = r.nextInt(12345) % 4;
                    System.out.println(character[b]+"(으)로 선택되었습니다.");
                    break;
                case 2:
                    if(b == 5)
                        System.out.println("캐릭터를 먼저 선택하세요!!");
                    else {
                        attackPoint[b] += 10;
                        System.out.println(character[b] + " 공격력이 증가되었습니다. 현재 공격력 : " + attackPoint[b]);
                    }
                    break;
                case 3:
                    if(b==5)
                        System.out.println("캐릭터를 먼저 선택하세요!!");
                    else{
                        if(attackPoint[b] - 10 <=0) {
                            attackPoint[b] = 0;
                            System.out.println(character[b] + " 공격력이 감소되었습니다. 현재 공격력 : " + attackPoint[b]);
                        }
                        else {
                            attackPoint[b] -= 10;
                            System.out.println(character[b] + " 공격력이 감소되었습니다. 현재 공격력 : " + attackPoint[b]);
                        }
                    }
                    break;
                case 9:
                    System.out.println("아직 수령하지 않은 보상이 있습ㄴㅣㄷ...");
                    s.close();
                    break;
                default:
                    System.out.println("없는 메뉴입니다!!");
            }
        }while(a != 9);{
        }
    }
}
