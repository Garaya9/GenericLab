package genericlab;

/**
 * A baseball player with a batting average.
 * @author Gebrella Araya
 * @date Feb 9, 2024
 */
public class BaseballPlayer implements Measurable {
    private double battingAverage;
    private String name;
    private String team;

    /**
     * Constructs a baseball player with a zero batting average.
     */
    public BaseballPlayer() {
        battingAverage = 0;
        name = "";
        team = "";
    }

    /**
     * Constructs a baseball player with a given name, team, and batting average.
     * @param name player's name
     * @param team player's team
     * @param batavg the batting average
     */
    public BaseballPlayer(String name, String team, double batavg) {
        this.name = name;
        this.team = team;
        this.battingAverage = batavg;
    }

    /**
     * Gets the name of the player.
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the team of the player.
     * @return the player's team
     */
    public String getTeam() {
        return team;
    }

    /**
     * Gets the batting average of the player.
     * @return the batting average
     */
    public double getBattingAverage() {
        return battingAverage;
    }

    /**
     * Implements Measurable interface.
     * @return the batting average
     */
    public double getMeasure() {
        return battingAverage;
    }
}
