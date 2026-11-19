package pt.unips.estsetubal.tapoo.model;

import java.util.Locale;

/**
 * A product offered by the catalogue.
 */
public final class Product {
    private final int id;
    private final String name;
    private final double value;

    public Product(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%d - %s (%.2f €)", id, name, value);
    }
}
