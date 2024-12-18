package com.facebook.exoplayer.ipc;

import android.os.Parcel;

/* loaded from: classes10.dex */
public class VpsVideoCacheDatabaseFullEvent extends VideoPlayerServiceEvent {
    public final String A00;

    public VpsVideoCacheDatabaseFullEvent(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    @Override // com.facebook.exoplayer.ipc.VideoPlayerServiceEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
