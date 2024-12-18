package com.fbpay.w3c;

import X.AbstractC25235BEs;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class Address implements Parcelable, AddressSpec {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(45);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Address) {
                Address address = (Address) obj;
                if (!C14360o3.A0K(this.A00, address.A00) || !C14360o3.A0K(this.A01, address.A01) || !C14360o3.A0K(this.A02, address.A02) || !C14360o3.A0K(this.A03, address.A03) || !C14360o3.A0K(this.A04, address.A04) || !C14360o3.A0K(this.A05, address.A05) || !C14360o3.A0K(this.A06, address.A06) || !C14360o3.A0K(this.A07, address.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A07);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A00, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
    }

    public Address(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
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
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
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
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A07 = AbstractC58322PtE.A0n(parcel);
    }
}
