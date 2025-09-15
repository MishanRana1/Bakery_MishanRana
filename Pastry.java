public class Pastry extends Bread{
    private double butter; // cups
    private int layers;

    public Pastry() {
        super(2.00, 0.75, 0.50, 3.00, 1.00, 0.0, "Pastry", "not baked",
              "1. Mix flour and butter to make flaky layers.\n2. Fold and chill.\n3. Roll and fill.\n4. Bake until golden.");
        this.butter = 1.00;
        this.layers = 6;
    }

    public double getButter() { return butter; }
    public void setButter(double butter) { this.butter = butter; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + String.format("%.2f cups of butter%nLayers: %d%n", butter, layers);
    }
}