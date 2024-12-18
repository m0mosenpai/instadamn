package com.instagram.wonderwall.model;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class WallMenuConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(40);
    public WallText A00;
    public final List A01 = AbstractC166987dD.A1E();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(1);
    }
}
