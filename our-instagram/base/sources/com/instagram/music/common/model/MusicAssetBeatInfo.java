package com.instagram.music.common.model;

import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class MusicAssetBeatInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(77);
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public MusicAssetBeatInfo(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A04 = z4;
    }

    public MusicAssetBeatInfo() {
        this(false, 0, false, false, false);
    }
}
