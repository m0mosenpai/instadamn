package com.instagram.model.direct.threadkey.util;

import X.AbstractC2054897w;
import X.C14360o3;
import X.C9Ay;
import X.InterfaceC83713oG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class ThreadTargetParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(9);
    public final InterfaceC83713oG A00;

    public ThreadTargetParcelable(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 1);
        this.A00 = interfaceC83713oG;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC2054897w.A03(parcel, this.A00, i);
    }
}
