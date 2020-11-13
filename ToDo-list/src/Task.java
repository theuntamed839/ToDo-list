import java.time.LocalDateTime;

public class Task {
    private String title;
    private LocalDateTime start;
    private LocalDateTime stop;
    private boolean isImportant;
    private boolean isUrgent;
    private TaskManager manager;

    public Task(String title, boolean isImportant, boolean isUrgent, LocalDateTime stop) {
        this.title = title;
        this.isImportant = isImportant;
        this.isUrgent = isUrgent;
        this.start = LocalDateTime.now();
        this.stop = stop;
    }
    

}
