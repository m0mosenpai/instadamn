package com.facebook.location.platform.api;

import X.AbstractC166987dD;
import X.AbstractC61286Rkx;
import X.C63472SlD;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationAvailability extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationAvailability.class);

    @SafeParcelable.Field(1)
    public boolean mAvailable;

    @SafeParcelable.Field(3)
    public Bundle mExtras;

    @SafeParcelable.Field(2)
    public String mProvider;

    public static LocationAvailability create(String str, boolean z) {
        return new LocationAvailability(str, z);
    }

    public static LocationAvailability fromIntent(Intent intent) {
        return (LocationAvailability) intent.getParcelableExtra("com.facebook.locationavailability");
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public boolean isAvailable() {
        return this.mAvailable;
    }

    public Bundle optExtras() {
        Bundle bundle = this.mExtras;
        if (bundle == null) {
            return AbstractC166987dD.A0b();
        }
        return bundle;
    }

    public LocationAvailability(String str, boolean z) {
        this(str, z, AbstractC166987dD.A0b());
    }

    public LocationAvailability(String str, boolean z, Bundle bundle) {
        this.mProvider = str;
        this.mAvailable = z;
        this.mExtras = bundle;
    }

    public static LocationAvailability create(String str, boolean z, Bundle bundle) {
        return new LocationAvailability(str, z, bundle);
    }

    public LocationAvailability(AbstractC61286Rkx abstractC61286Rkx) {
        throw AbstractC166987dD.A15("isAvailable");
    }

    public LocationAvailability() {
    }
}
