package com.instagram.wonderwall.model;

import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class WallLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(38);
    public Destination A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public WallLaunchConfig(Destination destination, String str) {
        this.A01 = str;
        this.A00 = destination;
    }
}
