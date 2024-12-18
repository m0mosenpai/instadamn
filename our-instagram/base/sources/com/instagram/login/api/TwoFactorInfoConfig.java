package com.instagram.login.api;

import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class TwoFactorInfoConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(36);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public TwoFactorInfoConfig(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AbstractC167017dG.A1P(str, str2);
        AbstractC25229BEm.A1L(str3, 6, str5);
        this.A04 = str;
        this.A00 = str2;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A03 = str3;
        this.A09 = z4;
        this.A0A = z5;
        this.A08 = z6;
        this.A06 = z7;
        this.A02 = str4;
        this.A01 = str5;
        this.A05 = z8;
        this.A07 = z9;
    }
}
