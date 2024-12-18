package X;

import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.LoggingPolicy;
import java.util.List;

/* renamed from: X.Wxj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71637Wxj implements Runnable {
    public final /* synthetic */ CheckoutConfiguration A00;
    public final /* synthetic */ ECPPaymentConfiguration A01;
    public final /* synthetic */ EcpUIConfiguration A02;
    public final /* synthetic */ PaymentReceiverInfo A03;
    public final /* synthetic */ TransactionInfo A04;
    public final /* synthetic */ C69642Vsj A05;
    public final /* synthetic */ LoggingPolicy A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;

    public RunnableC71637Wxj(CheckoutConfiguration checkoutConfiguration, ECPPaymentConfiguration eCPPaymentConfiguration, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, C69642Vsj c69642Vsj, LoggingPolicy loggingPolicy, String str, String str2, String str3, List list) {
        this.A05 = c69642Vsj;
        this.A09 = str;
        this.A08 = str2;
        this.A02 = ecpUIConfiguration;
        this.A03 = paymentReceiverInfo;
        this.A00 = checkoutConfiguration;
        this.A01 = eCPPaymentConfiguration;
        this.A04 = transactionInfo;
        this.A0A = list;
        this.A06 = loggingPolicy;
        this.A07 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69642Vsj c69642Vsj = this.A05;
        C69641Vsi c69641Vsi = c69642Vsj.A00;
        String str = c69642Vsj.A01;
        ECPConfirmationConfiguration eCPConfirmationConfiguration = new ECPConfirmationConfiguration(null, "CLOSE");
        String str2 = this.A09;
        String str3 = this.A08;
        EcpUIConfiguration ecpUIConfiguration = this.A02;
        PaymentReceiverInfo paymentReceiverInfo = this.A03;
        c69641Vsi.A00(null, this.A00, eCPConfirmationConfiguration, this.A01, ecpUIConfiguration, paymentReceiverInfo, this.A04, this.A06, str2, str3, str, null, this.A07, this.A0A, false, false);
    }
}
