package com.instagram.model.fundraiser;

import X.AbstractC167007dF;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class FundraiserDisplayInfoModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(82);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public FundraiserDisplayInfoModel(String str, String str2, String str3, String str4, String str5) {
        AbstractC167007dF.A1G(str3, 3, str5);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A03 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }
}
