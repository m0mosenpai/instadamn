package com.instagram.camera.effect.models;

import X.AbstractC166997dE;
import X.AbstractC37304Gc5;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class ProfilePicture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(94);
    public final ImageUrl A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public ProfilePicture(Parcel parcel) {
        Parcelable A04 = AbstractC37304Gc5.A04(parcel, ImageUrl.class);
        if (A04 != null) {
            this.A00 = (ImageUrl) A04;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public ProfilePicture(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
