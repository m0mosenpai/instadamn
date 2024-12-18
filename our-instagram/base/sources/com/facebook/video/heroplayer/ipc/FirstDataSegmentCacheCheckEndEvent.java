package com.facebook.video.heroplayer.ipc;

import X.AbstractC111324zv;
import X.AbstractC53312cF;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C63473SlE;
import X.EnumC53322cG;
import X.EnumC92424Bx;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FirstDataSegmentCacheCheckEndEvent extends AbstractC53312cF implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(74);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final EnumC92424Bx A05;
    public final String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FirstDataSegmentCacheCheckEndEvent(Parcel parcel) {
        super(EnumC53322cG.A0C);
        String readString = parcel.readString();
        this.A06 = readString == null ? "" : readString;
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        EnumC92424Bx enumC92424Bx = (EnumC92424Bx) AbstractC58321PtD.A0n(parcel, EnumC92424Bx.class);
        this.A05 = enumC92424Bx == null ? EnumC92424Bx.NOT_APPLY : enumC92424Bx;
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A05);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
    }

    public final String toString() {
        return AnonymousClass001.A15(AnonymousClass001.A0R("videoId=", this.A06), AnonymousClass001.A0Q(AbstractC111324zv.A00(574), this.A01), AnonymousClass001.A0O(AbstractC111324zv.A00(577), this.A00), AnonymousClass001.A0R(AbstractC111324zv.A00(1401), this.A05.A01), AnonymousClass001.A0Q(", startPos=", this.A04), AnonymousClass001.A0Q(", requestLength=", this.A03), AnonymousClass001.A0Q(", readByteLength=", this.A02));
    }

    public FirstDataSegmentCacheCheckEndEvent(EnumC92424Bx enumC92424Bx, String str, int i, long j, long j2, long j3, long j4) {
        super(EnumC53322cG.A0C);
        this.A06 = str;
        this.A01 = j;
        this.A00 = i;
        this.A05 = enumC92424Bx;
        this.A04 = j2;
        this.A03 = j3;
        this.A02 = j4;
    }
}
