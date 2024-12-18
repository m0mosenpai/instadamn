package com.instagram.creation.base.ui.mediatabbar;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class Tab implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(39);
    public final int A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public Tab(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
