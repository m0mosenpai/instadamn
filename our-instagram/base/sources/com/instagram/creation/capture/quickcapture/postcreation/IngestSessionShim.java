package com.instagram.creation.capture.quickcapture.postcreation;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes4.dex */
public final class IngestSessionShim implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(56);
    public final List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public IngestSessionShim(List list) {
        this.A00 = list;
    }
}
