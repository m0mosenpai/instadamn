package com.instagram.model.payments.common;

import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.payments.CurrencyAmountInfoImpl;

/* loaded from: classes7.dex */
public final class ProductItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(92);
    public int A00;
    public CurrencyAmountInfoImpl A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }
}
