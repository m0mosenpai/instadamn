package com.facebook.iabeventlogging.model;

import X.C63473SlE;
import X.EnumC61218RhI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public abstract class IABEvent implements Parcelable {
    public static final IABEmptyEvent A04 = new IABEmptyEvent();
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(21);
    public final long A00;
    public final long A01;
    public final EnumC61218RhI A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02.A00);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public IABEvent(EnumC61218RhI enumC61218RhI, String str, long j, long j2) {
        this.A02 = enumC61218RhI;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }
}
