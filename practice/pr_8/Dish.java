import java.lang.IllegalArgumentException;


public class Dish implements Item{
    public final static String POTATO = "Potato";
    public final static String PASTA = "Pasta";
    public final static String BREAD = "Bread";

    public final static String POTATO_DESCRIPTION = "Plate with potato.";
    public final static String PASTA_DESCRIPTION = "Plate with pasta.";
    public final static String BREAD_DESCRIPTION = "Plate with bread";

    private final String name;
    private final String description;
    private final int cost;

    public Dish(String name, String description) {
        this(name, description, 0);
    }

    public Dish(String name, String description, int cost) {
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