package com.facebook.android.maps.model;

import X.AbstractC31173DnH;
import X.AbstractC37304Gc5;
import X.AbstractC58320PtC;
import X.C63475SlG;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class LatLngBounds implements Parcelable {
    public static final LatLngBounds A02 = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = new C63475SlG(9);
    public final LatLng A00;
    public final LatLng A01;

    public static double A00(double d, double d2) {
        double d3 = d - d2;
        int i = 0;
        if (d3 < 0.0d) {
            i = 360;
        }
        return d3 + i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.A00.equals(latLngBounds.A00) && this.A01.equals(latLngBounds.A01);
    }

    public final boolean A01(LatLng latLng) {
        double d = latLng.A00;
        LatLng latLng2 = this.A00;
        if (d <= latLng2.A00) {
            LatLng latLng3 = this.A01;
            if (d >= latLng3.A00) {
                double d2 = latLng3.A01;
                double d3 = latLng2.A01;
                double d4 = latLng.A01;
                if (d2 < d3) {
                    if (d4 < d2) {
                        return false;
                    }
                } else if (d4 >= d2) {
                    return true;
                }
                if (d4 <= d3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((527 + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC31173DnH.A0q(this));
        sb.append("{northeast=");
        sb.append(this.A00);
        sb.append(", southwest=");
        return JQ0.A0l(this.A01, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public LatLngBounds(Parcel parcel) {
        this.A00 = (LatLng) AbstractC37304Gc5.A04(parcel, LatLng.class);
        this.A01 = (LatLng) AbstractC37304Gc5.A04(parcel, LatLng.class);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        double d = latLng.A00;
        double d2 = latLng2.A00;
        if (d <= d2) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Southern latitude (");
        sb.append(d);
        sb.append(") exceeds Northern latitude (");
        sb.append(d2);
        throw AbstractC58320PtC.A0m(").", sb);
    }
}
