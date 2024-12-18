package com.instagram.discoverpeople.model;

import X.AbstractC167027dH;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class FindPeopleButtonOverride implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(50);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public FindPeopleButtonOverride(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }
}
