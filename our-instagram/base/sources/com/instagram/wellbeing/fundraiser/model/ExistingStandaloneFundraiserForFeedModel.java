package com.instagram.wellbeing.fundraiser.model;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class ExistingStandaloneFundraiserForFeedModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(30);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public ExistingStandaloneFundraiserForFeedModel(String str, String str2, String str3, String str4) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }
}
