package com.facebookpay.paypal.model;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.logging.LoggingPolicy;

/* loaded from: classes10.dex */
public final class PaypalConsentLaunchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(23);
    public final LoggingPolicy A00;
    public final LinkableTextParams A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        LinkableTextParams linkableTextParams = this.A01;
        if (linkableTextParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkableTextParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0B ? 1 : 0);
    }

    public PaypalConsentLaunchParams(LoggingPolicy loggingPolicy, LinkableTextParams linkableTextParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A09 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A00 = loggingPolicy;
        this.A02 = str4;
        this.A01 = linkableTextParams;
        this.A03 = str5;
        this.A0A = str6;
        this.A04 = str7;
        this.A06 = str8;
        this.A08 = str9;
        this.A0B = z;
    }
}
