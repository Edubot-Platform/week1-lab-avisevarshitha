public class BirthDay {
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public BirthDay(int birthMonth, int birthDay, int birthYear) {
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public void printBirthday(String name, boolean isFriend) {
        String prefix = isFriend ? "my friend " + name + "'s" : "my";
        System.out.println("In the USA " + prefix + " birthday is: " + birthMonth + "/" + birthDay + "/" + birthYear);
        System.out.println("In England " + prefix + " birthday is: " + birthDay + "/" + birthMonth + "/" + birthYear);
    }

    public static void main(String[] args) {
        // Your birthday
        BirthDay myBirthday = new BirthDay(8, 18, 2003);
        myBirthday.printBirthday("", false);

        // Friend's birthday
        BirthDay friendBirthday = new BirthDay(8, 22, 2003);
        friendBirthday.printBirthday("Teja", true);
    }
}

