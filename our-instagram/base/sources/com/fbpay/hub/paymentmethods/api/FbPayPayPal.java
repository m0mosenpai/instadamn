package com.fbpay.hub.paymentmethods.api;

import X.AbstractC167007dF;
import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FbPayPayPal implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(37);
    public final String A00;
    public final String A01;
    public final String A02;
    public final FbPayPaymentDefaultInfo A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPayPal) {
                FbPayPayPal fbPayPayPal = (FbPayPayPal) obj;
                if (!C14360o3.A0K(this.A04, fbPayPayPal.A04) || !C14360o3.A0K(this.A05, fbPayPayPal.A05) || this.A08 != fbPayPayPal.A08 || !C14360o3.A0K(this.A06, fbPayPayPal.A06) || !C14360o3.A0K(this.A07, fbPayPayPal.A07) || !C14360o3.A0K(this.A00, fbPayPayPal.A00) || !C14360o3.A0K(this.A01, fbPayPayPal.A01) || !C14360o3.A0K(this.A02, fbPayPayPal.A02) || this.A09 != fbPayPayPal.A09 || !C14360o3.A0K(this.A03, fbPayPayPal.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC63311ShH.A02(this.A04) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC58322PtE.A02(this.A08 ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC58322PtE.A02(this.A09 ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        parcel.writeInt(this.A08 ? 1 : 0);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A09 ? 1 : 0);
        AbstractC58323PtF.A1A(parcel, this.A03, i);
    }

    public FbPayPayPal(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A08 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A09 = AbstractC58320PtC.A1V(parcel);
        this.A03 = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0g) : null;
    }

    public FbPayPayPal(String str, String str2, String str3) {
        this.A04 = null;
        this.A05 = null;
        this.A08 = false;
        this.A06 = null;
        this.A07 = null;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A09 = false;
        this.A03 = null;
    }
}
