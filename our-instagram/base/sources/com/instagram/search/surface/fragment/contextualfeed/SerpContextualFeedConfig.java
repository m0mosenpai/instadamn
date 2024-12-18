package com.instagram.search.surface.fragment.contextualfeed;

import X.AbstractC25234BEr;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class SerpContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(56);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public SerpContextualFeedConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(str, 1);
        AbstractC25234BEr.A1R(str2, str3, str4, str5, str6);
        this.A05 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A00 = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
    }
}
