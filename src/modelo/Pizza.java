package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String cheese;
    private final List<String> toppings;
    private final  SizeType size;
    private final CrustType crust;
    

    public Pizza(String cheese, List<String> toppings, SizeType sizeType, CrustType crustType) {
        this.cheese = cheese;
        this.toppings = toppings;
        this.size = sizeType;
        this.crust = crustType;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public SizeType getSize() {
        return size;
    }

    public CrustType getCrust() {
        return crust;
    }
    public static class Builder {
        private String cheese;
        private List<String> toppings;
        private SizeType size;
        private CrustType crust;

        public Builder() {
            this.cheese = "cheddar";
            this.toppings = new ArrayList<>();
            this.size = SizeType.DEFAULT;
            this.crust = CrustType.THIN;
        }
        public Builder withCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }
        public Builder addToppings(String toppings){
            this.toppings.add(toppings);
            return this;
        }
        public Builder gtSize(SizeType type) {
            this.size = type;
            return this;
        }
        public Builder gtCrust(CrustType type) {
            this.crust = type;
            return this;
        }
        public Pizza build() {
            return new Pizza(this.cheese, this.toppings, this.size, this.crust);
        }
    }

    @Override
    public String toString() {
        return String.format("\tPizzaria do Carmo\n\tAqui sua pizza é mais gostosa!" +
                "\nSua pizza ficou: \n\nQueijo %s\nCobertura: %s\nTamanho da modelo.Pizza: %s\nBorda da modelo.Pizza: %s\nTudo certo, Meu Patrão?\n",
                cheese, String.join("\n", toppings), size, crust);

    }
}
