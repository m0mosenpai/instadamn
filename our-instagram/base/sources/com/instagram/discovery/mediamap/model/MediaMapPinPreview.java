package com.instagram.discovery.mediamap.model;

import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class MediaMapPinPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(63);
    public ImageUrl A00;
    public String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
