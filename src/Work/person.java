package Work;
class person implements payable, Comparable<person> {
    private static int idCounter = 1;
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
    public double getPaymentAmount() {
        return 0.0;
    }
    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return getPosition() + ": " + id + ". " + name + " " + surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int compareTo(person o) { // salary comparison
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
