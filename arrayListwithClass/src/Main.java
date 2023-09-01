import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers= new ArrayList<Customer>();
        customers.add(new Customer(1,"baybo","demie"));
        customers.add(new Customer(2,"baybars","demie"));
        customers.add(new Customer(3,"arhan","demie"));
        customers.add(new Customer(4,"kadir","demie"));

        for (Customer customer: customers) {
        System.out.println(customer.firstName);
        }


        }

    }


