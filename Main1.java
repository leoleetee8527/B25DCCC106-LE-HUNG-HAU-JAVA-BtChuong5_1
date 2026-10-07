class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double calculateSalary() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + " | Tuổi: " + age + " | Lương: " + calculateSalary());
    }
}

class OfficeEmployee extends Employee {
    private int workingDays;
    public static final double DAILY_SALARY = 100.0;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return workingDays * DAILY_SALARY;
    }
}

class TechnicalEmployee extends Employee {
    private int workingHours;
    private double hourlyRate;

    public TechnicalEmployee(String name, int age, int workingHours, double hourlyRate) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("Nguyễn Văn A", 28, 22);
        employees[1] = new TechnicalEmployee("Trần Văn B", 30, 160, 15.0);
        employees[2] = new TechnicalEmployee("Lê Thị C", 25, 140, 18.5);

        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}