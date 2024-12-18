package com.fbpay.w3c;

import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37302Gc3;
import X.AbstractC37304Gc5;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public class CardDetails implements Parcelable, CardDetailsSpec {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(46);
    public final Address A00;
    public final ImmutableList A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public CardDetails(Address address, ImmutableList immutableList, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = address;
        this.A01 = immutableList;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A03 = num;
        this.A04 = num2;
        this.A02 = bool;
        this.A0A = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardDetails) {
                CardDetails cardDetails = (CardDetails) obj;
                if (!C14360o3.A0K(this.A00, cardDetails.A00) || !C14360o3.A0K(this.A01, cardDetails.A01) || !C14360o3.A0K(this.A05, cardDetails.A05) || !C14360o3.A0K(this.A06, cardDetails.A06) || !C14360o3.A0K(this.A07, cardDetails.A07) || !C14360o3.A0K(this.A08, cardDetails.A08) || !C14360o3.A0K(this.A09, cardDetails.A09) || !C14360o3.A0K(this.A03, cardDetails.A03) || !C14360o3.A0K(this.A04, cardDetails.A04) || !C14360o3.A0K(this.A02, cardDetails.A02) || !C14360o3.A0K(this.A0A, cardDetails.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A0A);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58323PtF.A1A(parcel, this.A00, i);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1LC A0d = AbstractC58322PtE.A0d(parcel, immutableList);
            while (A0d.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0d);
            }
        }
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A08, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A09, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        AbstractC31179DnN.A0p(parcel, this.A02);
        AbstractC58322PtE.A1E(parcel, this.A0A, 0, 1);
    }

    public CardDetails(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Address) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A01 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
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
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbstractC37304Gc5.A0U(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = AbstractC37304Gc5.A0U(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() == 1) : null;
        this.A0A = AbstractC58322PtE.A0n(parcel);
    }
}
