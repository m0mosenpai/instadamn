package X;

import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentRequest;
import java.util.Locale;

/* renamed from: X.VNc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68342VNc {
    public static PaymentReceiverInfo A00(InterfaceC72010XEy interfaceC72010XEy, PaymentRequest paymentRequest) {
        String str;
        PaymentConfiguration paymentConfiguration = paymentRequest.content.paymentConfiguration;
        C14360o3.A0B(paymentConfiguration, 0);
        String str2 = paymentConfiguration.partnerId;
        if (str2.length() > 0) {
            String str3 = paymentConfiguration.partnerMerchantId;
            if (str3.length() > 0) {
                String str4 = paymentConfiguration.merchantName;
                String format = String.format(Locale.ROOT, "%s::%s", MSX.A1b(str2, str3, 2));
                C14360o3.A07(format);
                String str5 = null;
                PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo(null, str4, null, format);
                PaymentReceiverInfo A00 = interfaceC72010XEy.AnO().A00();
                String str6 = null;
                if (A00 != null) {
                    str = A00.A02;
                } else {
                    str = null;
                }
                PaymentReceiverInfo A002 = interfaceC72010XEy.AnO().A00();
                if (A002 != null) {
                    str5 = A002.A03;
                }
                PaymentReceiverInfo A003 = interfaceC72010XEy.AnO().A00();
                if (A003 != null) {
                    str6 = A003.A01;
                }
                PaymentReceiverInfo paymentReceiverInfo2 = new PaymentReceiverInfo(str, str5, str6, paymentReceiverInfo.A00);
                String str7 = paymentReceiverInfo2.A02;
                if (str7 != null && str7.length() != 0) {
                    return paymentReceiverInfo2;
                }
                return paymentReceiverInfo;
            }
        }
        return interfaceC72010XEy.AnO().A00();
    }
}
