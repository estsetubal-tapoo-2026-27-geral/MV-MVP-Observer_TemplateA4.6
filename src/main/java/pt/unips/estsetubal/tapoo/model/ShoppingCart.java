package pt.unips.estsetubal.tapoo.model;

import pt.unips.estsetubal.tapoo.observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Shared Model for the Model–View and MVP applications.
 */
public class ShoppingCart extends Subject {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(int id) throws ShoppingCartException {
        Product product = ProductListFactory.createProduct(id);
        addProduct(product);
    }

    public void addProduct(Product product) {
        products.add(Objects.requireNonNull(product, "product"));
        notifyObservers();
    }

    public boolean removeProduct(Product product) {
        boolean removed = products.remove(product);
        if (removed) {
            notifyObservers();
        }
        return removed;
    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getValue).sum();
    }
}
