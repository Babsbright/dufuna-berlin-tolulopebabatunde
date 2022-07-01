package com.dufuna.berlin.tolulopebabatunde.lekki.model;

import java.util.Objects;

public class LekkiProperty {

    private int propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private String validForm;
    private String validTo;


//           METHOD
    public LekkiProperty(int propertyId, String propertyAddress, String propertyType){
        setPropertyId(propertyId);
        setPropertyAddress(propertyAddress);
        setPropertyType(propertyType);
    }

    // PROPERTY ID
    public int getPropertyId(){
        return  propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    // PROPERTY TYPE
    public String getPropertyType(){
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }


    //PROPERTY ADDRESS
    public String getPropertyAddress(){
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }
     //BEDROOMS
    public int getNumberOfBedrooms(){
        return  numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms){
        this.numberOfBedrooms = numberOfBedrooms;
    }
     //SITTING ROOMS
    public  int getNumberOfSittingRooms(){
        return  numberOfSittingRooms;
    }

    public  void setNumberOfSittingRooms(int numberOfSittingRooms){
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    //KITCHENS
    public  int getNumberOfKitchens(){
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens){
        this.numberOfKitchens = numberOfKitchens;
    }

    //BATHROOMS
    public  int getNumberOfBathrooms(){
        return  numberOfBathrooms;
    }

    public  void setNumberOfBathrooms(int numberOfBathrooms){
        this.numberOfBathrooms = numberOfBathrooms;
    }

    //TOILETS
    public int getNumberOfToilets(){
        return numberOfToilets;
    }

    public  void setNumberOfToilets(int numberOfToilets){
        this.numberOfToilets = numberOfToilets;
    }

    //PROPERTY OWNER
    public String getPropertyOwner(){
        return propertyOwner;
    }

    public  void setPropertyOwner(String propertyOwner){
        this.propertyOwner = propertyOwner;
    }

    //DESCRIPTION
    public String getDescription(){
        return  description;
    }

    public  void  setDescription(String Description){
        this.description = description;
    }

    //VALID FORM
    public String getValidForm(){
        return validForm;
    }

    public void setValidForm(String validForm){
        this.validForm = validForm;
    }

    //VALID TO
    public String getValidTo(){
        return validTo;
    }

    public void setValidTo(String validTo){
        this.validTo = validTo;
    }


    @Override
    public String toString(){
        return "[Properties: Property id:" + propertyId +", Property Address:" + propertyAddress +
                ", Property Type:" + propertyType +"]";
    }

    @Override
    public int hashCode() {
        return this.getPropertyId();
    }

    @Override
    public boolean equals(Object obj) {
        LekkiProperty prop = (LekkiProperty) obj ;
        return this.getPropertyId() == prop.getPropertyId();
    }
}
