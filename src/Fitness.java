public class Fitness {
    private String name;
    private String email;
    private String phone;
    private int day;
    private int month;
    private int year;
    public String lastname;
    public double weight;
    public double voltage;
    public int numberofstepstakenperday;
    public Fitness(String name, String email, String phone, int day, int month, int year, String lastname, double weight, double voltage, int numberofstepstakenperday) {        this.name = name;
        this.email = email;
        this.phone = phone;
        this.day = day;
        this.month = month;
        this.year = year;
        this.lastname = lastname;
        this.weight = weight;
        this.voltage = voltage;
        this.numberofstepstakenperday = numberofstepstakenperday;    }
    public String getName() {
        return name;    }

    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getDay() {
        return day;    }

    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;    }
    private int age;
    public int getAge() {
        if (getAge() < 0) {
            System.out.println("Age is not correct");
        }
        return 2020 - getYear();
    }
    public void printAccountInfo () {
        System.out.println("Ваше имя: " + getName() + " " + "Ваша фамилия: " + lastname + " " + "Ваш номер телефона: " + getPhone() + " " + "Ваша дата рождения: " + getDay() + " " + getMonth() + " " + getYear() + " " + "Ваш имейл: " + getEmail() + " " + "Ваш вес: " + weight + " " + "Ваше давление: " + voltage + " " + "Количество пройденных за день шагов: " + numberofstepstakenperday + " " + "Ваш возраст :" + getAge());
    }
}