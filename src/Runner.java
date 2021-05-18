import java.util.concurrent.Semaphore;

public class Runner {

    Kanban kanban;

    public Runner(Kanban kanban) {
        this.kanban = kanban;
    }

    public void run() {
        for (var item : kanban.tasks) {
            item.start();
        }
    }
}