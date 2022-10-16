package view;

import controller.Controller;
import model.Birds;
import model.Cows;
import model.Pigs;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void execute() {
        var entity1 = new Birds(4,"pigeon");
        entity1.setWeight(2.5);
        controller.add(entity1);

        var entity2 = new Birds(1,"aigle");
        entity2.setWeight(4.5);
        controller.add(entity2);

        var entity3 = new Cows(29, "Micheline");
        entity3.setWeight(142.4);
        controller.add(entity3);

        var entity4 = new Cows(45, "Alberte");
        entity4.setWeight(112.8);
        controller.add(entity4);

        var entity5 = new Pigs("Anabelle",180);
        entity5.setWeight(70.2);
        controller.add(entity5);

        var entity6 = new Pigs("Antoinette",110);
        entity6.setWeight(45.4);
        controller.add(entity6);

        var filteredEntities = controller.getAllWithWeightGreaterThan();
        System.out.println(filteredEntities);
    }
}
