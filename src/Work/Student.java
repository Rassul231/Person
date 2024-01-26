package Work;

class Student extends person {
    private double gpa;
    private static final double stipend = 36660.00; // Scholarship is constant and cannot be changed

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        double paymentAmount;  // Declaring a variable paymentAmount

        if (gpa > 2.67) {
            paymentAmount = stipend;  // Assigning a stipend if enough gpa
        } else {
            paymentAmount = 0.0;       // if Student do not have enough gpa he do not have scholarship
        }

        return paymentAmount;
    }

    @Override
    public String toString() {
        return (super.toString()+ " earns "+ getPaymentAmount()+ " tenge ");
    }
}
