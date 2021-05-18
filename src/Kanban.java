import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

class Kanban
{
    Semaphore sem;
    int iterator ;
    Queue<Task> tasks;
    Kanban(int iterator)
    {
        this.iterator = iterator;
        this.tasks = new LinkedList<>();
        this.sem = new Semaphore(iterator, true);
    }
    public boolean addTask(String name, long time){
        return this.tasks.add(new Task(name,time, sem));
    }
}