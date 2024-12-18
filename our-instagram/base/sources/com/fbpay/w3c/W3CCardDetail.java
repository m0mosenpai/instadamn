package com.fbpay.w3c;

import X.AbstractC167007dF;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37304Gc5;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class W3CCardDetail implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(50);
    public final CardDetails A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W3CCardDetail) {
                W3CCardDetail w3CCardDetail = (W3CCardDetail) obj;
                if (!C14360o3.A0K(this.A00, w3CCardDetail.A00) || this.A05 != w3CCardDetail.A05 || !C14360o3.A0K(this.A01, w3CCardDetail.A01) || !C14360o3.A0K(this.A02, w3CCardDetail.A02) || !C14360o3.A0K(this.A03, w3CCardDetail.A03) || !C14360o3.A0K(this.A04, w3CCardDetail.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC58322PtE.A02(this.A05 ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        AbstractC31179DnN.A0p(parcel, this.A01);
        parcel.writeString(this.A02);
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
    }

    public W3CCardDetail(Parcel parcel) {
        this.A00 = (CardDetails) AbstractC37304Gc5.A04(parcel, getClass());
        this.A05 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Boolean.valueOf(AbstractC58320PtC.A1V(parcel));
        }
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A04 = AbstractC58322PtE.A0n(parcel);
    }

    public W3CCardDetail(CardDetails cardDetails, Boolean bool, String str, String str2, String str3, boolean z) {
        this.A00 = cardDetails;
        this.A05 = z;
        this.A01 = bool;
        AbstractC63311ShH.A04(str, "latestBoundDevice");
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }
}
