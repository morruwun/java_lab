package human;

public enum SoldierType {
    ARCHER ("archer"),
    KNIGHT ("knight"),
    SPEARMAN ("spearman");

    private String title;

    SoldierType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "SoldierType: " + title;
    }
}
