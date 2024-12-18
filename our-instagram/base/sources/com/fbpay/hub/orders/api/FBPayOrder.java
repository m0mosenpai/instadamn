package com.fbpay.hub.orders.api;

import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FBPayOrder implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(31);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final int A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayOrder) {
                FBPayOrder fBPayOrder = (FBPayOrder) obj;
                if (!C14360o3.A0K(this.A01, fBPayOrder.A01) || !C14360o3.A0K(this.A02, fBPayOrder.A02) || !C14360o3.A0K(this.A03, fBPayOrder.A03) || !C14360o3.A0K(this.A04, fBPayOrder.A04) || !C14360o3.A0K(this.A00, fBPayOrder.A00) || !C14360o3.A0K(this.A05, fBPayOrder.A05) || this.A07 != fBPayOrder.A07 || !C14360o3.A0K(this.A06, fBPayOrder.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC63311ShH.A02(this.A01) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + this.A07) * 31) + AbstractC25235BEs.A06(this.A06);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A07);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
    }

    public FBPayOrder(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt() != 0 ? AbstractC37304Gc5.A0U(parcel) : null;
        this.A05 = parcel.readString();
        this.A07 = parcel.readInt();
        this.A06 = AbstractC58322PtE.A0n(parcel);
    }

    public FBPayOrder(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A01 = str;
        this.A02 = str2;
        AbstractC63311ShH.A04(str3, "orderId");
        this.A03 = str3;
        AbstractC63311ShH.A04(str4, "orderStatus");
        this.A04 = str4;
        this.A00 = num;
        this.A05 = str5;
        this.A07 = i;
        this.A06 = str6;
    }
}
