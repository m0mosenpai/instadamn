package com.meta.payments.model.payment;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C55344OhA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class InternalPaymentItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(72);
    public final Bundle A00;
    public final PaymentCurrencyAmount A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public InternalPaymentItem(Bundle bundle, PaymentCurrencyAmount paymentCurrencyAmount, Integer num, String str, String str2, String str3, String str4) {
        C14360o3.A0B(bundle, 7);
        this.A01 = paymentCurrencyAmount;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = num;
        this.A03 = str3;
        this.A06 = str4;
        this.A00 = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        PaymentCurrencyAmount paymentCurrencyAmount = this.A01;
        if (paymentCurrencyAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentCurrencyAmount.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeBundle(this.A00);
    }
}
