package com.instagram.music.common.model;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class DownloadedTrack implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(74);
    public final int A00;
    public final int A01;
    public final String A02;

    public DownloadedTrack(String str, int i, int i2) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public final int A00(int i) {
        int i2 = this.A01;
        if (i2 != -1) {
            if (i < i2 && i > this.A00 + i2) {
                throw AbstractC166987dD.A14("requested absolute time not in track segment");
            }
            return i - i2;
        }
        return i;
    }
}
