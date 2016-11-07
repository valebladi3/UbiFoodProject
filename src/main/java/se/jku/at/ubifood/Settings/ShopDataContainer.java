package se.jku.at.ubifood.Settings;

/**
 * Created by Thomas on 04.11.2016.
 */

public class ShopDataContainer {

    public ShopDataContainer(String name, String address, String eta) {
        this.name = name;
        this.address = address;
        this.eta = eta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    private String eta;
}
