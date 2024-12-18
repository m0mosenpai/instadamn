package com.facebookpay.incentives.model;

import X.C14360o3;
import X.C63470SlB;
import X.R0Z;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class FeaturedIncentiveDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(8);
    public final R0Z A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeString(this.A01);
    }

    public FeaturedIncentiveDetails(R0Z r0z, String str) {
        this.A00 = r0z;
        this.A01 = str;
    }

    public FeaturedIncentiveDetails() {
        this(null, null);
    }
}
