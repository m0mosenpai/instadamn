package com.google.android.gms.common.internal;

import X.C63474SlF;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes10.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(43);
    public final IBinder A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.A00);
    }
}
