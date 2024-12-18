package com.instagram.creation.capture.quickcapture.sundial.reshare.model;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class ClipsCelebrationReshareViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(61);
    public final String A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public ClipsCelebrationReshareViewModel(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public ClipsCelebrationReshareViewModel() {
        this(null, false);
    }
}
