package com.meta.foa.accountswitcher;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C55344OhA;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class UserAccountInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(54);
    public String A00;
    public List A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserAccountInfo) {
                UserAccountInfo userAccountInfo = (UserAccountInfo) obj;
                if (!C14360o3.A0K(this.A08, userAccountInfo.A08) || !C14360o3.A0K(this.A00, userAccountInfo.A00) || !C14360o3.A0K(this.A02, userAccountInfo.A02) || !C14360o3.A0K(this.A09, userAccountInfo.A09) || !C14360o3.A0K(this.A0A, userAccountInfo.A0A) || !C14360o3.A0K(this.A05, userAccountInfo.A05) || !C14360o3.A0K(this.A06, userAccountInfo.A06) || !C14360o3.A0K(this.A04, userAccountInfo.A04) || !C14360o3.A0K(this.A03, userAccountInfo.A03) || !C14360o3.A0K(this.A07, userAccountInfo.A07) || !C14360o3.A0K(this.A0B, userAccountInfo.A0B) || !C14360o3.A0K(this.A01, userAccountInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeStringList(this.A01);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00() {
        /*
            r3 = this;
            java.lang.String r2 = r3.A09
            r1 = 1
            if (r2 == 0) goto Lc
            int r0 = r2.hashCode()
            switch(r0) {
                case -1000026613: goto L21;
                case -452568510: goto L14;
                case 1002241282: goto L11;
                case 1844922713: goto Le;
                default: goto Lc;
            }
        Lc:
            r1 = 0
        Ld:
            return r1
        Le:
            java.lang.String r0 = "CURRENT"
            goto L1a
        L11:
            r0 = 1682(0x692, float:2.357E-42)
            goto L16
        L14:
            r0 = 318(0x13e, float:4.46E-43)
        L16:
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
        L1a:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld
            goto Lc
        L21:
            java.lang.String r0 = "CURRENT_SHARED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.foa.accountswitcher.UserAccountInfo.A00():boolean");
    }

    public final int hashCode() {
        return ((((((((((((((((AbstractC166997dE.A0K(this.A02, (AbstractC166987dD.A0J(this.A08) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public UserAccountInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        AbstractC167017dG.A1Q(str, str3);
        this.A08 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A04 = str8;
        this.A03 = str9;
        this.A07 = str10;
        this.A0B = str11;
        this.A01 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserAccountInfo(userId=");
        A1C.append(this.A08);
        A1C.append(AbstractC111324zv.A00(573));
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(52));
        A1C.append(this.A02);
        A1C.append(", userType=");
        A1C.append(this.A09);
        A1C.append(", username=");
        A1C.append(this.A0A);
        A1C.append(", name=");
        A1C.append(this.A05);
        A1C.append(MSV.A00(133));
        A1C.append(this.A06);
        A1C.append(", badgeText=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(1400));
        A1C.append(this.A03);
        A1C.append(", unpackedNotifsText=");
        A1C.append(this.A07);
        A1C.append(", facebookAccessToken=");
        A1C.append(this.A0B);
        A1C.append(", facebookSessionCookies=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
