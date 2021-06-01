package model;

public class ProductForRent extends Product implements Rentable {

    public ProductForRent(String code, String name, int units, double price, ProductType type) {
        super(code, name, units, price, type);
    }

    @Override
    public String getInformation() {
        return null;
    }

    @Override
    public boolean isSafeRent() {
        return false;
    }

    @Override
    public double getRentPrice(int amountDays) {
        return 0;
    }

    @Override
    public void rentProduct(int amountDays) {

    }
}