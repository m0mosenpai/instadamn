package X;

import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import java.util.List;

/* loaded from: classes10.dex */
public final class SJJ {
    public final ECPPaymentRequest A00;
    public final TransactionInfo A01;
    public final LoggingContext A02;
    public final PaymentMethod A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;

    public SJJ(ECPPaymentRequest eCPPaymentRequest, TransactionInfo transactionInfo, LoggingContext loggingContext, PaymentMethod paymentMethod, String str, String str2, String str3, String str4, List list, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = eCPPaymentRequest;
        this.A02 = loggingContext;
        this.A03 = paymentMethod;
        this.A01 = transactionInfo;
        this.A09 = z;
        this.A07 = str4;
        this.A08 = list;
    }
}
