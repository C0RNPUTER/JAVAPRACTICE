package org.dimigo.basic;

public class Car {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
        System.out.println("제조사명 : "+this.company);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("모델명 : "+this.model);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("색상 : "+this.color);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 0){
            this.maxSpeed = maxSpeed;
            System.out.println("최대속도 : "+this.maxSpeed+"km");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price >= 0){
            this.price = price;
            System.out.println("가격 : "+this.price+"원");
        }

    }
}
