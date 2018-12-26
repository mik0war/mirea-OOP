import java.lang.IllegalArgumentException;


public class Drink implements Item{
    public final static String WATER = "Water";
    public final static String BEER = "Beer";
    public final static String WINE = "Wine";
    public final static String COFFEE = "Coffee";

    public final static String WATER_DESCRIPTION = "Transparent, tasteless, "
            + "odorless, and nearly colorless chemical substance.";
    public final static String BEER_DESCRIPTION = "One of the oldest and most "
            + "widely consumed alcoholic drinks in the world.";
    public final static String WINE_DESCRIPTION = "Wine is an alcoholic "
            + "beverage made from fermented grapes.";
    public final static String COFFE_DESCRIPTION = "Coffee is a brewed drink "
            + "prepared from roasted coffee beans.";

    private final String name;
    private final String description;
    private final int cost;

    public Drink(String name, String description) {
        this(name, description, 0);
    }

    public Drink(String name, String description, int cost) throws IllegalArgumentException{
        if (name.isEmpty() || description.isEmpty() || cost < 0)
            throw new IllegalArgumentException();

        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        return String.format(
                "%s (%d$)",
                getName(),
                getCost()
        );
    }
}