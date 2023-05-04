public class Puzzle {
    private String description;
    private String solution;

    public Puzzle(String description, String solution) {
        this.description = description;
        this.solution = solution;
    }

    public String getDescription() {
        return description;
    }

    public boolean solve(String input) {
        return input.equals(solution);
    }
}
