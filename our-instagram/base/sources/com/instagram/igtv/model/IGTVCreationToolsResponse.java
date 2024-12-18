package com.instagram.igtv.model;

import X.C14360o3;
import X.C40781ul;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.video.ShoppingCreationConfig;

/* loaded from: classes9.dex */
public final class IGTVCreationToolsResponse extends C40781ul implements Parcelable {
    public static final C55343Oh9 CREATOR = C55343Oh9.A00(2);
    public ShoppingCreationConfig A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
