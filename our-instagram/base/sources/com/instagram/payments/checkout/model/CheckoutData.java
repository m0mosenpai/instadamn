package com.instagram.payments.checkout.model;

import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;

/* loaded from: classes7.dex */
public class CheckoutData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(0);
    public CheckoutLaunchParams A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
