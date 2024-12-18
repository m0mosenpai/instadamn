package com.instagram.leadgen.core.model.privacypolicy;

import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LeadGenPrivacyPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(26);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public LeadGenPrivacyPolicy(String str, String str2, String str3, String str4, String str5) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = str4;
        this.A01 = str5;
    }
}
