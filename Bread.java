public class Bread {

    private double flour;
    private double water;
    private double salt;
    private double suger;
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

    
}