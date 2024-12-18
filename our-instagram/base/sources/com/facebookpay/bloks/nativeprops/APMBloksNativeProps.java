package com.facebookpay.bloks.nativeprops;

import X.C14360o3;
import X.C63473SlE;
import X.InterfaceC16660sJ;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class APMBloksNativeProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(87);
    public InterfaceC16660sJ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
    }

    public APMBloksNativeProps(String str, String str2, String str3, String str4, String str5, String str6) {
        JQ0.A1O(str, str2, str3, str4, str5);
        C14360o3.A0B(str6, 6);
        this.A06 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A04 = str6;
    }
}
