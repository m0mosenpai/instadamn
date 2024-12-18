package com.facebook.video.heroplayer.ipc;

import X.AbstractC53312cF;
import X.C63473SlE;
import X.EnumC53322cG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class PrefetchTaskDataFetchIssuedEvent extends AbstractC53312cF implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(77);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PrefetchTaskDataFetchIssuedEvent(Parcel parcel) {
        super(EnumC53322cG.A0X);
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public PrefetchTaskDataFetchIssuedEvent(String str, String str2, String str3) {
        super(EnumC53322cG.A0X);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
