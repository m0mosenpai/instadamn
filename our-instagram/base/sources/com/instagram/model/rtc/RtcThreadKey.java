package com.instagram.model.rtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes9.dex */
public final class RtcThreadKey extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(5);
    public final DirectThreadKey A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public RtcThreadKey(DirectThreadKey directThreadKey, String str, String str2, String str3) {
        C14360o3.A0B(directThreadKey, 1);
        this.A00 = directThreadKey;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        String str4 = directThreadKey.A00;
        if (str4 != null) {
            this.A02 = str4;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcThreadKey) {
                RtcThreadKey rtcThreadKey = (RtcThreadKey) obj;
                if (!C14360o3.A0K(this.A00, rtcThreadKey.A00) || !C14360o3.A0K(this.A04, rtcThreadKey.A04) || !C14360o3.A0K(this.A01, rtcThreadKey.A01) || !C14360o3.A0K(this.A03, rtcThreadKey.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcThreadKey(key=");
        A1C.append(this.A00);
        A1C.append(", openThreadId=");
        A1C.append(this.A04);
        A1C.append(", armadilloThreadId=");
        A1C.append(this.A01);
        A1C.append(", occamadilloThreadId=");
        return AbstractC25236BEt.A0Y(this.A03, A1C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RtcThreadKey(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            r1 = 0
            com.instagram.model.direct.DirectThreadKey r0 = new com.instagram.model.direct.DirectThreadKey
            if (r4 != 0) goto L10
            r0.<init>(r3, r1)
        Lc:
            r2.<init>(r0, r5, r6, r7)
            return
        L10:
            r0.<init>(r3, r1)
            r0.A01 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.rtc.RtcThreadKey.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
