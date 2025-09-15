public class Bagel extends Bread {
    private boolean boiledBeforeBaking;

    public Bagel() {
        super(4.00, 1.50, 1.50, 0.50, 0.0, 1.25, "Bagel", "not baked",
              "1. Mix and knead dough.\n2. Rise.\n3. Shape into rings.\n4. Boil briefly, then bake.");
        this.boiledBeforeBaking = true;
    }

    public boolean isBoiledBeforeBaking() { return boiledBeforeBaking; }
    public void setBoiledBeforeBaking(boolean boiledBeforeBaking) { this.boiledBeforeBaking = boiledBeforeBaking; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "Boiled before baking: " + boiledBeforeBaking + "\n";
    }
}
