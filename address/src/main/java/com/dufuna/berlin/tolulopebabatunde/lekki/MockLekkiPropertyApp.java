package com.dufuna.berlin.tolulopebabatunde.lekki;

import com.dufuna.berlin.tolulopebabatunde.lekki.model.LekkiProperty;
import com.dufuna.berlin.tolulopebabatunde.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.tolulopebabatunde.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {

        LekkiPropertyService service = new MockLekkiPropertyService();
        String[] type = {"Flat", "Duplex", "Bungalow", "Semi-detached" };
        String[] address = {"Saint ford", "Fitzgerald avenue", "Lancelot close", "Palmview estate"};
                for(int i = 0; i < address.length; i++){
                    LekkiProperty prop = new LekkiProperty(i, address[i], type[i]);
                    service.saveProperty(prop);
                    System.out.println(service.getProperty(i));

                }
                System.out.println(service.getProperties());

    }


}
