package com.facebook.location.platform.api;

import X.AbstractC166987dD;
import X.AbstractC58320PtC;
import X.C63472SlD;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationResult extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationResult.class);

    @SafeParcelable.Field(100)
    public final Bundle mExtras;

    @SafeParcelable.Field(subClass = Location.class, value = 1)
    public List mLocations;

    public static LocationResult create(List list, Bundle bundle) {
        return new LocationResult(list, bundle);
    }

    public static LocationResult fromIntent(Intent intent) {
        return (LocationResult) intent.getParcelableExtra("com.facebook.location");
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public List getLocations() {
        return this.mLocations;
    }

    public LocationResult(List list, Bundle bundle) {
        this.mLocations = list;
        this.mExtras = bundle;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LocationResult{mLocations=");
        A1C.append(this.mLocations);
        A1C.append(", mExtras=");
        return AbstractC58320PtC.A11(this.mExtras, A1C);
    }

    public LocationResult(List list) {
        this.mLocations = list;
        this.mExtras = AbstractC166987dD.A0b();
    }

    public static LocationResult create(Location location) {
        return new LocationResult(Collections.singletonList(location));
    }

    public LocationResult() {
        this.mLocations = AbstractC166987dD.A1E();
        this.mExtras = null;
    }

    public static LocationResult create(List list) {
        return new LocationResult(list);
    }
}
