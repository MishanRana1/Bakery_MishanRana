public class BakeryMain {
    public static void main(String[] args) {
        SourdoughBread sourdough = new SourdoughBread();
        System.out.println("SourdoughBread class testing\n");
        System.out.println("Ingredients of Sourdough Bread are:");
        System.out.println(sourdough.getIngredients());

        System.out.println("A recipe of Sourdough Bread:");
        System.out.println(sourdough.getRecipe());

        // Bake twice to show both messages
        sourdough.bake(); // bakes it
        sourdough.bake(); // already baked

        // Test other breads
        System.out.println("\nPastry class testing\nIngredients of Pastry are:");
        Pastry pastry = new Pastry();
        System.out.println(pastry.getIngredients());
        System.out.println("Recipe for Pastry:");
        System.out.println(pastry.getRecipe());
        pastry.bake();

        System.out.println("\nMuffin class testing");
        Muffin muffin = new Muffin();
        System.out.println(muffin.getIngredients());
        System.out.println(muffin.getRecipe());
        muffin.bake();

        System.out.println("\nBagel class testing");
        Bagel bagel = new Bagel();
        System.out.println(bagel.getIngredients());
        System.out.println(bagel.getRecipe());
        bagel.bake();

        System.out.println("\nFocaccia class testing");
        Focaccia focaccia = new Focaccia();
        System.out.println(focaccia.getIngredients());
        System.out.println(focaccia.getRecipe());
        focaccia.bake();
    }
}