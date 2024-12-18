package com.instagram.direct.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class DirectForwardingParams extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(22);
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectForwardingParams) {
                DirectForwardingParams directForwardingParams = (DirectForwardingParams) obj;
                if (!C14360o3.A0K(this.A07, directForwardingParams.A07) || !C14360o3.A0K(this.A06, directForwardingParams.A06) || this.A0A != directForwardingParams.A0A || !C14360o3.A0K(this.A01, directForwardingParams.A01) || !C14360o3.A0K(this.A02, directForwardingParams.A02) || !C14360o3.A0K(this.A04, directForwardingParams.A04) || this.A0B != directForwardingParams.A0B || !C14360o3.A0K(this.A05, directForwardingParams.A05) || !C14360o3.A0K(this.A08, directForwardingParams.A08) || !C14360o3.A0K(this.A03, directForwardingParams.A03) || !C14360o3.A0K(this.A00, directForwardingParams.A00) || !C14360o3.A0K(this.A09, directForwardingParams.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0A ? 1 : 0);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        parcel.writeString(this.A09);
    }

    public final int hashCode() {
        return ((((((((AbstractC167007dF.A0D(this.A0B, (((((AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A07))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A09);
    }

    public DirectForwardingParams(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        AbstractC167017dG.A1P(str, str2);
        this.A07 = str;
        this.A06 = str2;
        this.A0A = z;
        this.A01 = num;
        this.A02 = num2;
        this.A04 = str3;
        this.A0B = z2;
        this.A05 = str4;
        this.A08 = str5;
        this.A03 = num3;
        this.A00 = num4;
        this.A09 = str6;
    }

    public DirectForwardingParams() {
        this(null, null, null, null, "", "", null, null, null, null, false, false);
    }
}
