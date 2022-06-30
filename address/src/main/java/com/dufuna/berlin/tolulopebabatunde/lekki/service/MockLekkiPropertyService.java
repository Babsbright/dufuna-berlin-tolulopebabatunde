package com.dufuna.berlin.tolulopebabatunde.lekki.service;

import com.dufuna.berlin.tolulopebabatunde.lekki.model.LekkiProperty;
import com.dufuna.berlin.tolulopebabatunde.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;
import java.util.ArrayList;

public class MockLekkiPropertyService implements LekkiPropertyService{

     SimpleLekkiPropertyRepositoryImpl propertyRepo = new SimpleLekkiPropertyRepositoryImpl(); @Override
    public LekkiProperty saveProperty(LekkiProperty lekkiProperty) {
        System.out.println(this.getClass().getSimpleName() + "." + "saveProperty" + " called");
        return propertyRepo.save(lekkiProperty);
    }

    @Override
    public LekkiProperty getProperty(int lekkiPropertyId) {
        System.out.println(this.getClass().getSimpleName() + "." + "getProperty" + " called");
        return propertyRepo.findById(lekkiPropertyId);
    }

    @Override
    public ArrayList<LekkiProperty> getProperties() {
        return (ArrayList<LekkiProperty>) propertyRepo.findAll();
    }
}
