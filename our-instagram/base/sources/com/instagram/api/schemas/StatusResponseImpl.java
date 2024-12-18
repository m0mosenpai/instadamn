package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.AbstractC25234BEr;
import X.AbstractC31181DnP;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class StatusResponseImpl extends C0T6 implements Parcelable, StatusResponse {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(7);
    public final StatusStyle A00;
    public final StatusStyleResponseInfo A01;
    public final StatusType A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public StatusResponseImpl(StatusStyle statusStyle, StatusStyleResponseInfo statusStyleResponseInfo, StatusType statusType, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        AbstractC167007dF.A1H(str5, 5, statusStyle);
        AbstractC25234BEr.A0l(8, statusType, statusStyleResponseInfo, str6, str7);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A03 = num;
        this.A00 = statusStyle;
        this.A02 = statusType;
        this.A01 = statusStyleResponseInfo;
        this.A09 = str6;
        this.A0A = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StatusResponseImpl) {
                StatusResponseImpl statusResponseImpl = (StatusResponseImpl) obj;
                if (!C14360o3.A0K(this.A04, statusResponseImpl.A04) || !C14360o3.A0K(this.A05, statusResponseImpl.A05) || !C14360o3.A0K(this.A06, statusResponseImpl.A06) || !C14360o3.A0K(this.A07, statusResponseImpl.A07) || !C14360o3.A0K(this.A08, statusResponseImpl.A08) || !C14360o3.A0K(this.A03, statusResponseImpl.A03) || this.A00 != statusResponseImpl.A00 || this.A02 != statusResponseImpl.A02 || !C14360o3.A0K(this.A01, statusResponseImpl.A01) || !C14360o3.A0K(this.A09, statusResponseImpl.A09) || !C14360o3.A0K(this.A0A, statusResponseImpl.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A03));
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0A, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A00, (AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04))))) + AbstractC167017dG.A0M(this.A03)) * 31)))));
    }
}
