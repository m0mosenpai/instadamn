package com.facebookpay.msc.transactions.viewmodel;

import X.AnonymousClass001;
import X.C141786av;
import X.VFR;
import X.XGr;
import X.XGs;
import X.XIW;
import X.XIX;
import X.XK6;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class DummyPayoutActivityForTest implements XK6, Parcelable {
    @Override // X.XK6
    public final String Bbn() {
        return "2021-04-01";
    }

    @Override // X.XK6
    public final String Bbp() {
        return "123456789";
    }

    @Override // X.XK6
    public final String Bbv() {
        return "PAID";
    }

    @Override // X.XK6
    public final String getId() {
        return "2053892059";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XGr, java.lang.Object] */
    @Override // X.XK6
    public final XGr Bbt() {
        return new Object();
    }

    @Override // X.XK6
    public final VFR Bbu() {
        return VFR.SETTLED;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XIW] */
    @Override // X.XK6
    public final XIW Bby() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XIX] */
    @Override // X.XK6
    public final XIX Bc1() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XGs, java.lang.Object] */
    @Override // X.XK6
    public final XGs Bc2() {
        return new Object();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        throw new C141786av(AnonymousClass001.A0R("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        throw new C141786av(AnonymousClass001.A0R("An operation is not implemented: ", "Not yet implemented"));
    }
}
