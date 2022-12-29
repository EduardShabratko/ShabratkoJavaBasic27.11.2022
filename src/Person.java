public class Person {
    public String firstname;
    public  String lastname;
    public int age;
    public String gender;
    public String address;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String gender) {
        this.firstname = firstname;
        this.gender = gender;
    }

    public Person(String firstname, String lastname, int age, String gender, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person() {
    }
    public void PersonInfo() {
        System.out.println(firstname + "," + lastname + "," + age + "," + gender + "," + address);
    }
    public static void main(String[] args) {
        Person person = new Person("Kola", "Melnik", 24, "Male", "Dobrovolskogo12");
        Person person1 = new Person("Sveta", "Female");
        Person person2 = new Person("Ilia", "Dushnilo", 25);
        Person person3 = new Person();

        Person person4 = new Person();
        person4.age = 36;
        person4.gender = "Male";
        person4.address = "Stambul7";
        person4.firstname = "Vlad";
        person4.lastname = "Seiilin";
        person.PersonInfo();
        person1.PersonInfo();
        person2.PersonInfo();
        person3.PersonInfo();
        person4.PersonInfo();
    }
}