package com.fbpay.hub.common.link;

import X.AbstractC25235BEs;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import X.W4W;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class LinkParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(25);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkParams) {
                LinkParams linkParams = (LinkParams) obj;
                if (this.A00 != linkParams.A00 || this.A01 != linkParams.A01 || this.A02 != linkParams.A02 || !C14360o3.A0K(this.A03, linkParams.A03) || !C14360o3.A0K(this.A04, linkParams.A04) || this.A05 != linkParams.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC58322PtE.A02(this.A05 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public LinkParams(W4W w4w) {
        this.A00 = w4w.A00;
        this.A01 = w4w.A01;
        this.A02 = w4w.A02;
        String str = w4w.A03;
        AbstractC63311ShH.A04(str, "token");
        this.A03 = str;
        String str2 = w4w.A04;
        AbstractC63311ShH.A04(str2, "url");
        this.A04 = str2;
        this.A05 = w4w.A05;
    }

    public LinkParams(Parcel parcel) {
        this.A00 = AbstractC58322PtE.A07(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = AbstractC58320PtC.A1T(parcel);
    }
}
