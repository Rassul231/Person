package Work;
class Employee extends person {
    private String position; // Employee's job
    private double salary; // Employee earn

    public Employee() {
        super();
    }
       // constructor for the Employee
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {  // This method returns the value of the salary.
        return salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s %s earns %.2f tenge", super.toString(), getPosition(),salary);
    }
}
