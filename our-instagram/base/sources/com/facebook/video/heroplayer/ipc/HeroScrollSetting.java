package com.facebook.video.heroplayer.ipc;

import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class HeroScrollSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(24);
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mEnableExoPlayerThreadScrollAware=");
        sb.append(this.A02);
        sb.append(",mEnableLoaderChunkTaskQueueExecutorThreadScrollAware=");
        sb.append(this.A03);
        sb.append(",mScrollAwareThreadDowngradePriority=");
        sb.append(this.A00);
        sb.append(",mDisableExoPlayerBornScrollAware=");
        sb.append(this.A01);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public HeroScrollSetting(int i, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = i;
        this.A01 = z3;
    }

    public HeroScrollSetting(Parcel parcel) {
        this.A02 = parcel.readInt() == 1;
        this.A03 = parcel.readInt() == 1;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() == 1;
    }

    public HeroScrollSetting() {
        this.A02 = false;
        this.A03 = false;
        this.A00 = 19;
        this.A01 = false;
    }
}
