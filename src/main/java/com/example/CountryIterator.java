package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {
    private final CountryCollection countryCollection;
    private int index;

    public CountryIterator(CountryCollection countryCollection) {
        this.countryCollection = countryCollection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        var countries = countryCollection.getCountries();
        return index < countries.length;
    }

    @Override
    public Country next() {
        var countries = countryCollection.getCountries();
        if (hasNext()) {
            return countries[index++];
        } else {
            return null;
        }
    }
}
