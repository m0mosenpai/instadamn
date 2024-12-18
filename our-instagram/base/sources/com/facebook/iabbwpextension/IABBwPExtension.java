package com.facebook.iabbwpextension;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC25236BEt;
import X.AbstractC61780Rta;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IABBwPExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(20);
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public IABBwPExtension(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        C14360o3.A0B(num, 1);
        this.A01 = num;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = str4;
        this.A06 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABBwPExtension) {
                IABBwPExtension iABBwPExtension = (IABBwPExtension) obj;
                if (this.A01 != iABBwPExtension.A01 || !C14360o3.A0K(this.A05, iABBwPExtension.A05) || !C14360o3.A0K(this.A03, iABBwPExtension.A03) || !C14360o3.A0K(this.A02, iABBwPExtension.A02) || this.A00 != iABBwPExtension.A00 || !C14360o3.A0K(this.A04, iABBwPExtension.A04) || !C14360o3.A0K(this.A06, iABBwPExtension.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(AbstractC61780Rta.A00(this.A01));
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
    }

    public final int hashCode() {
        Integer num = this.A01;
        return (((((((((((AbstractC25230BEn.A0C(num, AbstractC61780Rta.A00(num)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IABBwPExtension(bwPType=");
        Integer num = this.A01;
        if (num != null) {
            str = AbstractC61780Rta.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", loadingPageUrl=");
        A1C.append(this.A05);
        A1C.append(", apiKey=");
        A1C.append(this.A03);
        A1C.append(", accessToken=");
        A1C.append(this.A02);
        A1C.append(", accessTokenExpiryDateInSecs=");
        A1C.append(this.A00);
        A1C.append(", bauProductUrl=");
        A1C.append(this.A04);
        A1C.append(", pageName=");
        return AbstractC25236BEt.A0Y(this.A06, A1C);
    }
}
