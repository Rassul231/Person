package Work;
class person implements payable, Comparable<person> {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;

    public person() {
        this.id = idCounter++;
    }

    public person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return String.format("%s: %d. %s %s", getPosition(), id, name, surname);
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

    @Override
    public int compareTo(person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
