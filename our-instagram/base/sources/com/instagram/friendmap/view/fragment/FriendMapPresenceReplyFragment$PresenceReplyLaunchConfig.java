package com.instagram.friendmap.view.fragment;

import X.AbstractC43594JPz;
import X.C05F;
import X.C50236MGr;
import X.InterfaceC16820sZ;
import X.LNL;
import X.MP7;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(89);
    public MP7 A00;
    public String A03 = "";
    public String A02 = "";
    public InterfaceC16820sZ A04 = C50236MGr.A00;
    public Integer A01 = C05F.A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
