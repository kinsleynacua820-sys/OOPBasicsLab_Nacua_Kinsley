import java.util.Scanner;
// Activity 1 and 2
class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

}
// Activity 3
class Vehicle {
    private String brand;
    private String model;
    private double speed;

    public Vehicle(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    public void accelerate(double increment) {
        speed += increment;
    }
    public void displayStatus() {
        System.out.println("Vehicle Status:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println();
    }

}
// Activity 4
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public void displayBalance() {
        System.out.println("Balance: " + balance);
        System.out.println();
    }

}
// Activity 5
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println();
    }

}

public class OOPBasicsLab {
    public static void main(String[] args) {

        // Activity 1 & 2
        Student s1 = new Student("Kinsley", 19, 1.0);
        Student s2 = new Student("Kuya Jeven", 28, 1.0);

        s1.displayInfo();
        s2.displayInfo();

        // Activity 3
        Vehicle car = new Vehicle("Porsche", "911 gt3 rs", 296);
        car.displayStatus();
        car.accelerate(20);

        // Activity 4
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount("Kinsley", 0);
           System.out.println("Bank account:");

            System.out.print("Enter amount to deposit: ");
            account.deposit(input.nextDouble());

            System.out.print("Enter amount to withdraw: ");
            account.withdraw(input.nextDouble());

            account.displayBalance();

        // Activity 5
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(10.0);

        c1.displayDetails();
        c2.displayDetails();

        input.close();

    }
}
