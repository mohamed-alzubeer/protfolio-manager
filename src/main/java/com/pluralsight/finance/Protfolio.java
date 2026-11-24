package com.pluralsight.finance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Protfolio {

    // Attributes
    private String name;
    private String owner;
    private List<Valuable> assets;

    // Constructor
    public Protfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    // Add an asset to the portfolio
    public void add(Valuable asset) {
        assets.add(asset);
    }

    // Return the net value of all assets
    public BigDecimal getValue() {

        BigDecimal value = BigDecimal.ZERO;

        for (Valuable asset : assets) {
            value = value.add(asset.getValue());
        }

        return value;
    }

    // Return the most valuable asset
    public Valuable getMostValuable() {

        if (assets.isEmpty()) {
            return null;
        }

        Valuable mostValuable = assets.get(0);

        for (Valuable asset : assets) {

            if (asset.getValue().compareTo(mostValuable.getValue()) > 0) {
                mostValuable = asset;
            }
        }

        return mostValuable;
    }

    // Return the least valuable asset
    public Valuable getLeastValuable() {

        if (assets.isEmpty()) {
            return null;
        }

        Valuable leastValuable = assets.get(0);

        for (Valuable asset : assets) {

            if (asset.getValue().compareTo(leastValuable.getValue()) < 0) {
                leastValuable = asset;
            }
        }

        return leastValuable;
    }
}