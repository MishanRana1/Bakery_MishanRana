public class Bread {

    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;
    private String recipe;

    public Bread() {
        this.flour = 3.0;
        this.water = 1.5;
        this.salt = 1.0;
        this.sugar = 1.0;
        this.bakingPowder = 0.0;
        this.yeast = 0.5;
        this.breadName = "Generic Bread";
        this.state = "not baked";
        this.recipe = "1. Mix ingredients.\n2. Knead.\n3. Let rise.\n4. Bake.";
    }

    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    
}