package com.facebook.android.instantexperiences.payment;

import X.AbstractC116315Ok;
import X.AbstractC58320PtC;
import X.C63475SlG;
import X.EnumC61176Rgc;
import X.Rk1;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class PaymentsCheckoutJSBridgeCall extends PaymentsJSBridgeCall {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(2);

    @Override // com.facebook.android.instantexperiences.payment.PaymentsJSBridgeCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall
    public final void A01() {
        super.A01();
        if (!AbstractC116315Ok.A00(String.valueOf(AbstractC58320PtC.A0r(this.A01, "configuration")))) {
        } else {
            throw new Rk1(EnumC61176Rgc.A06, "Checkout configuration object can not be null or empty");
        }
    }
}
