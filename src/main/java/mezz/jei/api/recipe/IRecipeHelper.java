package mezz.jei.api.recipe;

import mezz.jei.api.recipe.type.IRecipeTypeKey;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * An IRecipeHelper provides information about one Recipe Class.
 */
public interface IRecipeHelper {

	/**
	 *  Returns the class of the Recipe handled by this IRecipeHelper.
	 *  Returns null if the class is not available.
	 */
	@Nullable
	Class getRecipeClass();

	/* Returns the type of this recipe. */
	IRecipeTypeKey getRecipeTypeKey();

	/* Returns a recipe wrapper for the given recipe. */
	IRecipeWrapper getRecipeWrapper(@Nonnull Object recipe);

}
