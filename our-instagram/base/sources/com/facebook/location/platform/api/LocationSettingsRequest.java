package com.facebook.location.platform.api;

import X.AbstractC166987dD;
import X.C63472SlD;
import android.os.Parcelable;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationSettingsRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationSettingsRequest.class);

    @SafeParcelable.Field(subClass = LocationRequest.class, value = 1)
    public List mLocationRequests;

    public List getLocationRequests() {
        return this.mLocationRequests;
    }

    public LocationSettingsRequest(List list) {
        this.mLocationRequests = list;
    }

    public LocationSettingsRequest() {
        this.mLocationRequests = AbstractC166987dD.A1E();
    }
}
