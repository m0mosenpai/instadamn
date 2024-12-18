package com.instagram.creation.capture.quickcapture.aspectratioutil;

import X.AbstractC43594JPz;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;

/* loaded from: classes8.dex */
public class NoOpCreationLayoutConfig implements Parcelable, CreationLayoutConfig {
    public static final Parcelable.Creator CREATOR = LNM.A00(47);

    @Override // com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig
    public final boolean CV5() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig
    public final int BRK() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
