package com.facebook.cellinfo.parcelable;

import X.C202088wo;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class ParcelableCdmaCellInfo extends C202088wo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63475SlG(69);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A04);
    }
}
