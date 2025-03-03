import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        toDoList list = new toDoList();
        int action = 0;
        while (action != 5) {
            System.out.println("what do you want to do?");
            System.out.println("add a task -press 1");
            System.out.println("complete a task - press 2");
            System.out.println("remove a task - press 3");
            System.out.println("show all tasks - press 4");
            System.out.println("exit - press 5");
            action = scanner.nextInt();
            scanner.nextLine();

            if (action < 1 || action > 5){
                System.out.println("number is invalid, try again");
            }

            else if (action == 1) {
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                list.addTask(description);
            }
            else if (action == 2) {
                System.out.println("Enter the task number: ");
                int toComplete = scanner.nextInt();
                list.competeTask(toComplete - 1);
            }

            else if (action == 3) {
                System.out.println("Enter the task number: ");
                int toRemove = scanner.nextInt();
                list.removeTask(toRemove - 1);
            }

            else if (action == 4){
                list.showTasks();
            }

        }

    }
}