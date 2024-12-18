package X;

import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentUXFlags;

/* renamed from: X.VNd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68343VNd {
    public static final String A00(PaymentRequestContent paymentRequestContent) {
        C14360o3.A0B(paymentRequestContent, 0);
        java.util.Set<PaymentUXFlags> set = paymentRequestContent.paymentConfiguration.uxFlags;
        if (set != null && set.contains(PaymentUXFlags.META_CHECKOUT)) {
            return "1302814060304063";
        }
        return "742725890006429";
    }
}
