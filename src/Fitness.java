public class Fitness {
    private String name;
    private String email;
    private String phone;
    private int day;
    private int month;
    private int year;
    private String lastname;
    private double weight;
    private double voltage;
    private int numberOfStepsTakenPerDay;
    private int age;

    public Fitness(String name, String email, String phone, int day, int month, int year, String lastname, double weight, double voltage, int numberOfStepsTakenPerDay) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.day = day;
        this.month = month;
        this.year = year;
        this.lastname = lastname;
        this.weight = weight;
        this.voltage = voltage;
        this.numberOfStepsTakenPerDay = numberOfStepsTakenPerDay;
        countAge();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public int getNumberOfStepsTakenPerDay() {
        return numberOfStepsTakenPerDay;
    }

    public void setNumberOfStepsTakenPerDay(int numberOfStepsTakenPerDay) {
        this.numberOfStepsTakenPerDay = numberOfStepsTakenPerDay;
    }

    public int getAge() {
        return age;
    }

    private void countAge() {
        age = 2020 - getYear();
    }

    public void printAccountInfo() {
        System.out.println(
                "Ваше имя: " + getName() + " " +
                        "Ваша фамилия: " + getLastname() + " " +
                        "Ваш номер телефона: " + getPhone() + " " +
                        "Ваша дата рождения: " + getDay() + " " + getMonth() + " " + getYear() + " " +
                        "Ваш имейл: " + getEmail() + " " +
                        "Ваш вес: " + getWeight() + " " +
                        "Ваше давление: " + getVoltage() + " " +
                        "Количество пройденных за день шагов: " + getNumberOfStepsTakenPerDay() + " " +
                        "Ваш возраст :" + getAge()
        );
    }

}