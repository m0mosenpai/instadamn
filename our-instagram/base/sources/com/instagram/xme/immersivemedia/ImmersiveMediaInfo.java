package com.instagram.xme.immersivemedia;

import X.AbstractC37304Gc5;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class ImmersiveMediaInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(47);
    public Boolean A00 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
    }
}
