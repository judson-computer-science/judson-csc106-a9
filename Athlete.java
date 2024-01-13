public abstract class Athlete {
    private String name;
    private Sport sport;
    
    public Athlete(String name, Sport sport) {
        this.name = name;
        this.sport = sport;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void printDetails();
}

