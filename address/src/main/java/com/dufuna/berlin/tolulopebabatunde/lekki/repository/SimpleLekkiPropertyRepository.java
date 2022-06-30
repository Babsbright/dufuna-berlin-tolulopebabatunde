package com.dufuna.berlin.tolulopebabatunde.lekki.repository;

import com.dufuna.berlin.tolulopebabatunde.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {

    LekkiProperty save(LekkiProperty lekkiProperty);

    List<LekkiProperty> findAll();

    LekkiProperty findById(int lekkiPropertyId);

    void update(LekkiProperty updateLekkiProperty);

}
