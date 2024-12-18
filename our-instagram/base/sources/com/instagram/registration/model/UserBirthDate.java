package com.instagram.registration.model;

import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class UserBirthDate implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(39);
    public int A00;
    public int A01;
    public int A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
