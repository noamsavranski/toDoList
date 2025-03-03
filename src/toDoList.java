import java.util.LinkedList;

public class toDoList {
    private LinkedList<task> toDo;

    public toDoList() {
        this.toDo = new LinkedList<task>();
    }
    public void addTask(String description) {
        task t = new task(description);
        this.toDo.add(t);
        System.out.println("Task added!");
    }

    public void competeTask(int index){
        if (toDo.size() <= index || index < 0){
            System.out.println("index cant be found in the list" );
        }
        else {
            this.toDo.get(index).markAsComplete();
            System.out.println("task completed!");
        }
    }

    public void removeTask(int index) {
        if (toDo.size() <= index || index < 0) {
            System.out.println("index cant be found in the list");
        }
        else {
            this.toDo.remove(index);
            System.out.println("TASK DELETED!");
        }
    }
    public void showTasks(){
        if (toDo.isEmpty()) {
            System.out.println("list is empty:)");
        }
        else {
            System.out.println("TASKS:");
            int index = 1;
            for (task t : this.toDo) {
                System.out.println(index + "." + t);
                index = index + 1;
            }
        }
    }
}
