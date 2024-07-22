import modelo.CrustType;
import modelo.Pizza;
import modelo.SizeType;

public class Main {
    public static void main(String[] args) {
        Pizza LeonardoDeCatupiry = new Pizza.Builder().gtSize(SizeType.SMALL).gtCrust(CrustType.CHEESE_STUFFED)
                .addToppings("Bacon").build();

        Pizza brocolis = new Pizza.Builder()
                .addToppings("chocolate amargo com pimenta e sal")
                .build();


        Pizza.Builder builder;

        builder = new Pizza.Builder();
        Pizza podrao = builder.gtSize(SizeType.LARGE).withCheese("Prato").addToppings("ketchup usado aberto faz uma semana")
                .addToppings("cebola que estava na geladeira cortada ao meio que nunca foi usada")
                .addToppings("alface meio comida por insetos").addToppings("pedaços de atum enlatado")
                .build();

        builder = new Pizza.Builder();
        builder.gtCrust(CrustType.GLUTEN_FREE);
        builder.withCheese("Queijo Vegano");
        builder.addToppings("tomate");
        builder.addToppings("rúcula");
        builder.addToppings("cogumelos");
        Pizza semGluten = builder.build();

        System.out.println(LeonardoDeCatupiry);
        System.out.println(brocolis);
        System.out.println(podrao);
        System.out.println(semGluten);

    }

}
