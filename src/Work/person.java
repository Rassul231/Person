package Work;
class person implements payable, Comparable<person> {
    private static int idCounter = 1; // Crate id for person
    private final int id;
    private String name;
    private String surname;

    public person() {
        this.id = idCounter++; // making unique id for each person
    }

    public person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }
    public double getPaymentAmount() { // basic income for each person is 0.0
        return 0.0;
    }
    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return getPosition() + ": " + id + ". " + name + " " + surname;
    }

    // getter's and setter's
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int compareTo(person o) { // salary comparison
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    } // comparison person by their salary
}

