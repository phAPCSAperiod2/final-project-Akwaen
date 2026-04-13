import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get project goal
        System.out.println("Enter your project goal:");
        String goal = scanner.nextLine();

        // Step 2: Number of tasks
        System.out.println("How many tasks do you want to add?");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        // Arrays to store tasks and times
        String[] tasks = new String[numTasks];
        int[] times = new int[numTasks];
        int totalTime = 0;

        // Step 3: Input tasks and times
        for (int i = 0; i < numTasks; i++) {
            System.out.println("\nEnter task " + (i + 1) + ":");
            tasks[i] = scanner.nextLine();

            System.out.println("Enter time (in minutes):");
            times[i] = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            totalTime += times[i];
        }

        // Step 4: Output results
        System.out.println("\n--- Project Summary ---");
        System.out.println("Goal: " + goal);

        for (int i = 0; i < numTasks; i++) {
            System.out.println(tasks[i] + " - " + times[i] + " minutes");
        }

        System.out.println("Total time: " + totalTime + " minutes");

        scanner.close();
    }
}
