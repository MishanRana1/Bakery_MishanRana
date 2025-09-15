public class Focaccia extends Bread {
    private double oliveOil; // tablespoons
    private String toppings;

    public Focaccia() {
        super(4.00, 2.00, 1.50, 0.50, 0.0, 1.00, "Focaccia", "not baked",
              "1. Mix dough with olive oil.\n2. Press into pan.\n3. Add toppings and bake until golden.");
        this.oliveOil = 3.0;
        this.toppings = "rosemary, salt, olive oil";
    }

    public double getOliveOil() { return oliveOil; }
    public String getToppings() { return toppings; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + String.format("%.2f tbsp olive oil%nToppings: %s%n", oliveOil, toppings);
    }
}
