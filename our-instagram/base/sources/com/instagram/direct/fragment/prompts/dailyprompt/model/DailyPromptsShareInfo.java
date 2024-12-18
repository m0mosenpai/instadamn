package com.instagram.direct.fragment.prompts.dailyprompt.model;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC31179DnN;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class DailyPromptsShareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(1);
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        AbstractC31179DnN.A0p(parcel, this.A00);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
    }

    public DailyPromptsShareInfo(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC167017dG.A1Q(str, str3);
        C14360o3.A0B(str7, 9);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A02 = str5;
        this.A00 = bool;
        this.A01 = num;
        this.A08 = str6;
        this.A03 = str7;
    }
}
