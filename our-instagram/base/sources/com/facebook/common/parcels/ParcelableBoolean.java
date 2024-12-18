package com.facebook.common.parcels;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableBoolean implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(74);
    public final boolean A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public ParcelableBoolean(boolean z) {
        this.A00 = z;
    }
}
