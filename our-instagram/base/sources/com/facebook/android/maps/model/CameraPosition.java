package com.facebook.android.maps.model;

import X.AbstractC166997dE;
import X.AbstractC31173DnH;
import X.AbstractC37304Gc5;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63475SlG(7);
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.A00 == cameraPosition.A00) {
            LatLng latLng = this.A03;
            LatLng latLng2 = cameraPosition.A03;
            if (latLng == null) {
                if (latLng2 == null) {
                    return true;
                }
            } else if (latLng.equals(latLng2) && this.A01 == cameraPosition.A01 && this.A02 == cameraPosition.A02) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f;
        if (this.A03 != null) {
            f = 527.0f + r0.hashCode();
        } else {
            f = 17.0f;
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC31173DnH.A0q(this));
        sb.append("{target=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A02);
        sb.append(", tilt=");
        sb.append(this.A01);
        sb.append(", bearing=");
        sb.append(this.A00);
        return AbstractC166997dE.A0x("}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public CameraPosition(Parcel parcel) {
        this.A03 = (LatLng) AbstractC37304Gc5.A04(parcel, LatLng.class);
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this.A03 = latLng;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }
}
