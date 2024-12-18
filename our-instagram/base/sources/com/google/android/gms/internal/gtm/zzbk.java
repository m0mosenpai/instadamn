package com.google.android.gms.internal.gtm;

import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class zzbk implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(28);
    public String A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    @Deprecated
    public zzbk() {
    }
}
