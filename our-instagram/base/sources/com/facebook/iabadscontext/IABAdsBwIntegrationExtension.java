package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC25236BEt;
import X.AbstractC31179DnN;
import X.AbstractC61778RtY;
import X.AbstractC61779RtZ;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IABAdsBwIntegrationExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(3);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABAdsBwIntegrationExtension) {
                IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = (IABAdsBwIntegrationExtension) obj;
                if (this.A01 != iABAdsBwIntegrationExtension.A01 || this.A02 != iABAdsBwIntegrationExtension.A02 || !C14360o3.A0K(this.A07, iABAdsBwIntegrationExtension.A07) || !C14360o3.A0K(this.A03, iABAdsBwIntegrationExtension.A03) || !C14360o3.A0K(this.A05, iABAdsBwIntegrationExtension.A05) || !C14360o3.A0K(this.A04, iABAdsBwIntegrationExtension.A04) || !C14360o3.A0K(this.A00, iABAdsBwIntegrationExtension.A00) || !C14360o3.A0K(this.A06, iABAdsBwIntegrationExtension.A06) || !C14360o3.A0K(this.A08, iABAdsBwIntegrationExtension.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(AbstractC61778RtY.A00(this.A01));
        parcel.writeString(AbstractC61779RtZ.A00(this.A02));
        parcel.writeString(this.A07);
        AbstractC31179DnN.A0q(parcel, this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
    }

    public final int hashCode() {
        Integer num = this.A01;
        int A0C = AbstractC25230BEn.A0C(num, AbstractC61778RtY.A00(num)) * 31;
        Integer num2 = this.A02;
        return ((((((((((((AbstractC167017dG.A0L(num2, AbstractC61779RtZ.A00(num2), A0C) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A08);
    }

    public IABAdsBwIntegrationExtension(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1P(num, num2);
        this.A01 = num;
        this.A02 = num2;
        this.A07 = str;
        this.A03 = l;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = num3;
        this.A06 = str4;
        this.A08 = str5;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IABAdsBwIntegrationExtension(bwIType=");
        Integer num = this.A01;
        if (num != null) {
            str = AbstractC61778RtY.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", partnerType=");
        Integer num2 = this.A02;
        if (num2 != null) {
            str2 = AbstractC61779RtZ.A00(num2);
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", loadingPageUrl=");
        A1C.append(this.A07);
        A1C.append(", oauthIntegrationId=");
        A1C.append(this.A03);
        A1C.append(", apiKey=");
        A1C.append(this.A05);
        A1C.append(", accessToken=");
        A1C.append(this.A04);
        A1C.append(", accessTokenExpiryDateInSecs=");
        A1C.append(this.A00);
        A1C.append(", bauProductUrl=");
        A1C.append(this.A06);
        A1C.append(", pageName=");
        return AbstractC25236BEt.A0Y(this.A08, A1C);
    }
}
