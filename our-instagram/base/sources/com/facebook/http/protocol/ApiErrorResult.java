package com.facebook.http.protocol;

import X.C63475SlG;
import X.EnumC61091Rf5;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class ApiErrorResult implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(98);
    public final int A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final EnumC61091Rf5 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A04.toString());
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
    }

    public ApiErrorResult(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A08 = parcel.readString();
        this.A04 = (EnumC61091Rf5) Enum.valueOf(EnumC61091Rf5.class, parcel.readString());
        this.A0A = parcel.dataAvail() > 0 && parcel.readInt() == 1;
        this.A07 = parcel.readString();
        this.A09 = parcel.readString();
    }

    public ApiErrorResult(EnumC61091Rf5 enumC61091Rf5, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A00 = i;
        this.A03 = 0;
        this.A02 = str;
        this.A01 = str2;
        this.A06 = null;
        this.A05 = null;
        this.A04 = enumC61091Rf5;
        this.A08 = null;
        this.A0A = z;
        this.A07 = str3;
        this.A09 = str4;
    }
}
