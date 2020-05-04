package barista;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void addCondiments();

    boolean customerWantsCondiments() {
        return true;
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();

    void boilWater() {
        System.out.println("boiling water");
    }
}
