import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your project title: ");
        String title = scanner.nextLine();

        ProjectManager pm = new ProjectManager(name, age, title);

        // Collect ideas
        System.out.println("\nEnter your ideas (type 'done' to finish):");
        while (true) {
            String ideaText = scanner.nextLine();
            if (ideaText.equalsIgnoreCase("done")) break;
            pm.addIdea(new Idea(ideaText));
        }

        // Show ideas
        System.out.println("\nYour ideas:");
        List<Idea> ideas = pm.getAllIdeas();
        for (int i = 0; i < ideas.size(); i++) {
            System.out.println(i + ": " + ideas.get(i).getDescription());
        }

        // Select ideas
        System.out.println("\nSelect ideas by index (type -1 to stop):");
        while (true) {
            int choice = scanner.nextInt();
            if (choice == -1) break;
            pm.selectIdea(choice);
        }

        // Assign durations
        scanner.nextLine();
        for (Idea idea : pm.getSelectedIdeas()) {
            System.out.print("How many days for \"" + idea.getDescription() + "\"? ");
            int days = scanner.nextInt();
            idea.setDuration(days);
        }

        // Generate schedule
        Schedule.generateSchedule(pm.getSelectedIdeas());

        scanner.close();
    }
}
