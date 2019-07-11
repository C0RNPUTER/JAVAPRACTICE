package org.dimigo.basic;

public class Snack {
    private String model;
    private String company;
    private int price;
    private int count;

    public int calcPrice(){
        return this.price * this.count;
    }

    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("이름 : ").append(model).append("\n제조사 : ").append(company).append("\n가격 : ").append(String.format("%,d원",price)).append("\n개수 : ").append(count).append("개\n");
        return sb.toString();
    }

    public  Snack(){};

    public Snack(String model) {
        this.model = model;
    }
    public Snack(String model, String company) {
        this.model = model;
        this.company = company;
    }
    public Snack(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }
    public Snack(String model, String company, int price, int count) {
        this.model = model;
        this.company = company;
        this.price = price;
        this.count = count;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
