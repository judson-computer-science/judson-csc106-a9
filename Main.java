import java.util.Map;

public class Main {
    public static void main(String[] args) {

	// use this code
        new FootballPlayer("Tom Brady", "Quarterback", 500);
        new FootballPlayer("Drew Brees", "Quarterback", 450);

        new FootballPlayer("Patrick Mahomes", "Quarterback", 200);
        new FootballPlayer("Josh Allen", "Quarterback", 150);

        new TrackAndFieldAthlete("Usain Bolt", "Sprints", 12, Map.of("100m", 9.58f, "200m", 19.19f));
        new TrackAndFieldAthlete("Asafa Powell", "Sprints", 10, Map.of("100m", 9.72f, "200m", 19.90f));

        new TrackAndFieldAthlete("Tyson Gay", "Sprints", 8, Map.of("100m", 9.69f, "200m", 19.58f));
        new TrackAndFieldAthlete("Yohan Blake", "Sprints", 7, Map.of("100m", 9.69f, "200m", 19.26f));

    }
}
