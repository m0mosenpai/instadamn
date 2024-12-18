package com.facebook.location.platform.api;

import X.C63472SlD;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class Place extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(Place.class);

    @SafeParcelable.Field(1)
    public final String mId;

    @SafeParcelable.Field(3)
    public double mLatitude;

    @SafeParcelable.Field(4)
    public double mLongitude;

    @SafeParcelable.Field(2)
    public final String mName;

    public String getId() {
        return this.mId;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getName() {
        return this.mName;
    }

    public Place(String str, String str2) {
        this.mId = str;
        this.mName = str2;
    }

    public void setLatitude(double d) {
        this.mLatitude = d;
    }

    public void setLongitude(double d) {
        this.mLongitude = d;
    }

    public Place() {
        this.mId = null;
        this.mName = null;
    }
}
