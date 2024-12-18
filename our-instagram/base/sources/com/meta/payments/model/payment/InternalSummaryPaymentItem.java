package com.meta.payments.model.payment;

import X.AbstractC25234BEr;
import X.C14360o3;
import X.C55344OhA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class InternalSummaryPaymentItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(76);
    public final int A00;
    public final Bundle A01;
    public final PaymentCurrencyAmount A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeBundle(this.A01);
    }

    public InternalSummaryPaymentItem(Bundle bundle, PaymentCurrencyAmount paymentCurrencyAmount, String str, int i) {
        AbstractC25234BEr.A1P(paymentCurrencyAmount, str, bundle);
        this.A02 = paymentCurrencyAmount;
        this.A03 = str;
        this.A00 = i;
        this.A01 = bundle;
    }
}
