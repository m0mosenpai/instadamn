package com.facebook.common.payments.model;

import X.AbstractC25230BEn;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(75);
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
    }

    public Address(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A01 = parcel.readString();
        this.A05 = parcel.readString();
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0E = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0F = AbstractC25230BEn.A1Q(parcel.readInt());
        this.A0B = parcel.readString();
        this.A0D = parcel.readString();
        this.A09 = parcel.readString();
        this.A0C = parcel.readString();
    }
}
