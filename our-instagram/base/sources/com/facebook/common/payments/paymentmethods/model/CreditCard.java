package com.facebook.common.payments.paymentmethods.model;

import X.AbstractC37304Gc5;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class CreditCard implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(77);
    public final AdditionalFields A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }

    public CreditCard(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = (AdditionalFields) AbstractC37304Gc5.A04(parcel, AdditionalFields.class);
    }
}
