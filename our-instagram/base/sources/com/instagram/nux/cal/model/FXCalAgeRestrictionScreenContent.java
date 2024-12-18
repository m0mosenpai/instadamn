package com.instagram.nux.cal.model;

import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class FXCalAgeRestrictionScreenContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(93);
    public FXCalAgeInfo A00;
    public FXCalAgeInfo A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, 0);
    }
}
