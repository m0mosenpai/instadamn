package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PaymentHandledResponseData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(57);
    public final String A00;

    public PaymentHandledResponseData(Integer num, String str) {
        C14360o3.A0B(num, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString("SUBMIT_CONTAINER");
        parcel.writeString(this.A00);
    }
}
