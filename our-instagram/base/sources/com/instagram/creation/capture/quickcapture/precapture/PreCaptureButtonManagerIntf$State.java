package com.instagram.creation.capture.quickcapture.precapture;

import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class PreCaptureButtonManagerIntf$State extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(57);
    public final Boolean A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A00;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
    }

    public PreCaptureButtonManagerIntf$State(Boolean bool) {
        this.A00 = bool;
    }

    public PreCaptureButtonManagerIntf$State() {
        this(null);
    }
}
