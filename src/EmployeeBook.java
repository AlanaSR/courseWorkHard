public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    //   public Employee[] employees = new Employee[10];
    public void addEmployee(String name, int department, int salary) {
        Employee employee = new Employee(name, department, salary);
    }

    public boolean addNewEmployee(Employee newEmployee) {
        boolean result = false;
        for (Employee employee : employees) {
            if (employee == null) {
                employee = newEmployee;
                result = true;
            }
        }
        return result;
    }

    public double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public double minSalary() {
        double minSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                final double salary = employees[i].getSalary();
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public double maxSalary() {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                final double salary = employees[i].getSalary();
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    public int size() {
        int size = 0;
        for (Employee employee : employees)
            if (employee != null) {
                size++;
            }
        return size;
    }


    public double midSalary() {
        double midSalary = 0;
        for (Employee employee : employees) {
            if (employees != null) {
                midSalary = sumSalary() / size();
            }
        }
        return midSalary;
    }

    public void printNamesEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }

    public void printEmployee() {
        for (Employee employee : employees) {
            if (employees != null) {
                System.out.println(employee);
            }
        }
    }

    public void removeEmployee(int id) {
        employees[id] = null;
    }

    public void salaryIndexationForDepart(int department, double indexation) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employees != null) {
                double currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (indexation / 100f + 1)));
            }
        }
    }

    public void salaryIndexation(double indexation) {
        for (Employee employee : employees) {
            if (employees != null) {
                double currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (indexation / 100 + 1)));
            }
        }
    }

    public double employeeWithMinSalary(int department) {
        double minSalary = 99999999;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i] != null) {
                final double salary = employees[i].getSalary();
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public double employeeWithMaxSalary(int department) {
        double maxSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i] != null) {
                final double salary = employees[i].getSalary();
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    public double departmentSumSalary(int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }


    public double departmentMidSalary(int department) {
        return departmentSumSalary(department) / size();
    }

    public void printEmployeeWithoutDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employees != null) {
                System.out.println("Сотрудник: " + employee.getName() + " " + employee.getSalary() + " " + employee.getId());
            }
        }
    }

    public void printEmployeeWithSalaryLessThen(int salaryLimit) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salaryLimit && employees != null) {
                System.out.println("Сотрудник: " + employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public void printEmployeeWithSalaryMoreThen(int salaryLimit) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salaryLimit && employees != null) {
                System.out.println("Сотрудник: " + employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

//        public void addEmployee (String employeeName, String department,int salary){
//          if (staff >= employees.length) {
//            System.out.println("Штат полон, нельзя добавить сотрудника.");
}
//      Employee newEmployees = new Employee(employeeName, department, salary);
//    employees[++staff] = newEmployees;
//}

//}
