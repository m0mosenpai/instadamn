package com.facebook.exoplayer.ipc;

import android.os.Parcel;

/* loaded from: classes10.dex */
public class VpsPrefetchStartEvent extends VideoPlayerServiceEvent {
    public String A00;

    @Override // com.facebook.exoplayer.ipc.VideoPlayerServiceEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
