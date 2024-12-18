package com.instagram.model.shopping;

import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class ProductAREffectContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(9);
    public ProductItemWithAR A00;
    public boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
    }
}
