package spring_in_action.tacocloud.repositories.Ingredients;

import spring_in_action.tacocloud.models.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne (String id);

    Ingredient save (Ingredient ingredient);
}
