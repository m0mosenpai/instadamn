package com.facebook.location.platform.api;

import X.C63472SlD;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationSettingsStates extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationSettingsStates.class);

    @SafeParcelable.Field(2)
    public boolean mGpsUsable;

    @SafeParcelable.Field(1)
    public boolean mLocationUsable;

    @SafeParcelable.Field(3)
    public boolean mNetworkUsable;

    public boolean isGpsUsable() {
        return this.mGpsUsable;
    }

    public boolean isLocationUsable() {
        return this.mLocationUsable;
    }

    public boolean isNetworkUsable() {
        return this.mNetworkUsable;
    }

    public LocationSettingsStates(boolean z, boolean z2, boolean z3) {
        this.mLocationUsable = z;
        this.mGpsUsable = z2;
        this.mNetworkUsable = z3;
    }

    public LocationSettingsStates() {
    }
}
