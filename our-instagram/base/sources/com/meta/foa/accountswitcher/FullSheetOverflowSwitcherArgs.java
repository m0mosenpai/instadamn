package com.meta.foa.accountswitcher;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class FullSheetOverflowSwitcherArgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(53);
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public FullSheetOverflowSwitcherArgs(FoaUserSession foaUserSession, String str, String str2) {
        AbstractC167027dH.A13(foaUserSession, str, str2);
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }
}
