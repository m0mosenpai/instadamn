package com.instagram.mediakit.config;

import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;

/* loaded from: classes6.dex */
public final class MediaKitConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(42);
    public final MediaKitEntryPoint A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public MediaKitConfig(MediaKitEntryPoint mediaKitEntryPoint, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = mediaKitEntryPoint;
    }
}
