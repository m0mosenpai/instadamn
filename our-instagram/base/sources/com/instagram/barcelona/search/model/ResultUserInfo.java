package com.instagram.barcelona.search.model;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C5Hc;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class ResultUserInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(20);
    public final String A00;
    public final ImageUrl A01;
    public final FollowStatus A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final C5Hc A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ResultUserInfo) {
                ResultUserInfo resultUserInfo = (ResultUserInfo) obj;
                if (!C14360o3.A0K(this.A00, resultUserInfo.A00) || !C14360o3.A0K(this.A07, resultUserInfo.A07) || !C14360o3.A0K(this.A04, resultUserInfo.A04) || !C14360o3.A0K(this.A01, resultUserInfo.A01) || this.A0E != resultUserInfo.A0E || !C14360o3.A0K(this.A05, resultUserInfo.A05) || !C14360o3.A0K(this.A06, resultUserInfo.A06) || !C14360o3.A0K(this.A08, resultUserInfo.A08) || this.A09 != resultUserInfo.A09 || this.A02 != resultUserInfo.A02 || this.A0B != resultUserInfo.A0B || this.A0D != resultUserInfo.A0D || this.A0A != resultUserInfo.A0A || this.A0C != resultUserInfo.A0C || !C14360o3.A0K(this.A03, resultUserInfo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C5Hc c5Hc = this.A08;
        if (c5Hc == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, c5Hc);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A09, (((((AbstractC167007dF.A0D(this.A0E, (((AbstractC166997dE.A0K(this.A07, this.A00.hashCode() * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31))));
        Integer num = this.A03;
        if (num != null) {
            i = num.hashCode();
        }
        return A0D + i;
    }

    public ResultUserInfo(ImageUrl imageUrl, FollowStatus followStatus, Integer num, String str, String str2, String str3, String str4, String str5, C5Hc c5Hc, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A01 = imageUrl;
        this.A0E = z;
        this.A05 = str4;
        this.A06 = str5;
        this.A08 = c5Hc;
        this.A09 = z2;
        this.A02 = followStatus;
        this.A0B = z3;
        this.A0D = z4;
        this.A0A = z5;
        this.A0C = z6;
        this.A03 = num;
    }
}
