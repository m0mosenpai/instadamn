package X;

import com.facebookpay.expresscheckout.models.ECPPaymentRequest;

/* loaded from: classes11.dex */
public final class UFA extends C9U7 {
    public final ECPPaymentRequest A00;

    public UFA(InterfaceC08430c6 interfaceC08430c6, ECPPaymentRequest eCPPaymentRequest) {
        super(null, interfaceC08430c6);
        this.A00 = eCPPaymentRequest;
    }

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        AbstractC167017dG.A1P(cls, c152406tQ);
        if (cls.isAssignableFrom(UFS.class)) {
            return new UFS(c152406tQ, this.A00);
        }
        throw AbstractC37303Gc4.A0M(cls, "Unknown ViewModel class: ", new StringBuilder());
    }
}
