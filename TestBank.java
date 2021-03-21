public class TestBank {
    public static void main(String[] args){
        Bank b1 = new Bank(1000,10);
        System.out.printf("%.1f",b1.calculateInterest());
    }
}
