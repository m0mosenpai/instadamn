package X;

import com.fbpay.w3c.CardDetails;

/* loaded from: classes10.dex */
public abstract class S26 {
    public static final void A00(CardDetails cardDetails) {
        int intValue;
        int length;
        Integer num = cardDetails.A04;
        if (num != null && num.intValue() >= 2000) {
            Integer num2 = cardDetails.A03;
            if (num2 != null && 1 <= (intValue = num2.intValue()) && intValue < 13) {
                String str = cardDetails.A09;
                if (str != null && 3 <= (length = AbstractC25228BEl.A1A(str).length()) && length < 5) {
                    String str2 = cardDetails.A07;
                    if (str2 != null && !AbstractC001900j.A0T(str2)) {
                        return;
                    } else {
                        throw AbstractC166987dD.A12("pan is not defined");
                    }
                }
                throw AbstractC166987dD.A12("csc is not defined");
            }
            throw AbstractC166987dD.A12("expiryMonth is not defined");
        }
        throw AbstractC166987dD.A12("expiryYear is not defined");
    }
}
