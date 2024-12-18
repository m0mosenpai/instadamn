package com.meta.payments.model.payment;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class InternalPaymentContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(70);
    public final int A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public InternalPaymentContainer(int i, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
