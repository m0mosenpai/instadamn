package com.facebook.video.heroplayer.ipc;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58320PtC;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class VideoProtocolProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(79);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public VideoProtocolProps(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A02 = AbstractC58320PtC.A1V(parcel);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("subscriptionUrl: '");
        A1C.append(this.A00);
        A1C.append("', broadcasterForcedPlayback: ");
        A1C.append(this.A01);
        A1C.append(", isVideoEligible: ");
        A1C.append(this.A02);
        return A1C.toString();
    }

    public VideoProtocolProps() {
        this.A00 = "";
        this.A01 = false;
        this.A02 = false;
    }
}
