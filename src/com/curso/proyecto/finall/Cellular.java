package com.curso.proyecto.finall;
import java.util.ArrayList;

public class Cellular {
    private String cellularNumber;
    private  Plan planId;
    private ArrayList<Package> packages;

    public Cellular(String cellularNumber, Plan planId, ArrayList<Package> packages) {
        this.cellularNumber = cellularNumber;
        this.planId = planId;
        this.packages = packages;
    }

    public String getCellularNumber() {
        return cellularNumber;
    }

    public void setCellularNumber(String cellularNumber) {
        this.cellularNumber = cellularNumber;
    }

    public Plan getPlanId() {
        return planId;
    }

    public void setPlanId(Plan planId) {
        this.planId = planId;
    }

    public ArrayList<Package> getPackages() {
        return packages;
    }

    public void setPackages(ArrayList<Package> packages) {
        this.packages = packages;
    }
}
