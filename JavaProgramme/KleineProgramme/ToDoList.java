import java.util.Scanner;

public class ToDoList {
    private String task;
    private String dueDate;
    private Boolean done;

    // Getter Setter Region

    String getTask() {
        return task;
    }
    String getDueDate() {
        return dueDate;
    }
    Boolean getIsDone() {
        return done;
    }

    void setTask(String taskName) {
        this.task = taskName;
    }
    void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    void setIsDone(Boolean done) {
        this.done = done;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in); // Scanner Start.
        ToDoList newTask = new ToDoList(); // Method-wide initializing of the instance.

        System.out.println("Java To-do list program active.");
        while (true) {
            String[] optionArray = {"Create new Task", "View existing Task", "Mark existing Task as done", "Exit"};
            for (String option : optionArray) {
                System.out.println("-" + option);
            }
            System.out.print("Select one: ");
            String query = Input.nextLine();

            if (query.equalsIgnoreCase("Create new task")) {
                System.out.print("Give your new task a name: ");
                String newTaskName = Input.nextLine();
                System.out.print("Give your task a due date: ");
                String newTaskDueDate = Input.nextLine();

                    newTask.setTask(newTaskName);
                    newTask.setDueDate(newTaskDueDate);
                    newTask.setIsDone(false); //Because why would you save a task you already completed?
            }
            else if (query.equalsIgnoreCase("View existing Task")) {
                if (newTask.task.isEmpty()) {
                    System.out.println("No task has been made yet.");
                }
                else {
                System.out.println("Task Name: " + newTask.getTask());
                System.out.println("Task Due Date: " + newTask.getDueDate());
                System.out.println("Task is done: " + newTask.getIsDone());
                }
            }
            else if (query.equalsIgnoreCase("Mark existing Task as done")){
                System.out.println("Set Existing Task as done.");
                newTask.setIsDone(true);
            }
            else if (query.equalsIgnoreCase("exit")) {
                Input.close(); // Scanner End.
                System.exit(0);
            }
            else {
                System.out.println("Please choose a valid Entry.");
            }
        }
    }
}