package com.fbpay.hub.contactinfo.address.api;

import X.AbstractC25235BEs;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FBPayAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(26);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public FBPayAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A06 = null;
        this.A00 = str;
        this.A01 = str2;
        this.A07 = null;
        this.A09 = false;
        this.A08 = null;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayAddress) {
                FBPayAddress fBPayAddress = (FBPayAddress) obj;
                if (!C14360o3.A0K(this.A06, fBPayAddress.A06) || !C14360o3.A0K(this.A00, fBPayAddress.A00) || !C14360o3.A0K(this.A01, fBPayAddress.A01) || !C14360o3.A0K(this.A07, fBPayAddress.A07) || this.A09 != fBPayAddress.A09 || !C14360o3.A0K(this.A08, fBPayAddress.A08) || !C14360o3.A0K(this.A02, fBPayAddress.A02) || !C14360o3.A0K(this.A03, fBPayAddress.A03) || !C14360o3.A0K(this.A04, fBPayAddress.A04) || !C14360o3.A0K(this.A05, fBPayAddress.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC63311ShH.A02(this.A06) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC58322PtE.A02(this.A09 ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A00, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
        parcel.writeInt(this.A09 ? 1 : 0);
        AbstractC58322PtE.A1E(parcel, this.A08, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
    }

    public FBPayAddress(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A09 = AbstractC58320PtC.A1T(parcel);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A05 = AbstractC58322PtE.A0n(parcel);
    }
}
