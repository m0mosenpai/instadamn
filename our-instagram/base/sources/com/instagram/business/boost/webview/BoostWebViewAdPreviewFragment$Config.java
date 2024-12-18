package com.instagram.business.boost.webview;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class BoostWebViewAdPreviewFragment$Config implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(31);
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
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public BoostWebViewAdPreviewFragment$Config(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A0E = z;
        this.A0D = z2;
        this.A05 = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A0B = z6;
        this.A0C = z7;
        this.A08 = z8;
        this.A07 = z9;
        this.A04 = z10;
        this.A06 = z11;
        this.A00 = str4;
    }
}
