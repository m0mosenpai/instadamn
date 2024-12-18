package com.instagram.avatar;

import X.C14360o3;
import X.C70220WId;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class AddAvatarHelper$LoadedImage$LoadedImageMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(9);
    public final int A00;
    public final Uri A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(Uri uri, int i) {
        this.A00 = i;
        this.A01 = uri;
    }
}
