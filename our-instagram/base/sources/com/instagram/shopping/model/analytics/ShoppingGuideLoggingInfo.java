package com.instagram.shopping.model.analytics;

import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ShoppingGuideLoggingInfo implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(75);
    public final long A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
    }

    public ShoppingGuideLoggingInfo(Parcel parcel) {
        this.A00 = parcel.readLong();
    }
}
