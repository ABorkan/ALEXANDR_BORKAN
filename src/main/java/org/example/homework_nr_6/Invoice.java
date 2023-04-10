package org.example.homework_nr_6;

public class Invoice {

    private String model;
    private String description;
    private int count;
    private double price;

    public Invoice(String model, String description, int count, double price) {
        this.model = model;
        this.description = description;
        if(count < 0)
            this.count = 0;
        else
            this.count = count;
        if(price < 0.0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOp(String description) {
        this.description = description;
    }

    public void setCount(int count) {
        if(count < 0)
            this.count = 0;
        else
            this.count = count;
    }

    public void setPrice(double price) {
        if(price < 0.0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public double getAmount(){
        return this.count * this.price;
    }
}
