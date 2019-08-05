package com.curso.proyecto.finall;

public class Package {
    private String packageId;
    private Float price;

    public Package(java.lang.String packageId, java.lang.Float price) {
        this.packageId = packageId;
        this.price = price;
    }

    public Package(java.lang.String packageId, java.lang.Float price,Float iva) {
        this.packageId = packageId;
        this.price = price + price* iva;

    }

    public java.lang.String getPackageId() {
        return packageId;
    }

    public void setPackageId(java.lang.String packageId) {
        this.packageId = packageId;
    }

    public java.lang.Float getPrice() {
        return price;
    }

    public void setPrice(java.lang.Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageId='" + packageId + '\'' +
                ", price=" + price +
                '}';
    }
}
