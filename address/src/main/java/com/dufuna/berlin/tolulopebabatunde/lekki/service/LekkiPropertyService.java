package com.dufuna.berlin.tolulopebabatunde.lekki.service;

import com.dufuna.berlin.tolulopebabatunde.lekki.model.LekkiProperty;

import java.util.List;


public interface LekkiPropertyService {



    LekkiProperty saveProperty(LekkiProperty lekkiProperty);


    LekkiProperty getProperty(int lekkiPropertyId);


    List<LekkiProperty> getProperties();
}
