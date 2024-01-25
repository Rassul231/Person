package Work;
import java.util.ArrayList;
import java.util.Collections;

interface payable {
    double getPaymentAmount();
}

public class Main {
    public static void main(String[] args) {
        ArrayList<person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("Alex", "Sina", "Driver", 320000.00));
        peopleList.add(new Employee("Rassul", "Satpekov", "Programmer", 9999999.00));
        peopleList.add(new Student("Norman", "", 1.4));
        peopleList.add(new Student("Rasmazan", "Horosh", 2.7));


        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<person> people) {
        for (person person : people) {
            System.out.println(person.toString());
        }
    }
}