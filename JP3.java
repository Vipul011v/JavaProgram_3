class Company {
    void HR() {
        System.out.println("Require software tester.");
    }
}

class Employee extends Company {
    void Salary() {
        System.out.println("I want 8LPA");
    }
}

public class JP3 {
    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        myEmployee.HR();  
        myEmployee.Salary(); 
    }
}
