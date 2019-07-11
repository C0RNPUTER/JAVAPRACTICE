package org.dimigo.basic;

public class PiggyBackTest {
    public static void main(String[] args) {
        FamilyMember fa = new FamilyMember("아빠");
        FamilyMember ma = new FamilyMember("엄마");
        FamilyMember ich = new FamilyMember("나");
        FamilyMember bro = new FamilyMember("남동생");

        ich.printMemberCnt();

        PiggyBank.putMoney(fa, 10000);
        PiggyBank.putMoney(ma, 5000);
        PiggyBank.putMoney(ich, 2000);
        PiggyBank.putMoney(bro, 1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(ich, 1000);
        PiggyBank.printBalance();
    }
}
