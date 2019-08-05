package com.curso.proyecto.finall;

public class Plan {
    String planID;
    Float price;

    public Plan(java.lang.String planID, java.lang.Float price) {
        this.planID = planID;
        this.price = price;
    }

    public java.lang.String getPlanID() {
        return planID;
    }

    public void setPlanID(java.lang.String planID) {
        this.planID = planID;
    }

    public java.lang.Float getPrice() {
        return price;
    }

    public void setPrice(java.lang.Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "planID='" + planID + '\'' +
                ", price=" + price +
                '}';
    }
}
