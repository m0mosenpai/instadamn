package com.facebook.video.heroplayer.ipc;

import X.AbstractC111324zv;
import X.AbstractC53312cF;
import X.AnonymousClass001;
import X.C63473SlE;
import X.EnumC53322cG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FirstDataSegmentCacheCheckStartEvent extends AbstractC53312cF implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(75);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FirstDataSegmentCacheCheckStartEvent(Parcel parcel) {
        super(EnumC53322cG.A0D);
        String readString = parcel.readString();
        this.A04 = readString == null ? "" : readString;
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
    }

    public final String toString() {
        return AnonymousClass001.A11(AnonymousClass001.A0R("videoId=", this.A04), AnonymousClass001.A0Q(AbstractC111324zv.A00(574), this.A01), AnonymousClass001.A0O(AbstractC111324zv.A00(577), this.A00), AnonymousClass001.A0Q(", startPos=", this.A03), AnonymousClass001.A0Q(", requestLength=", this.A02));
    }

    public FirstDataSegmentCacheCheckStartEvent(String str, long j, long j2, long j3, int i) {
        super(EnumC53322cG.A0D);
        this.A04 = str;
        this.A01 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A02 = j3;
    }
}
