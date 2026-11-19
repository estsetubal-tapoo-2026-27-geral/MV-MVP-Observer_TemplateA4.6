package pt.unips.estsetubal.tapoo.modelview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.unips.estsetubal.tapoo.model.ShoppingCart;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        ShoppingCart model = new ShoppingCart();
        ShoppingCartUI view = new ShoppingCartUI(model);

        // TODO Activity 1: register the View as an Observer of the Model
        // and display the initial state.

        stage.setTitle("Shopping Cart — Model–View");
        stage.setScene(new Scene(view, 460, 350));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
