package com.instagram.bugreporter;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public class BugReportComposerViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(26);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
    }

    public BugReportComposerViewModel(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z3;
    }
}
