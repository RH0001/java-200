package ch01;

// 프로그램 내에서 실행문 끝에 세미콜론(;)을 빼면 어떤일이 발생할까? 프로그램을 컴파일에서 확인해보자.
public class HelloError {
    public static void main(String[] args) {
        //Error: java: ';' expected
//        System.out.println("첫 Java 프로그램입니다.")
        System.out.println("화면에 출력하고 있습니다.");
    }
}
