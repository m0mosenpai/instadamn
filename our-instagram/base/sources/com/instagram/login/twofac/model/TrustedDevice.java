package com.instagram.login.twofac.model;

import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class TrustedDevice implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(38);
    public double A00;
    public double A01;
    public long A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A08);
    }
}
