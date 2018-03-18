package com.bikeapolis.bikeshare.data.domain.objects;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * Created by princ on 18/03/2018.
 */
public class Bicycle {
    @Id
    private long id;

    private String model;
    private String make;
    private Date manufactureDate;
    private Date purchaseDate;

    private Date lastRevisionDate;
    private String supplierID;
    private String uniqueDetails;

    private Location currentLocation;

    private boolean inUse;
    private boolean inService;

    private InsuranceDetails insuranceDetails;
    private Warranty warranty;
    private List<BicycleServiceHistory> serviceHistoryList;

    public Bicycle(String model, Date purchaseDate, Date manufactureDate, String make, String supplierID, boolean inUse, Location currentLocation) {
        this.model = model;
        this.purchaseDate = purchaseDate;
        this.manufactureDate = manufactureDate;
        this.make = make;
        this.supplierID = supplierID;
        this.inUse = inUse;
        this.currentLocation = currentLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getLastRevisionDate() {
        return lastRevisionDate;
    }

    public void setLastRevisionDate(Date lastRevisionDate) {
        this.lastRevisionDate = lastRevisionDate;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getUniqueDetails() {
        return uniqueDetails;
    }

    public void setUniqueDetails(String uniqueDetails) {
        this.uniqueDetails = uniqueDetails;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public boolean isInService() {
        return inService;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    public InsuranceDetails getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(InsuranceDetails insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public List<BicycleServiceHistory> getServiceHistoryList() {
        return serviceHistoryList;
    }

    public void setServiceHistoryList(List<BicycleServiceHistory> serviceHistoryList) {
        this.serviceHistoryList = serviceHistoryList;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", purchaseDate=" + purchaseDate +
                ", lastRevisionDate=" + lastRevisionDate +
                ", supplierID='" + supplierID + '\'' +
                ", uniqueDetails='" + uniqueDetails + '\'' +
                ", currentLocation=" + currentLocation +
                ", inUse=" + inUse +
                ", inService=" + inService +
                ", insuranceDetails=" + insuranceDetails +
                ", warranty=" + warranty +
                ", serviceHistoryList=" + serviceHistoryList +
                '}';
    }
}
