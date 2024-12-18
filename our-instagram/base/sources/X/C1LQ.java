package X;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.1LQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LQ extends C1LT {
    public C25411Lv A00;

    @Override // X.C1LT
    public final void A0E(int index, Object returnValue) {
    }

    @Override // X.AbstractC25011Ke
    public final void A09() {
        C25411Lv c25411Lv = this.A00;
        if (c25411Lv != null) {
            c25411Lv.A03();
        }
    }

    @Override // X.C1LT
    public final void A0D() {
        C25411Lv c25411Lv = this.A00;
        if (c25411Lv != null) {
            try {
                c25411Lv.A00.execute(c25411Lv);
            } catch (RejectedExecutionException e) {
                c25411Lv.A02.setException(e);
            }
        }
    }

    @Override // X.C1LT
    public final void A0F(Integer reason) {
        super.A0F(reason);
        if (reason == C05F.A00) {
            this.A00 = null;
        }
    }
}
