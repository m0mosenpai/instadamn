package com.instagram.friendmap.view.fragment;

import X.AbstractC43594JPz;
import X.C16930sl;
import X.C50232MGn;
import X.InterfaceC16820sZ;
import X.LNL;
import X.MP7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes8.dex */
public final class FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(88);
    public MP7 A00;
    public Double A01;
    public Double A02;
    public List A03 = C16930sl.A00;
    public InterfaceC16820sZ A04 = C50232MGn.A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
