package com.instagram.direct.model.thread;

import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class DiscoverableThreadInfo implements Parcelable {
    public static final LNL CREATOR = LNL.A00(27);
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
