public class task {
    private String description;
    private boolean isCompleted;

    public task(String description) {
        this.description = description;
        this.isCompleted = false;
    }
    public void markAsComplete(){
        this.isCompleted = true;
    }

    public String toString() {
        if (isCompleted) {
            return description + "-" + " " + "Done!";
        }
        return description + "-" + " " + "notDone:(";
    }
}
