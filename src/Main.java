public class Main {
    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook(9);
        employee.addNewEmployee(EmployeeTestList.booker);
        employee.addNewEmployee(EmployeeTestList.economist);
        employee.addNewEmployee(EmployeeTestList.engineer);
        employee.addNewEmployee(EmployeeTestList.engineer1);
        employee.addNewEmployee(EmployeeTestList.engineer2);
        employee.addNewEmployee(EmployeeTestList.mainBooker);
        employee.addNewEmployee(EmployeeTestList.mainEconomist);
        employee.addNewEmployee(EmployeeTestList.mainEngineer);
        employee.addNewEmployee(EmployeeTestList.director);
        employee.printEmployee();
        System.out.println("====================");
        employee.removeEmployee(6);
        employee.printEmployee();
        System.out.println("====================");
        employee.addNewEmployee(EmployeeTestList.teamLid);
        employee.printEmployee();
        System.out.println("====================");


        System.out.println();
        System.out.println("Сумма затрат на ЗП сотрудников " + employee.sumSalary());
        System.out.println("Минимальная зарабодная плата составляет " + employee.minSalary() + " рублей.");
        System.out.println("Максимальная зарабодная плата составляет " + employee.maxSalary() + " рублей.");
        System.out.println("Средняя зарабодная плата составляет " + employee.midSalary() + " рублей.");
        System.out.println();
        employee.printNamesEmployees();
        System.out.println();

        int department = 3;
        double indexation = 10;
        System.out.println("Минимальная зарабодная плата в отделе " + department + " составляет " + employee.employeeWithMinSalary(department));
        System.out.println("Максимальная зарабодная плата в отделе " + department + " составляет " + employee.employeeWithMaxSalary(department));
        System.out.println("Сумма затрат на ЗП сотрудников в отделе " + department + " составляет " + employee.departmentSumSalary(department) + " рублей.");
        System.out.println("Средняя зарабодная плата в отделе " + department + " составляет " + employee.departmentMidSalary(department) + " рублей.");
        System.out.println();
        employee.salaryIndexation(indexation);
        employee.printEmployee();
        System.out.println();
        employee.salaryIndexationForDepart(department, indexation);
        employee.printEmployee();
        employee.printEmployeeWithoutDepartment(department);
        int salaryLimit = 70000;
        System.out.println("=================");
        employee.printEmployeeWithSalaryMoreThen(salaryLimit);
        System.out.println("=================");
        employee.printEmployeeWithSalaryLessThen(salaryLimit);


    }


}


