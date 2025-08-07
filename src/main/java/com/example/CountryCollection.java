package com.example;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CountryCollection implements Iterable<Country> {
    private final Country[] countries;

    public CountryCollection(Country... countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    @Override
    public Iterator<Country> iterator() {
        return new CountryIterator(this);
    }

}
