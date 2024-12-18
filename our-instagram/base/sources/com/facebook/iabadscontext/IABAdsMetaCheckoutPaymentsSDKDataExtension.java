package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IABAdsMetaCheckoutPaymentsSDKDataExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(6);
    public final CheckoutSetupPayload A00;
    public final String A01;

    public IABAdsMetaCheckoutPaymentsSDKDataExtension(CheckoutSetupPayload checkoutSetupPayload, String str) {
        C14360o3.A0B(checkoutSetupPayload, 1);
        this.A00 = checkoutSetupPayload;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABAdsMetaCheckoutPaymentsSDKDataExtension) {
                IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = (IABAdsMetaCheckoutPaymentsSDKDataExtension) obj;
                if (!C14360o3.A0K(this.A00, iABAdsMetaCheckoutPaymentsSDKDataExtension.A00) || !C14360o3.A0K(this.A01, iABAdsMetaCheckoutPaymentsSDKDataExtension.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
