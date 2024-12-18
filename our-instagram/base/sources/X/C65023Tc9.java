package X;

import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Tc9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65023Tc9 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65023Tc9(LoggingContext loggingContext, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A02 = loggingContext;
        this.A01 = j;
        this.A03 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) obj;
            C0Zx c0Zx = new C0Zx();
            AbstractC43594JPz.A1E(c0Zx, (LoggingContext) this.A02);
            c0Zx.A05("paypal_billing_agreement_id", Long.valueOf(this.A01));
            AbstractC58322PtE.A1I(abstractC02600Aj, c0Zx, this.A03);
            return abstractC02600Aj;
        }
        AbstractC02600Aj abstractC02600Aj2 = (AbstractC02600Aj) obj;
        C0Zx c0Zx2 = new C0Zx();
        AbstractC43594JPz.A1E(c0Zx2, (LoggingContext) this.A02);
        c0Zx2.A05("paypal_billing_agreement_id", Long.valueOf(this.A01));
        c0Zx2.A06("target_name", this.A03);
        abstractC02600Aj2.A0N(c0Zx2, "event_payload");
        return abstractC02600Aj2;
    }
}
