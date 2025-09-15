import java.security.PublicKey;

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

    public double getFlour(){
        return flour;
    }
    public void setFlour(double flour){
        this.flour = flour;
    }

    public double getWater(){
        return water;
    }
    public void setWater(double water){
        this.water = water;
    }

    public double getSalt(){
        return salt;
    }
    public void setSalt(double salt){
        this.salt = salt;
    }

    public double getSugar(){
        return sugar;
    }
    public void setSugar(double sugar){
        this.suagr = sugar;
    }

    public double getBakingPowder(){
        return bakingPowder;
    }
    public void setBakingPowder(double bakingPowder){
        this.bakingPowder = bakingPowder;
    }

    public double getYeast(){
        return yeast;
    }
    public void setYeast(double yeast){
        this.yeast = yeast;
    }

    public String getBreadName(){
        return breadName;
    }
    public void setBreadName(String breadName){
        this.breadName = breadName;
    }

    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }

    public String getRecipe(){
        return recipe;
    }
    public void setRecipe(String recipe){
        this.recipe = recipe;
    }

    String getIngredients(){
        String ingredients = "";
        ingredients += String.format("%.2f cups of flour%n", flour);
        ingredients += String.format("%.2f cups of water%n", water);
        ingredients += String.format("%.2f tsps of salt%n", salt);
        ingredients += String.format("%.2f tsps of sugar%n", sugar);
        ingredients += String.format("%.2f tsps of baking powder%n", bakingPowder);
        ingredients += String.format("%.2f tsps of yeast%n", yeast);
        return ingredients;
    }

    public void bake() {
        if ("baked".equals(state)) {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        } else {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        }
    }

    @Override
    public String toString() {
        return breadName + " [" + state + "]";
    }
}