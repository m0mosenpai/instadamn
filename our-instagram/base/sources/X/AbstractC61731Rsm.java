package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;

/* renamed from: X.Rsm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61731Rsm {
    public static final SYH A00(AutofillData autofillData, CardDetails cardDetails) {
        if (autofillData == null && cardDetails == null) {
            return null;
        }
        return new SYH(autofillData, cardDetails);
    }
}
