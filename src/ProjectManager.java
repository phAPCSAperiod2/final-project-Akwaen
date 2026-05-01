import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private String userName;
    private int age;
    private String projectTitle;
    private List<Idea> allIdeas;
    private List<Idea> selectedIdeas;

    public ProjectManager(String userName, int age, String projectTitle) {
        this.userName = userName;
        this.age = age;
        this.projectTitle = projectTitle;
        this.allIdeas = new ArrayList<>();
        this.selectedIdeas = new ArrayList<>();
    }

    public void addIdea(Idea idea) {
        allIdeas.add(idea);
    }

    public List<Idea> getAllIdeas() {
        return allIdeas;
    }

    public void selectIdea(int index) {
        if (index >= 0 && index < allIdeas.size()) {
            selectedIdeas.add(allIdeas.get(index));
        }
    }

    public List<Idea> getSelectedIdeas() {
        return selectedIdeas;
    }

    public String getProjectTitle() {
        return projectTitle;
    }
}
