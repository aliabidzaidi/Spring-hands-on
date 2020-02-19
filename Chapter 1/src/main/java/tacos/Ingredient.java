package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
	private final String id;
	private final String name;
	private final Type type;

	public Ingredient() {
		id = null;
		name = null;
		type = null;
	}

	public static enum Type{
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}

}
