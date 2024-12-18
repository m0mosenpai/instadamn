package com.instagram.location.surface.data;

import X.AbstractC37304Gc5;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class LocationPageInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(34);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public LocationPageInfo(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
