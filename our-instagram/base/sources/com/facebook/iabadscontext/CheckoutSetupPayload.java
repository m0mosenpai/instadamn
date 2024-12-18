package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class CheckoutSetupPayload extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(0);
    public final Availability A00;
    public final ReceiverInfo A01;
    public final PaymentConfig A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutSetupPayload) {
                CheckoutSetupPayload checkoutSetupPayload = (CheckoutSetupPayload) obj;
                if (!C14360o3.A0K(this.A02, checkoutSetupPayload.A02) || !C14360o3.A0K(this.A00, checkoutSetupPayload.A00) || !C14360o3.A0K(this.A01, checkoutSetupPayload.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        this.A00.writeToParcel(parcel, i);
        ReceiverInfo receiverInfo = this.A01;
        if (receiverInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            receiverInfo.writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A01);
    }

    public CheckoutSetupPayload(Availability availability, PaymentConfig paymentConfig, ReceiverInfo receiverInfo) {
        AbstractC167017dG.A1P(paymentConfig, availability);
        this.A02 = paymentConfig;
        this.A00 = availability;
        this.A01 = receiverInfo;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CheckoutSetupPayload(paymentConfig=");
        A1C.append(this.A02);
        A1C.append(", availability=");
        A1C.append(this.A00);
        A1C.append(", receiverInfo=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
