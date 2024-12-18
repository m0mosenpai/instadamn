package com.meta.foa.accountswitcher;

import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DBLSwitcherArgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(52);
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public DBLSwitcherArgs(FoaUserSession foaUserSession, String str, String str2, List list) {
        AbstractC25233BEq.A0w(2, foaUserSession, str, str2);
        this.A03 = list;
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A03);
        while (A0u.hasNext()) {
            ((UserAccountInfo) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
