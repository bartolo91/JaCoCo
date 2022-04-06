package ZadanieNarkotyki;

import java.util.List;

public class Narcotic {

    private String name;
    private double pricePerGram;
    private List<Ingredients> ingredients;

    public Narcotic(String name, double pricePerGram, List<Ingredients> ingredients) {
        this.name = name;
        this.pricePerGram = pricePerGram;
        if (ingredients.size() < 3){
            throw new NotEnoughIngredinetsException("There is not enough of ingredients");
        }
        this.ingredients = ingredients;
    }


}
