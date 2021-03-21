import javax.xml.namespace.QName;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        number = 0;
        destination = "";
    }

    public Flight(int number, String destination){
        if(number>0){
            this.number = number;
            this.destination = destination;
        } else {
            this.number = 0;
            this.destination = "";
        }
    }

    public void display(){
        System.out.println(number + ", " + destination);
    }

    public String getDestination(){
        return destination;
    }

    public int getNumber(){
        return number;
    }
}
