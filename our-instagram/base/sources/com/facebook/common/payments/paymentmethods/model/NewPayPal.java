package com.facebook.common.payments.paymentmethods.model;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class NewPayPal implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(79);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public NewPayPal(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public NewPayPal() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
    }
}
