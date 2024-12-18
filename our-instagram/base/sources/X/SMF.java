package X;

import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;

/* loaded from: classes10.dex */
public final class SMF {
    public C58443PvM A00;
    public IGPaymentMethodsAPI A01;
    public C2GT A02;
    public final C58252li A03 = AbstractC58318PtA.A0I();

    public final void A00(java.util.Set set) {
        C2GT c2gt = this.A02;
        if (c2gt != null) {
            this.A03.A0D(c2gt);
        }
        Q8J A00 = REU.A00(new C63545SpD(10, this, set), this.A00);
        this.A02 = A00;
        C63627SqZ.A02(A00, this.A03, this, 13);
    }

    public SMF(C58443PvM c58443PvM, IGPaymentMethodsAPI iGPaymentMethodsAPI) {
        this.A01 = iGPaymentMethodsAPI;
        this.A00 = c58443PvM;
    }
}
