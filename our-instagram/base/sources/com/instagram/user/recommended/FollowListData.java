package com.instagram.user.recommended;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C55344OhA;
import X.EnumC31556Dtg;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class FollowListData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(25);
    public final EnumC31556Dtg A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public FollowListData(EnumC31556Dtg enumC31556Dtg, String str, String str2, String str3, boolean z) {
        this.A00 = enumC31556Dtg;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
        this.A01 = str3;
    }
}
