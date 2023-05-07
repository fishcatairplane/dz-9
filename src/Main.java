 public class Main {
    public static void main(String[] args) {
        Man volodymyr = new Man("Volodymyr", "Zelenski", 45);
        Woman olena = new Woman("Olena", "Kiyashko", 45);

        System.out.println("The name of man is: " + volodymyr.getFirstName() + " " + volodymyr.getLastName());
        System.out.println( "The name of woman is: " + olena.getFirstName() + " " + olena.getLastName());

        olena.registerPartnership(volodymyr);
        System.out.println("The name of woman after registration is " + olena.getFirstName() + " " + olena.getLastName());
        System.out.println("The name of " + volodymyr.getFirstName() + "'s partner is " + volodymyr.getPartner().getFirstName());

        olena.deregisterPartnership(true);
        System.out.println("The name of woman after divorce is " + olena.getFirstName() + " " + olena.getLastName());

        String retirementStatusMan = volodymyr.isRetired() ? " is retired" : " is not retired";
        System.out.println(volodymyr.getFirstName() + retirementStatusMan);

        String retirementStatusWoman = olena.isRetired() ? " is retired" : " is not retired";
        System.out.println(olena.getFirstName() + retirementStatusWoman);
    }
}