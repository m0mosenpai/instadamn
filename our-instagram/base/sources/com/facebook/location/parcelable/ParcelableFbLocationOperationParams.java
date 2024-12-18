package com.facebook.location.parcelable;

import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.C63473SlE;
import X.SJE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableFbLocationOperationParams extends SJE implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.A07.intValue()) {
            case 1:
                str = "BALANCED_POWER_AND_ACCURACY";
                break;
            case 2:
                str = "HIGH_ACCURACY";
                break;
            default:
                str = "LOW_POWER";
                break;
        }
        parcel.writeString(str);
        parcel.writeLong(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A05);
        Long l = this.A08;
        int i2 = 1;
        parcel.writeInt(AbstractC167007dF.A1W(l) ? 1 : 0);
        if (l != null) {
            AbstractC58318PtA.A1G(parcel, l);
        }
        Float f = this.A06;
        if (f == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (f != null) {
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
        parcel.writeFloat(this.A01);
    }
}
