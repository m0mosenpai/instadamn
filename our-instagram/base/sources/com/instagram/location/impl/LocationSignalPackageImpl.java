package com.instagram.location.impl;

import X.C103804lz;
import X.C202098wp;
import X.C55343Oh9;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage;
import com.instagram.location.intf.LocationSignalPackage;

/* loaded from: classes9.dex */
public class LocationSignalPackageImpl implements LocationSignalPackage {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(31);
    public final C202098wp A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.instagram.location.intf.LocationSignalPackage
    public final Location BOK() {
        C103804lz c103804lz = this.A00.A02;
        if (c103804lz != null) {
            return new Location(c103804lz.A00);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((LocationSignalPackageImpl) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableLocationSignalPackage.A00(this.A00), 0);
    }

    public LocationSignalPackageImpl(C202098wp c202098wp) {
        this.A00 = c202098wp;
    }
}
