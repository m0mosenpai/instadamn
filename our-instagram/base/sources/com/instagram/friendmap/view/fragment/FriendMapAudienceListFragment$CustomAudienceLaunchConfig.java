package com.instagram.friendmap.view.fragment;

import X.AbstractC43594JPz;
import X.EnumC92974Es;
import X.InterfaceC16660sJ;
import X.LNL;
import X.ML4;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class FriendMapAudienceListFragment$CustomAudienceLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(87);
    public EnumC92974Es A00 = EnumC92974Es.A04;
    public InterfaceC16660sJ A01 = ML4.A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
