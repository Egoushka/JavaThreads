import java.util.concurrent.Semaphore;

public class Task extends Thread {
    Semaphore sem;
    String name;
    long time;

    public Task(String name, long time, Semaphore sem) {
        this.name = name;
        this.time = time;
        this.sem = sem;
    }

    public String getTaskName() {
        return name;
    }

    public void setTaskName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void run()
    {
        try {
            sem.acquire();
            System.out.println("Task " + this.name + " start");
            sleep(this.time);
            sem.release();
            System.out.println("Task " + this.name + " was release");
        }
        catch(InterruptedException e)
        {
            System.out.println ("Trouble");
        }
    }
}
