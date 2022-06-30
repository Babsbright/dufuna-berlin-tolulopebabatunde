package com.dufuna.berlin.tolulopebabatunde.lekki.repository;

import com.dufuna.berlin.tolulopebabatunde.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository{

    Map<Integer, LekkiProperty> lekkiPropertyDetails = new HashMap<>();
    @Override
    public LekkiProperty save(LekkiProperty lekkiProperty) {
        int propertyId = lekkiProperty.getPropertyId();
        lekkiPropertyDetails.put(propertyId, lekkiProperty);
        return lekkiProperty;
    }

    @Override
    public ArrayList<LekkiProperty> findAll() {

        return new ArrayList<LekkiProperty> (lekkiPropertyDetails.values());
    }

    @Override
    public LekkiProperty findById(int lekkiPropertyId) {
        for (Map.Entry<Integer, LekkiProperty> property: lekkiPropertyDetails.entrySet()) {
           if(property.getKey().equals(lekkiPropertyId)) return property.getValue();
        }
        return null;
    }

    @Override
    public void update(LekkiProperty updateLekkiProperty) {

        int lekkiPropertyId = updateLekkiProperty.getPropertyId();
        for (Map.Entry<Integer, LekkiProperty> property: lekkiPropertyDetails.entrySet()) {

        if (lekkiPropertyId == property.getKey()){
            lekkiPropertyDetails.put(lekkiPropertyId, updateLekkiProperty);
        }
        }

    }
}
