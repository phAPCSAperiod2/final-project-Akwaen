import java.util.List;

public class Schedule {

    public static void generateSchedule(List<Idea> ideas) {
        int day = 1;

        System.out.println("\n--- Project Schedule ---");

        for (Idea idea : ideas) {
            for (int i = 0; i < idea.getDuration(); i++) {
                System.out.println("Day " + day + ": " + idea.getDescription());
                day++;
            }
        }
    }
}
