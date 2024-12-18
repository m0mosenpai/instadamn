package com.instagram.feed.su.model;

import X.AbstractC167007dF;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class MiddleStateCardUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(73);
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

    public MiddleStateCardUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        AbstractC167007dF.A1F(str, 1, str4);
        this.A08 = str;
        this.A09 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A03 = str5;
        this.A07 = str6;
        this.A04 = str7;
        this.A05 = str8;
        this.A06 = str9;
        this.A01 = str10;
        this.A0A = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
