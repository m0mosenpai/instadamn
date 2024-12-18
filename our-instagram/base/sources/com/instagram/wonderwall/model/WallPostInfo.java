package com.instagram.wonderwall.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import X.C7B;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class WallPostInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(42);
    public final int A00;
    public final int A01;
    public final long A02;
    public final User A03;
    public final WallInfo A04;
    public final C7B A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public WallPostInfo(User user, WallInfo wallInfo, C7B c7b, String str, String str2, List list, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A0a(1, str, user, wallInfo, str2);
        C14360o3.A0B(c7b, 10);
        this.A06 = str;
        this.A03 = user;
        this.A04 = wallInfo;
        this.A07 = str2;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = i;
        this.A08 = list;
        this.A05 = c7b;
        this.A02 = j;
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallPostInfo) {
                WallPostInfo wallPostInfo = (WallPostInfo) obj;
                if (!C14360o3.A0K(this.A06, wallPostInfo.A06) || !C14360o3.A0K(this.A03, wallPostInfo.A03) || !C14360o3.A0K(this.A04, wallPostInfo.A04) || !C14360o3.A0K(this.A07, wallPostInfo.A07) || this.A0B != wallPostInfo.A0B || this.A09 != wallPostInfo.A09 || this.A0A != wallPostInfo.A0A || this.A01 != wallPostInfo.A01 || !C14360o3.A0K(this.A08, wallPostInfo.A08) || this.A05 != wallPostInfo.A05 || this.A02 != wallPostInfo.A02 || this.A00 != wallPostInfo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        this.A04.writeToParcel(parcel, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A01);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A08);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        AbstractC166997dE.A1I(parcel, this.A05);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
    }

    public final boolean A00() {
        C7B c7b = this.A05;
        if (c7b != C7B.A02 && c7b != C7B.A08 && c7b != C7B.A05) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        C7B c7b = this.A05;
        if (c7b != C7B.A08 && c7b != C7B.A05 && c7b != C7B.A09 && c7b != C7B.A07 && c7b != C7B.A06) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A02, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A08, (AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A06))))))) + this.A01) * 31))) + this.A00;
    }
}
