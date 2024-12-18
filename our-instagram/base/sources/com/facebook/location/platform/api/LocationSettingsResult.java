package com.facebook.location.platform.api;

import X.C63472SlD;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationSettingsResult extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationSettingsResult.class);

    @SafeParcelable.Field(2)
    public LocationSettingsStates settings;

    @SafeParcelable.Field(1)
    public LocationSettingsStatus status;

    public LocationSettingsStates getSettings() {
        return this.settings;
    }

    public LocationSettingsStatus getStatus() {
        return this.status;
    }

    public boolean isSuccess() {
        LocationSettingsStatus locationSettingsStatus = this.status;
        if (locationSettingsStatus != null && locationSettingsStatus.mStatusCode == 0) {
            return true;
        }
        return false;
    }

    public LocationSettingsResult(LocationSettingsStatus locationSettingsStatus, LocationSettingsStates locationSettingsStates) {
        this.status = locationSettingsStatus;
        this.settings = locationSettingsStates;
    }

    public LocationSettingsResult() {
    }
}
