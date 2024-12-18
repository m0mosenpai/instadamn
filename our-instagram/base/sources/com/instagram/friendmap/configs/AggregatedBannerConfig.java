package com.instagram.friendmap.configs;

import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes8.dex */
public final class AggregatedBannerConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(82);
    public final int A00;
    public final List A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public AggregatedBannerConfig(int i, boolean z, List list) {
        this.A01 = list;
        this.A00 = i;
        this.A02 = z;
    }

    public AggregatedBannerConfig() {
        this(0, true, null);
    }
}
