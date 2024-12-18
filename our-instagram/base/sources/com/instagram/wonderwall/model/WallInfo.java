package com.instagram.wonderwall.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class WallInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(37);
    public final User A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallInfo) {
                WallInfo wallInfo = (WallInfo) obj;
                if (!C14360o3.A0K(this.A01, wallInfo.A01) || !C14360o3.A0K(this.A04, wallInfo.A04) || !C14360o3.A0K(this.A00, wallInfo.A00) || this.A03 != wallInfo.A03 || this.A02 != wallInfo.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A01)))));
    }

    public WallInfo(User user, String str, String str2, boolean z, boolean z2) {
        AbstractC167027dH.A13(str, str2, user);
        this.A01 = str;
        this.A04 = str2;
        this.A00 = user;
        this.A03 = z;
        this.A02 = z2;
    }
}
