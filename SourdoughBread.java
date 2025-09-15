public class SourdoughBread extends Bread{
    
    private double ripeStarter;

    public SourdoughBread() {
        super(5.00, 1.50, 2.50, 0.0, 0.0, 1.00,
              "Sourdough Bread", "not baked",
              "1. Mix flour, water, salt, and ripe sourdough starter.\n" +
              "2. Make the dough\n3. Bulk Rise\n4. Stretch and fold\n" +
              "5. Shape\n6. Second rise\n7. Preheat oven to 450°F\n" +
              "8. Spray loaf with warm water\n9. Bake at 400°F for ~20 min\n10. Cool before eating.");
        this.ripeStarter = 1.00;
    }

    public SourdoughBread(double ripeStarter, double flour, double water, double salt, double yeast) {
        super(flour, water, salt, 0.0, 0.0, yeast, "Sourdough Bread", "not baked", "Sourdough recipe");
        this.ripeStarter = ripeStarter;
    }

    public double getRipeStarter() { return ripeStarter; }
    public void setRipeStarter(double ripeStarter) { this.ripeStarter = ripeStarter; }

    @Override
    public String getIngredients() {
        return super.getIngredients() + String.format("%.2f cups of ripe sourdough starter%n", ripeStarter);
    }
}
