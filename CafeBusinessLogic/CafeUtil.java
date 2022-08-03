import java.util.ArrayList;


public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for (int i = 1; i<11; i++) {
            sum += i; 
        }
        return sum;
    }


    public double getOrderTotal(double[] lineItems){
        double total = 0;
        for(double i = 0; i<lineItems.length; i++){
            total += lineItems[(int) i];
        }
            return total;
    }

    public void displayMenu(ArrayList<String>menuItems){
        for (int i=0; i<menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please add your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName + " 'unt some coffe?");
        System.out.println("There are" + "this many" + customers.size() + "Ahead of you");
        customers.add(userName);
        System.out.println(customers);
    }

}






