package pt.unips.estsetubal.tapoo.modelview;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import pt.unips.estsetubal.tapoo.model.Product;
import pt.unips.estsetubal.tapoo.model.ShoppingCart;

/**
 * Initial View. Add has a handler, but the cart and UI are not connected yet.
 */
public class ShoppingCartUI extends VBox {
    private final ShoppingCart model;
    private final TextField inputProductId = new TextField();
    private final Button btAddProduct = new Button("Add");
    private final ListView<Product> listProductsView = new ListView<>();
    private final Label lblTotal = new Label("Total: 0.00 €");
    private final Label lblError = new Label();

    public ShoppingCartUI(ShoppingCart model) {
        this.model = model;
        setSpacing(10);
        setPadding(new Insets(16));

        inputProductId.setPromptText("Product ID (1–5)");
        inputProductId.setPrefColumnCount(12);
        HBox inputRow = new HBox(8, new Label("Product ID:"), inputProductId, btAddProduct);
        btAddProduct.setOnAction(event -> onAddProduct());
        lblError.setStyle("-fx-text-fill: #b00020;");
        listProductsView.setPrefHeight(220);

        getChildren().addAll(inputRow, listProductsView, lblTotal, lblError);
    }

    private void onAddProduct() {
        // TODO Activity 1: parse the input, call model.addProduct(id),
        // and display a useful error for an invalid input or unknown ID.
        // Do not redraw the list here: update() handles model changes.
    }

    public void update() {
        // TODO Activity 1: read model.getProducts() and model.getTotal()
        // and update listProductsView and lblTotal.
    }
}
