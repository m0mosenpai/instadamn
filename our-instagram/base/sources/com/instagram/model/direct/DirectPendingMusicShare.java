package com.instagram.model.direct;

import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes6.dex */
public final class DirectPendingMusicShare implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(64);
    public ExtendedImageUrl A00 = null;
    public String A05 = null;
    public String A04 = null;
    public String A02 = null;
    public String A01 = null;
    public String A03 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
