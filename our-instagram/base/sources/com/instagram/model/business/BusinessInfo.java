package com.instagram.model.business;

import X.C35130FeX;
import X.C55343Oh9;
import X.EnumC222416a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
public class BusinessInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(53);
    public Address A00;
    public PublicPhoneContact A01;
    public EnumC222416a A02;
    public EnumC222416a A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A0M);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeByte(this.A0N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0S ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0R ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0P ? (byte) 1 : (byte) 0);
        EnumC222416a enumC222416a = this.A02;
        String str2 = null;
        if (enumC222416a != null) {
            str = String.valueOf(enumC222416a.A00);
        } else {
            str = null;
        }
        parcel.writeString(str);
        EnumC222416a enumC222416a2 = this.A03;
        if (enumC222416a2 != null) {
            str2 = String.valueOf(enumC222416a2.A00);
        }
        parcel.writeString(str2);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0H);
    }

    public BusinessInfo(C35130FeX c35130FeX) {
        this.A09 = c35130FeX.A09;
        this.A0A = c35130FeX.A0A;
        this.A0B = c35130FeX.A0B;
        this.A01 = c35130FeX.A01;
        this.A0J = c35130FeX.A0J;
        this.A0L = c35130FeX.A0L;
        this.A00 = c35130FeX.A00;
        this.A0M = c35130FeX.A0M;
        this.A0K = c35130FeX.A0K;
        this.A05 = c35130FeX.A05;
        this.A04 = c35130FeX.A04;
        this.A06 = c35130FeX.A06;
        this.A07 = c35130FeX.A07;
        this.A08 = c35130FeX.A08;
        this.A0N = c35130FeX.A0N;
        this.A0C = c35130FeX.A0C;
        this.A0D = c35130FeX.A0D;
        this.A0E = c35130FeX.A0E;
        this.A0F = c35130FeX.A0F;
        this.A0Q = c35130FeX.A0Q;
        this.A0S = c35130FeX.A0S;
        this.A0R = c35130FeX.A0R;
        this.A0O = c35130FeX.A0O;
        this.A0P = c35130FeX.A0P;
        this.A02 = c35130FeX.A02;
        this.A03 = c35130FeX.A03;
        this.A0G = c35130FeX.A0G;
        this.A0I = c35130FeX.A0I;
        this.A0H = c35130FeX.A0H;
    }
}
