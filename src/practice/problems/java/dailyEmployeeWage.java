package practice.problems.java;

public class dailyEmployeeWage {

        public void employeeWage() {
            int hour = 8;
            int wage = 20;
            System.out.println("Daily Wage of Employee: "+(hour*wage));
        }

        public static void main(String[] args) {

            dailyEmployeeWage employee = new dailyEmployeeWage();
            employee.employeeWage();
        }


}
