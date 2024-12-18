package com.instagram.wellbeing.supportinbox.model;

import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class SupportInboxDetailBottomSheetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(31);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
