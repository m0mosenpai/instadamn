package com.instagram.shopping.model;

import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.LinkWithText;

/* loaded from: classes7.dex */
public final class ShippingAndReturnsSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(73);
    public LinkWithText A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
