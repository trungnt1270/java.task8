public class C extends B{
    public C(){
        super();
        System.out.println("Constructed an instace of C");
    }
    @Override
    public String toString(){
        return "This is C";
    }
}
