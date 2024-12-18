package com.facebook.android.instantexperiences.payment.chargerequest;

import X.AbstractC116315Ok;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.EnumC61176Rgc;
import X.Rk1;
import android.os.Parcel;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class PaymentsChargeRequestCall extends InstantExperiencesJSBridgeCall {
    public String A00;

    @Override // com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall
    public final void A01() {
        super.A01();
        if (!AbstractC116315Ok.A00(String.valueOf(AbstractC58320PtC.A0r(this.A01, "paymentId")))) {
            if (((IGInstantExperiencesParameters) this.A02).A00 != null) {
                return;
            } else {
                throw new Rk1(EnumC61176Rgc.A0A, String.format(Locale.US, "An App ID must be set to use this call", AbstractC58318PtA.A1b()));
            }
        }
        throw new Rk1(EnumC61176Rgc.A06, "Payment ID can not be null or empty");
    }

    @Override // com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
