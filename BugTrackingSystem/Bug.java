public class Bug {
    int id;
    String title, description, severity, status, assignedTo;

    public Bug(String title, String description, String severity, String status, String assignedTo) {
        this.title = title;
        this.description = description;
        this.severity = severity;
        this.status = status;
        this.assignedTo = assignedTo;
    }
}