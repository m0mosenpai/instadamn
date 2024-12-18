package com.instagram.model.comments;

import X.AbstractC167007dF;
import X.C14360o3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ParcelableCommenterDetails implements Parcelable {
    public final double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public ParcelableCommenterDetails(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A06 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A05 = parcel.readInt() == 1;
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public ParcelableCommenterDetails(String str, String str2, String str3, String str4, double d, boolean z, boolean z2) {
        this.A00 = d;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }
}
