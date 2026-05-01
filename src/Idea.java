public class Idea {
    private String description;
    private int duration; // in days

    public Idea(String description) {
        this.description = description;
        this.duration = 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return description + " (" + duration + " days)";
    }
}
