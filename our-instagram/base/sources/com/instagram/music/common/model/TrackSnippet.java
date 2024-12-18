package com.instagram.music.common.model;

import X.AnonymousClass001;
import X.C14360o3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class TrackSnippet implements Parcelable {
    public int A00;
    public int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0X("TrackSnippet[startTimeInMs=", ", durationInMs=", ']', this.A01, this.A00);
    }
}
