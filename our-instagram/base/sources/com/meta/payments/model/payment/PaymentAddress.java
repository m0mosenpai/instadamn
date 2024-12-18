package com.meta.payments.model.payment;

import X.C14360o3;
import X.C55344OhA;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes9.dex */
public final class PaymentAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(77);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A08);
    }

    public PaymentAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        JQ0.A1O(list, str, str2, str3, str4);
        this.A09 = list;
        this.A00 = str;
        this.A07 = str2;
        this.A01 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A02 = str8;
        this.A08 = str9;
    }
}
