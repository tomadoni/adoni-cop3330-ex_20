import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int order_amt=0;
	    String state="";
	    String county="";
	    System.out.println("What is the order amount?");
	    order_amt= Integer.parseInt(kb.nextLine());
	    System.out.println("What state do you live in?");
	    state= kb.nextLine();
	    System.out.println("What county do you live in?");
	    county= kb.nextLine();
	    double tax=0;
	    if(state.equals("Wisconsin")){
	        tax=order_amt*0.05;
	        if(county.equals("Dunn")){
	            tax+=order_amt*0.004;
            }
	        else if(county.equals("Eau Claire")){
	            tax+=order_amt*0.005;
            }
        }
	    else if(state.equals("Illinois")){
	        tax=order_amt*0.08;
        }
	    double total= order_amt+tax;
	    System.out.println("The tax is $"+tax+".\n"+"The total is $"+total+".");
    }
}
