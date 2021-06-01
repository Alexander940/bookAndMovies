package model;

public class ProductForSale extends Product, Saleable{

    double discount;

    public ProductForSale(String code, String name, int units, double price, ProductType type){
        super(code, name, units, price, type);

        discount = 0.0;
    }

    public double getSalePrice(int units){
        double subTotal;

        subTotal = getPrice() * units - this.discount;

        return subTotal;
    }

    public boolean isSafeSale(int units){
        boolean safe = true;

        return safe;
    }

    public double applyExtraDiscount(double subTotal, double percentageDiscount){
        double finalPrice = 0.0;

        return finalPrice;
    }

    public double calculateTax(double totalPrice, double percentage){
        double finalPrice;

        finalPrice = totalPrice + (totalPrice*percentage);

        return totalPrice;
    }
}