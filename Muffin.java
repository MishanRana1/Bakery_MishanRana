public class Muffin extends Bread {
    private boolean hasBlueberries;
    private double milk; // cups

    public Muffin() {
        super(2.50, 0.75, 0.50, 2.50, 1.00, 0.0, "Muffin", "not baked",
              "1. Mix dry and wet ingredients separately.\n2. Fold together.\n3. Scoop into tins and bake.");
        this.hasBlueberries = true;
        this.milk = 1.00;
    }

    public boolean isHasBlueberries() { return hasBlueberries; }
    public void setHasBlueberries(boolean hasBlueberries) { this.hasBlueberries = hasBlueberries; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + String.format("%.2f cups of milk%nBlueberries: %b%n", milk, hasBlueberries);
    }
}

