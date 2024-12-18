package com.meta.payments.model.offer;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C55344OhA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class InternalOffer implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(68);
    public final Bundle A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeBundle(this.A00);
    }

    public InternalOffer(Bundle bundle, String str, String str2) {
        AbstractC167027dH.A13(str, str2, bundle);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }
}
