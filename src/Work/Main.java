package Work;
import java.util.ArrayList;
import java.util.Collections;
// Interface defining a method to get the payment amount.
interface payable {
    double getPaymentAmount();
}

public class Main {
    // Creating a list to store person objects.
    public static void main(String[] args) {
        ArrayList<person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("Winston", "Churchill", "", 9999998.00));
        peopleList.add(new Employee("Rassul", "Satpekov", "Programmer", 9999999.00));
        peopleList.add(new Student("Alex", "Sina", 1.4));
        peopleList.add(new Student("Patrick", "Star", 2.7));
        peopleList.add(new Employee("Berik", "Zhaba", "Drifter", 210000.00));

        // Sort each person by they earn
        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<person> people) {
        // Printing information about each person from toStrings
        for (person person : people) {
            System.out.println(person.toString());
        }
    }
}
