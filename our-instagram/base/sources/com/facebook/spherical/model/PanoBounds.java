package com.facebook.spherical.model;

import X.AbstractC58321PtD;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class PanoBounds implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(68);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PanoBounds) {
                PanoBounds panoBounds = (PanoBounds) obj;
                if (this.A00 != panoBounds.A00 || this.A01 != panoBounds.A01 || this.A02 != panoBounds.A02 || this.A03 != panoBounds.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.A00) + 31) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
    }

    public PanoBounds(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
    }
}
