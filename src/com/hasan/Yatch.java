package com.hasan;

public class Yatch implements OrderItem {
    private String manufacturer, model;
    private boolean hasStandadFeatures;

    public Yatch() {
    }

    public Yatch(String manufacturer, String model, boolean hasStandadFeatures) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.hasStandadFeatures = hasStandadFeatures;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasStandadFeatures() {
        return hasStandadFeatures;
    }

    public void setHasStandadFeatures(boolean hasStandadFeatures) {
        this.hasStandadFeatures = hasStandadFeatures;
    }

    @Override
    public String getType() {
        return "yatch";
    }

    @Override
    public String toString() {
        return "Yatch{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", hasStandadFeatures=" + hasStandadFeatures +
                '}';
    }
}
