package com.meta.foa.cds;

import X.AbstractC66261U6f;
import X.C55344OhA;
import X.XBW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class CdsOpenScreenCallerDismissCallback implements CdsOpenScreenDismissCallback {
    public static final Parcelable.Creator CREATOR = new C55344OhA(59);
    public final XBW A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.meta.foa.cds.CdsOpenScreenDismissCallback
    public final void DAh(int i) {
        this.A00.EL9(i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(AbstractC66261U6f.A00(this.A00));
    }

    public CdsOpenScreenCallerDismissCallback(XBW xbw) {
        this.A00 = xbw;
    }
}
