package com.instagram.tagging.api.model;

import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* loaded from: classes9.dex */
public final class MediaSuggestedProductTagProductItemContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(3);
    public float A00;
    public ProductDetailsProductItemDict A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeFloat(this.A00);
    }
}
