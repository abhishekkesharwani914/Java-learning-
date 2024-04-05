class A1 {
    int i = 10;

    A1() {
        System.out.println("Base class 1 constructor is invoked");
    }

    void message() {
        System.out.println("this is the super class message");
    }
}

class A2 extends A1 {
    int i = 20;

    A2() {
        super();
        System.out.println("Base class 2 constructor is invoked");

    }

    void message() {
        System.out.println("this is the calling class message");
    }

    void display() {
        super.message();
        message();
    }

    void show() {
        System.out.println("value of super i is :" + super.i);
        System.out.println("value of not super i is :" + i);
    }
}

public class SuperKeyword {

    public static void main(String args[]) {
        A2 obj = new A2();
        obj.show();
        obj.display();
    }
}
