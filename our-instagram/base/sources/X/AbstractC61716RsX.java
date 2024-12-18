package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;

/* renamed from: X.RsX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61716RsX {
    public static final void A00(C62620SJd c62620SJd, AutofillData autofillData, CardDetails cardDetails, Integer num) {
        Integer num2;
        AbstractC167017dG.A1N(c62620SJd, num);
        if (autofillData == null) {
            if (cardDetails != null) {
                num2 = C05F.A01;
            } else {
                return;
            }
        } else if (cardDetails != null) {
            num2 = C05F.A0C;
        } else {
            num2 = C05F.A00;
        }
        Integer num3 = C05F.A00;
        C51760Mtj c51760Mtj = new C51760Mtj(num3, num2, num3, 3);
        Integer num4 = C05F.A0C;
        AbstractC62769SQl.A01(c62620SJd, c51760Mtj, num4);
        if (num == num4 && num2 != num4) {
            if (num2 == num3) {
                num3 = C05F.A01;
            }
            AbstractC62769SQl.A01(c62620SJd, new C51760Mtj(num3, num3, num3, 3), C05F.A0N);
        }
    }
}
