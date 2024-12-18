package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.TransactionInfo;

/* loaded from: classes11.dex */
public final class X5O extends C0YY implements InterfaceC16660sJ {
    public static final X5O A00 = new X5O();

    public X5O() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TransactionInfo transactionInfo = (TransactionInfo) AbstractC58319PtB.A0X(obj).A01;
        if (transactionInfo != null) {
            return WGr.A03(transactionInfo);
        }
        return new CurrencyAmount("", "");
    }
}
