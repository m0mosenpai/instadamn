package com.instagram.business.model;

import X.AbstractC37304Gc5;
import X.AbstractC58320PtC;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public class PagePhotoItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(42);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public PagePhotoItem(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
        this.A03 = AbstractC58320PtC.A1T(parcel);
        this.A01 = parcel.readString();
    }
}
