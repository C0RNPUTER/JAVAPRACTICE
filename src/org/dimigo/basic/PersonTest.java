package org.dimigo.basic;

public class PersonTest {
    public static void main(String[] args) {
        Person[] p = {
            new Korean("홍길동"),
            new Japanese("다나카"),
            new Chinese("왕밍")
        };

        for( Person person : p){
            greeting(person);
        }
    }

    private static void greeting(Person person) {
        System.out.println(person);
        person.sayHello();
        person.sayBye();
        System.out.println();
    }
}
