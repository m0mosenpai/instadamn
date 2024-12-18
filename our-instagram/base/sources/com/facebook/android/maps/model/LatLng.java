package com.facebook.android.maps.model;

import X.AbstractC166997dE;
import X.AbstractC31173DnH;
import X.AbstractC58317Pt9;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63475SlG(8);
    public final double A00;
    public final double A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Math.abs(this.A00 - latLng.A00) < 0.002d && Math.abs(this.A01 - latLng.A01) < 2.0E-4d;
    }

    public final double A00(LatLng latLng) {
        double d = this.A00;
        double d2 = latLng.A00;
        return Math.sqrt(Math.pow(d - d2, 2.0d) + Math.pow((this.A01 - latLng.A01) * Math.cos(Math.toRadians(d2)), 2.0d)) * 110250.0d;
    }

    public final int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC31173DnH.A0q(this));
        sb.append("{latitude=");
        sb.append(this.A00);
        sb.append(AbstractC58317Pt9.A00(434));
        sb.append(this.A01);
        return AbstractC166997dE.A0x("}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }

    public LatLng(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public LatLng(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }
}
