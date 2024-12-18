package com.meta.payments.model.payment;

import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.C55344OhA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.payments.model.offer.InternalOffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class InternalPaymentResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(75);
    public final Bundle A00;
    public final InternalPaymentContainer A01;
    public final PaymentAddress A02;
    public final PaymentAddress A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        this.A01.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        PaymentAddress paymentAddress = this.A03;
        if (paymentAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentAddress.writeToParcel(parcel, i);
        }
        PaymentAddress paymentAddress2 = this.A02;
        if (paymentAddress2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentAddress2.writeToParcel(parcel, i);
        }
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A09);
        while (A0u.hasNext()) {
            ((InternalOffer) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeBundle(this.A00);
    }

    public InternalPaymentResponse(Bundle bundle, InternalPaymentContainer internalPaymentContainer, PaymentAddress paymentAddress, PaymentAddress paymentAddress2, String str, String str2, String str3, String str4, String str5, List list) {
        AbstractC167027dH.A13(str, str2, internalPaymentContainer);
        C14360o3.A0B(bundle, 10);
        this.A06 = str;
        this.A07 = str2;
        this.A01 = internalPaymentContainer;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = str5;
        this.A03 = paymentAddress;
        this.A02 = paymentAddress2;
        this.A09 = list;
        this.A00 = bundle;
    }
}
