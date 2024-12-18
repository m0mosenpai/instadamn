package com.instagram.fanclub.intf;

import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class FanClubGuidedActivationProfileBannerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(69);
    public final int A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public FanClubGuidedActivationProfileBannerParams(int i) {
        this.A00 = i;
    }
}
