package chapter11_abstraction_and_interfaces;

public interface Product {

    double getPrice();
    void setPrice (double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

 default String getBarCode(){
        return "no barcode";
    }

}
