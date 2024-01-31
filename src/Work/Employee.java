package Work;
class Employee extends person {
    private String position; // Employee's job
    private double salary; // Employee earn
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
        return ("Employee: " + super.toString()+ " earns "+ getPaymentAmount()+ " tenge ");
    }
}
