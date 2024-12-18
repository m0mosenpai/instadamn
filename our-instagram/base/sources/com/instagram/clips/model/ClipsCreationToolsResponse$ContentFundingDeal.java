package com.instagram.clips.model;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class ClipsCreationToolsResponse$ContentFundingDeal implements Parcelable {
    public static final LNM CREATOR = new LNM(0);
    public long A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
