package com.instagram.common.gallery;

import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class GeneratedMediaMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(54);
    public final String A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public GeneratedMediaMetadata(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public GeneratedMediaMetadata() {
        this(null, false);
    }
}
