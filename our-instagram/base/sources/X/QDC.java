package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;

/* loaded from: classes10.dex */
public final class QDC extends SZU {
    @Override // X.SZU
    public final /* bridge */ /* synthetic */ void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        super.A01(instantExperiencesJSBridgeCall);
    }

    @Override // X.SZU
    public final /* bridge */ /* synthetic */ void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        instantExperiencesJSBridgeCall.A01();
        instantExperiencesJSBridgeCall.A02(new CanMakePaymentJSBridgeCallResult());
        instantExperiencesJSBridgeCall.A02(new CanMakePaymentJSBridgeCallResult());
        super.A01(instantExperiencesJSBridgeCall);
    }
}
