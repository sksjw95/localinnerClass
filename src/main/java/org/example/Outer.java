package org.example;

public class Outer {// 외부 클래스
    int num = 5; // 인스턴스 변수
    void test(){
        int num2 = 6; // 지역변수
        class LocalInClass{// 지역 내부 클래스
            void getPrint(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }

}

