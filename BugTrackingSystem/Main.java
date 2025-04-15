import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BugDAO dao = new BugDAO();

        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Description: ");
        String desc = sc.nextLine();
        System.out.print("Severity (Low/Medium/High): ");
        String severity = sc.nextLine();
        System.out.print("Status (Open/In Progress/Closed): ");
        String status = sc.nextLine();
        System.out.print("Assigned To: ");
        String assignedTo = sc.nextLine();

        Bug bug = new Bug(title, desc, severity, status, assignedTo);

        try {
            dao.insertBug(bug);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}