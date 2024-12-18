package com.facebookpay.shippingaddress.model;

import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ShippingAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(24);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A03);
    }

    public ShippingAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A01 = str6;
        this.A07 = str7;
        this.A02 = str8;
        this.A06 = str9;
        this.A0B = z;
        this.A0A = z2;
        this.A0C = z3;
        this.A0E = z4;
        this.A0D = z5;
        this.A03 = str10;
    }
}
