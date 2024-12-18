package com.instagram.business.promote.model;

import X.AbstractC43594JPz;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class IGBoostPackage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(53);
    public ImageUrl A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
