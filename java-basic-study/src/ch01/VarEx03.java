package ch01;

//MyVar은 클래스 자료형 => 개발자가 만드는 커스텀 자료형
//여러가지 데이터를 가지고 있는 클래스를 Beans라고 부름.
class MyVar{
    static int n1=10;
    char c1='A';
}
class MyVar2{
    static int n1=10;
    char c1='A';
}

public class VarEx03 {
    static int num=500;

    public static void main(String[] args) {
        System.out.println(MyVar.n1);
        System.out.println(VarEx03.num);
        System.out.println(MyVar2.n1);
    }
}
