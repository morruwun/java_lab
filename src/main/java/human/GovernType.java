package human;

public enum GovernType {
    LORD ("lord"),
    LORDSWIFE ("lord's wife"),
    SOLDIERCAPTAIN ("soldier captain"),
    CONSTABLE ("constable");

    private String title;

    GovernType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "GovernType: " + title;
    }
}
