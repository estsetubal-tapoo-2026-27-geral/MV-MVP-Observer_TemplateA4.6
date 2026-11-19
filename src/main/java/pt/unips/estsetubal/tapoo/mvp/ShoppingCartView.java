package pt.unips.estsetubal.tapoo.mvp;

import pt.unips.estsetubal.tapoo.model.Product;

import java.util.List;

/**
 * The Presenter uses this contract without accessing JavaFX controls.
 */
public interface ShoppingCartView {
    String getInputProductId();

    Product getSelectedProduct();

    void updateView(List<Product> products, String total);

    void showError(String message);

    void clearError();

    void clearInput();
}
