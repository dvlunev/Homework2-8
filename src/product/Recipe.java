package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final Set<Product> recipe = new HashSet<>();
    private double sumPrice;
    private final String name;
    private static int number = 1;

    public Recipe(String name) {
        if (StringUtils.isNullOrEmptyOrBlank(name)) {
            name = "Рецепт " + number;
            number++;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProductToRecipe(Product product) {
        if (recipe.contains(product)) {
            throw new IllegalArgumentException("Рецепт " + name + " уже содержит продукт " + product.getName());
        }
        if (product.getPrice() == 0 || product.getWeight() == 0) {
            throw new IllegalArgumentException("Заполните карточку продукта " + product.getName() + " полностью");
        }
        recipe.add(product);
        calcSumPrice();
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void calcSumPrice() {
        double sumPrice = 0;
        for (Product product : recipe) {
            sumPrice = sumPrice + product.getPrice() * product.getWeight();
        }
        this.sumPrice = sumPrice;
    }

    @Override
    public String toString() {
        return "\nРецепт: " + name +
                "\nИнгридиенты: " + recipe +
                "\nСуммарная стоимость: " + String.format("%.2f",sumPrice) + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
