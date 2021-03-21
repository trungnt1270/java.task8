public class TestCasting {
    public static void main(String[] args){
        A a1 = new C(); // upcast
        System.out.println(a1);
        B b1 = (B)a1; // downcast okay
        System.out.println(b1);

        C c1 = (C)b1; // downcast okay
        System.out.println(c1);

        A a2 = new B();
        System.out.println(a2);

        B b2 = (B)a2; // downcast okay
        C c2 = (C)a2;
        //compilation okay but runtime error:
        //java.lang.ClassCastException: class B cannot be cast to class C

    }
}
