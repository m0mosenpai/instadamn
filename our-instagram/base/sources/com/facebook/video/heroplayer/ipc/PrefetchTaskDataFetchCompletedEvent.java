package com.facebook.video.heroplayer.ipc;

import X.AbstractC53312cF;
import X.C63473SlE;
import X.EnumC53322cG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class PrefetchTaskDataFetchCompletedEvent extends AbstractC53312cF implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(76);
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PrefetchTaskDataFetchCompletedEvent(Parcel parcel) {
        super(EnumC53322cG.A0W);
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
    }

    public PrefetchTaskDataFetchCompletedEvent(long j, String str, String str2, String str3, String str4, long j2) {
        super(EnumC53322cG.A0W);
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = -1L;
        this.A03 = str4;
    }
}
