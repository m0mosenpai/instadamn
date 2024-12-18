package com.instagram.login.twofac.model;

import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class TotpSeed implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(37);
    public String A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
