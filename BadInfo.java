public class BadInfo {
    private int age;
    private String firstName;
    private String lastName;
    private String birthCity;

    public BadInfo(int age, String firstName, String lastName, String birthCity) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthCity = birthCity;
    }

    public void printInfo() {
        System.out.println("My Name is " + firstName + " " + lastName + ".");
        System.out.println("I am " + age + " years old and was born in " + birthCity + ".");
    }

    public static void main(String[] args) {
        BadInfo person = new BadInfo(twenty, 7, "Avise", "India");
        person.printInfo();
    }
}
