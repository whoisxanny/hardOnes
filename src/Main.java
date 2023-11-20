public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Task 1");

        int age = 19;
        double salary = 50_000d;
        double offer = 0d;

        if (age >= 23) {
            offer = salary * 3;
        } else {
            offer = salary * 2;
        }

        if (salary > 50000) {
            offer *= 1.2;
        } else if (salary >= 80000) {
            offer *= 1.8;
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом - " + offer + " тысяч рублей");
        System.out.println();
    }

    public static void task2() {
         int age = 25;
         double salary = 60000d;
         int wantedSum = 330000;
         double percentRage = 0.10d;
         int creditLength = 12;
         double maxPayment = salary/2;

        if (age < 23) {
            percentRage = percentRage + 0.01d;
        } else if (age < 30) {
            percentRage = percentRage + 0.01d;
        } else if (salary > 80000d) {
            percentRage = percentRage - 0.07d;
        }

        double needblePayment = wantedSum*(1 + percentRage)/12;

        if (maxPayment < needblePayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + needblePayment + "рублей. Отказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + needblePayment + "рублей. Одобрено");
        }

    }
}