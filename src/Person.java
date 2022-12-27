public class Person {
    public static String personInfo(String firstname, String secondname, String city, String phone) {
        return "Зателефонувати громадянинові" + " " + firstname + " " + secondname + " " + "з міста" + " " + city + " " + "можна за номером" + " " + phone;
    }
    public static void main(String[] args) {
        Person person = new Person();
        String firstPerson = person.personInfo("Will","Smith", "New York", "2936729462846");
        String secondPerson = person.personInfo("Jackie","Chan", "Shanghai", "12312412412");
        String thirdPerson = person.personInfo("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
    }
}