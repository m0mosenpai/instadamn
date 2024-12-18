package com.meta.payments.model.configuration;

import X.AbstractC167007dF;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.C55344OhA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class InternalPaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(64);
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final Bundle A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;

    public InternalPaymentConfiguration(Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, int i2) {
        AbstractC167007dF.A1G(str, 3, str2);
        C14360o3.A0B(bundle, 13);
        this.A02 = i;
        this.A03 = i2;
        this.A09 = str;
        this.A0C = list;
        this.A0A = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A00 = str6;
        this.A0B = str7;
        this.A08 = str8;
        this.A06 = str9;
        this.A04 = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A09);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0C);
        while (A0u.hasNext()) {
            parcel.writeInt(AbstractC167007dF.A0B(A0u));
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeBundle(this.A04);
    }
}
