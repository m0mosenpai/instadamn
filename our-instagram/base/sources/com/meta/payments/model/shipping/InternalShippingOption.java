package com.meta.payments.model.shipping;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C55344OhA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.payments.model.payment.PaymentCurrencyAmount;

/* loaded from: classes9.dex */
public final class InternalShippingOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(81);
    public final Bundle A00;
    public final PaymentCurrencyAmount A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeBundle(this.A00);
    }

    public InternalShippingOption(Bundle bundle, PaymentCurrencyAmount paymentCurrencyAmount, String str, String str2, String str3, boolean z) {
        AbstractC167027dH.A13(paymentCurrencyAmount, str, str2);
        C14360o3.A0B(bundle, 6);
        this.A01 = paymentCurrencyAmount;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = z;
        this.A00 = bundle;
    }
}
