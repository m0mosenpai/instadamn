package com.facebook.android.instantexperiences.payment;

import X.AbstractC58318PtA;
import X.EnumC61176Rgc;
import X.Rk1;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class PaymentsJSBridgeCall extends InstantExperiencesJSBridgeCall {
    @Override // com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall
    public void A01() {
        super.A01();
        if (((IGInstantExperiencesParameters) this.A02).A00 != null) {
        } else {
            throw new Rk1(EnumC61176Rgc.A0A, String.format(Locale.US, "An App ID must be set to use this call", AbstractC58318PtA.A1b()));
        }
    }
}
