package pt.unips.estsetubal.tapoo.mvp;

import pt.unips.estsetubal.tapoo.model.ShoppingCart;
import pt.unips.estsetubal.tapoo.observer.Observer;

import java.util.Objects;

/**
 * Provided class: complete the TODO methods in the two MVP exercises.
 */
public class ShoppingCartPresenter implements Observer {
    private final ShoppingCart model;
    private final ShoppingCartView view;

    public ShoppingCartPresenter(ShoppingCartView view, ShoppingCart model) {
        this.view = Objects.requireNonNull(view, "view");
        this.model = Objects.requireNonNull(model, "model");

        // TODO Activity 2, Exercise 1: register this Presenter with the
        // Model and display its initial state through the View.
    }

    public void doAddProduct() {
        // TODO Activity 2, Exercise 1: read and parse the ID from the View,
        // call model.addProduct(id), and ask the View to display errors.
        // Model notifications will update the product list and total.
    }

    public void doDeleteProduct() {
        // TODO Activity 2, Exercise 2: read the selected Product from the
        // View and ask the Model to remove it; report a missing selection.
    }

    @Override
    public void update() {
        // TODO Activity 2, Exercise 1: read the current Model state and ask
        // the View to display the products and total.
    }
}
