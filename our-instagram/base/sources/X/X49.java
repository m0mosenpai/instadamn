package X;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class X49 extends C0YY implements InterfaceC16820sZ {
    public static final X49 A00 = new X49();

    public X49() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHECKOUT_ERROR", "Proactive checkout is not supported for this user.");
        hashMap.put("SECURITY_ERROR", "Security domain mismatch. Payment availability and request are from different domains.");
        hashMap.put("ABORTED", "User cancelled checkout.");
        hashMap.put("“MULTIPLE_CHECKOUT_REQUEST", "Payment checkout request issued when there is an outstanding request.");
        hashMap.put("INTERNAL_ERROR", "There was an internal error.");
        hashMap.put("CHECKOUT_ERROR_RISK", "Risk assessment blocked payment request.");
        hashMap.put("PARTNER_MISMATCH", "Partner id mismatch. Payment availability and requests are using different partner id.");
        hashMap.put("MERCHANT_MISMATCH", "Merchant id mismatch. Payment availability and requests are using different merchant id.");
        hashMap.put("CHECKOUT_UNAVAILABLE", "Checkout requested when unavailable.");
        hashMap.put("PAYMENT_MODE_MISMATCH", "Payment mode mismatch. Payment availability and payment request have different modes.");
        hashMap.put("ECP_LAUNCH_PARAMS_NULL", "ECPPaymentRequest was null.");
        hashMap.put("DISMISSED_FOR_SESSION", "User has dismissed Meta payment for this browser session.");
        return hashMap;
    }
}
