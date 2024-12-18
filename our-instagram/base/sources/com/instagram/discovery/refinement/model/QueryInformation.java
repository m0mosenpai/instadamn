package com.instagram.discovery.refinement.model;

import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class QueryInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(64);
    public String A00 = "";
    public String A01 = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
