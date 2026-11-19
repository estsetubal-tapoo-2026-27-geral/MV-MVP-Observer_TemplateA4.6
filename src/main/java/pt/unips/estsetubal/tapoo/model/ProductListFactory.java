package pt.unips.estsetubal.tapoo.model;

/**
 * Finds a catalogue product by ID and creates a cart item for it.
 */
public final class ProductListFactory {
    private ProductListFactory() {
    }

    public static Product createProduct(int id) throws ShoppingCartException {
        return switch (id) {
            case 1 -> new Product(1, "Notebook", 4.90);
            case 2 -> new Product(2, "Pen", 1.50);
            case 3 -> new Product(3, "Pencil", 0.80);
            case 4 -> new Product(4, "Folder", 2.75);
            case 5 -> new Product(5, "Ruler", 1.25);
            default -> throw new ShoppingCartException("Unknown product ID: " + id);
        };
    }
}
