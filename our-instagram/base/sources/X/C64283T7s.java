package X;

import com.fbpay.hub.paymentmethods.api.FbPayPayPal;

/* renamed from: X.T7s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64283T7s implements C2n2 {
    public static final C64283T7s A00 = new C64283T7s();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS optionalTreeField;
        C2JS optionalTreeField2;
        C2JS reinterpretRequired;
        String A08;
        C2JS optionalTreeField3;
        C2JS reinterpretRequired2;
        String A082;
        C2JS optionalTreeField4;
        C2JS optionalTreeField5;
        C2JS reinterpretRequired3;
        C2JS c2js = (C2JS) obj;
        String str = null;
        if (c2js != null && (optionalTreeField4 = c2js.getOptionalTreeField(0, "complete_paypal_linking(data:$data)", C59868QqE.class, -700900385)) != null && (optionalTreeField5 = optionalTreeField4.getOptionalTreeField(0, "paypal_ba", C59867QqD.class, -1149812327)) != null && (reinterpretRequired3 = optionalTreeField5.reinterpretRequired(0, C59921Qr5.class, -2089290323)) != null) {
            str = reinterpretRequired3.getOptionalStringField(0, "email");
        }
        if (str != null) {
            if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "complete_paypal_linking(data:$data)", C59868QqE.class, -700900385)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "paypal_ba", C59867QqD.class, -1149812327)) != null && (reinterpretRequired = optionalTreeField2.reinterpretRequired(0, C59921Qr5.class, -2089290323)) != null && (A08 = reinterpretRequired.A08("strong_id__")) != null) {
                C2JS optionalTreeField6 = c2js.getOptionalTreeField(0, "complete_paypal_linking(data:$data)", C59868QqE.class, -700900385);
                if (optionalTreeField6 != null && (optionalTreeField3 = optionalTreeField6.getOptionalTreeField(0, "paypal_ba", C59867QqD.class, -1149812327)) != null && (reinterpretRequired2 = optionalTreeField3.reinterpretRequired(0, C59921Qr5.class, -2089290323)) != null && (A082 = reinterpretRequired2.A08("strong_id__")) != null) {
                    return new FbPayPayPal(A082, str, A08);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
