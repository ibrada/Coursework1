public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Адамов Денис Андреевич", 1, 140000);
        employees[1] = new Employee("Круговой Данил Владиславович", 2, 125000);
        employees[2] = new Employee("Чистяков Дмитрий Юрьевич", 3, 100000);
        employees[3] = new Employee("Караваев Вячеслав Сергеевич", 4, 170000);
        employees[4] = new Employee("Алип Нуралы Пактович", 5, 138000);
        employees[5] = new Employee("Васильев Дмитрий Алексеевич", 5, 150000);
        employees[6] = new Employee("Сутормин Алексей Сергеевич", 4, 127000);
        employees[7] = new Employee("Ерохин Александр Юрьевич", 3, 145000);
        employees[8] = new Employee("Мостовой Андрей Андреевич", 2, 182000);
        employees[9] = new Employee("Коваленко Александр Игоревич", 1, 167000);

        printSeparator();
        print();
        printSeparator();
        System.out.println("Сумма ЗП: " + sumSalary());
        printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeMaxSalary());
        printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeMinSalary());
        printSeparator();
        System.out.println("Средняя ЗП: " + avrgSalary());
        printSeparator();
        printNames();
        printSeparator();
    }

    private static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            System.out.println(employee);
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    private static Employee employeeMinSalary() {
        Employee employeeMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary)
                minSalary = employee.getSalary();
            employeeMinSalary = employee;
        }
        return employeeMinSalary;
    }

    private static Employee employeeMaxSalary() {
        Employee employeeMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static int avrgSalary() {
        if (employees.length == 0) {
            return 0;
        }
        return sumSalary() / employees.length;
    }

    private static void printNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    private static void printSeparator() {
        System.out.println("* * *");
    }
}
