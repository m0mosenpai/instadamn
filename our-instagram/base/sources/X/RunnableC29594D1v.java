package X;

/* renamed from: X.D1v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29594D1v implements Runnable {
    public final /* synthetic */ AbstractC25399BLq A00;
    public final /* synthetic */ C09530e4 A01;

    public RunnableC29594D1v(AbstractC25399BLq abstractC25399BLq, C09530e4 c09530e4) {
        this.A00 = abstractC25399BLq;
        this.A01 = c09530e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC25399BLq abstractC25399BLq = this.A00;
        C09530e4 c09530e4 = this.A01;
        int A0F = AbstractC25230BEn.A0F(c09530e4);
        AbstractC25229BEm.A0A(c09530e4);
        if (abstractC25399BLq instanceof AbstractC25398BLp) {
            AbstractC25398BLp abstractC25398BLp = (AbstractC25398BLp) abstractC25399BLq;
            abstractC25398BLp.A0I.A0B(A0F);
            C2XI c2xi = abstractC25398BLp.A0A;
            if (AbstractC25230BEn.A0B(c2xi) != A0F) {
                AbstractC25227BEk.A1E(c2xi, A0F);
                return;
            }
            return;
        }
        C57 c57 = (C57) abstractC25399BLq;
        C57.A00((C26053Bfg) AbstractC25225BEi.A13(c57.A03.A00, A0F), c57);
        C2XI c2xi2 = c57.A04;
        if (AbstractC25230BEn.A0B(c2xi2) == A0F) {
            return;
        }
        AbstractC25227BEk.A1E(c2xi2, A0F);
        C57.A01(c57, A0F);
    }
}
