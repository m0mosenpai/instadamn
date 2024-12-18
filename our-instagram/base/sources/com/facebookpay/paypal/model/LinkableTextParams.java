package com.facebookpay.paypal.model;

import X.C14360o3;
import X.C63470SlB;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class LinkableTextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(22);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
    }

    public LinkableTextParams(String str, int i, int i2, String str2) {
        MSZ.A1O(str, str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str2;
    }
}
