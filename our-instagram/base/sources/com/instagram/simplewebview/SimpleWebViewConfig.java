package com.instagram.simplewebview;

import X.C14360o3;
import X.C37324GcR;
import X.SXK;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class SimpleWebViewConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(94);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public SimpleWebViewConfig(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str3, String str4) {
        this(str4, (String) null, str3, (String) null, z12, false, z3, z7, z8, z9, z10, z6, z5, false, z4, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public SimpleWebViewConfig(SXK sxk) {
        this(sxk.A0F, sxk.A01, sxk.A02, sxk.A00, sxk.A0E, sxk.A0D, sxk.A05, sxk.A09, sxk.A0A, sxk.A0B, sxk.A0C, sxk.A08, sxk.A07, sxk.A04, sxk.A06, sxk.A03);
    }

    public SimpleWebViewConfig(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A0F = z;
        this.A0E = z2;
        this.A06 = z3;
        this.A0A = z4;
        this.A0B = z5;
        this.A0C = z6;
        this.A0D = z7;
        this.A09 = z8;
        this.A08 = z9;
        this.A05 = z10;
        this.A07 = z11;
        this.A04 = z12;
        this.A00 = str4;
    }
}
