package com.instagram.creation.genai.magicmod.model;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class MagicModTopicInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(73);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public MagicModTopicInfo(String str, String str2, String str3, String str4, boolean z) {
        this.A03 = str;
        this.A04 = z;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }
}
