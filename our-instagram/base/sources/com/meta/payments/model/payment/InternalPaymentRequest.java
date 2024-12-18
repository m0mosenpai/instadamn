package com.meta.payments.model.payment;

import X.AbstractC25234BEr;
import X.C14360o3;
import X.C55344OhA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.payments.model.configuration.InternalPaymentConfiguration;

/* loaded from: classes9.dex */
public final class InternalPaymentRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(74);
    public final Bundle A00;
    public final InternalPaymentConfiguration A01;
    public final InternalPaymentDetails A02;
    public final InternalPaymentOptions A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        this.A02.writeToParcel(parcel, i);
        InternalPaymentOptions internalPaymentOptions = this.A03;
        if (internalPaymentOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            internalPaymentOptions.writeToParcel(parcel, i);
        }
        parcel.writeBundle(this.A00);
    }

    public InternalPaymentRequest(Bundle bundle, InternalPaymentConfiguration internalPaymentConfiguration, InternalPaymentDetails internalPaymentDetails, InternalPaymentOptions internalPaymentOptions) {
        AbstractC25234BEr.A1P(internalPaymentConfiguration, internalPaymentDetails, bundle);
        this.A01 = internalPaymentConfiguration;
        this.A02 = internalPaymentDetails;
        this.A03 = internalPaymentOptions;
        this.A00 = bundle;
    }
}
