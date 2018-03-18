package com.bikeapolis.bikeshare.data.domain.objects;

import java.util.Date;
import java.util.List;

/**
 * Created by princ on 18/03/2018.
 */
public class BicycleServiceHistory {
    Date servicingDate;
    long bicycleId;
    long garageID;

    String details;
    boolean serviceComplete;
    boolean bicyclePassed;

    List<SpareParts> partsUsed;
}
