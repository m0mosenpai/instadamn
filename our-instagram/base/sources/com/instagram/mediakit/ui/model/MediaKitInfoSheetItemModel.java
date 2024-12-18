package com.instagram.mediakit.ui.model;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class MediaKitInfoSheetItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(49);
    public Object[] A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
    }

    public MediaKitInfoSheetItemModel(Integer num, Integer num2, Integer num3) {
        this.A03 = num;
        this.A01 = num2;
        this.A02 = num3;
        this.A00 = new Object[0];
    }

    public MediaKitInfoSheetItemModel() {
        this(null, null, null);
    }
}
