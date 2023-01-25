public class Main {
    public static void main(String[] args){
        Fitness person1 = new Fitness("Bob", "bobi@gmail.com", "+4636643346", 24, 7, 1987, "Sap", 86.5, 120.80, 5);
        Fitness person2 = new Fitness("Jon", "jony@gmail.com", "+3804456778", 13, 3, 1993, "Ceana", 103, 125.64, 3);
        Fitness person3 = new Fitness("Steve", "steve@gmail.com", "+3805672239", 17, 10, 1991, "Rocket", 95.6, 120.70, 7);
        person1.printAccountInfo();
        person2.printAccountInfo();
        person3.printAccountInfo();

        person1.setVoltage(100);
        person1.setNumberOfStepsTakenPerDay(20);
        person2.setLastname("Not Ceana");
        person2.setWeight(200);

        person1.printAccountInfo();
        person2.printAccountInfo();

    }
}