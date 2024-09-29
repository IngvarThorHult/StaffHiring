import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current staff number: ");
        int staffNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the staff hiring location: ");
        String staffLocation = scan.nextLine();
        var sh = new StaffHiring(staffNumber, staffLocation);
        sh.printStaffHiring();
    }
}