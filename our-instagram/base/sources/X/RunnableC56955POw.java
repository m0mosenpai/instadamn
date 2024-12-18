package X;

/* renamed from: X.POw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56955POw implements Runnable {
    public final /* synthetic */ PJG A00;

    public RunnableC56955POw(PJG pjg) {
        this.A00 = pjg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PJG pjg = this.A00;
        C53616NnN c53616NnN = pjg.A03;
        if (c53616NnN != null) {
            c53616NnN.A02 = true;
            if (c53616NnN.A01) {
                AbstractC53633Nne abstractC53633Nne = c53616NnN.A00;
                if (abstractC53633Nne != null) {
                    C11T.A02(new PLS(abstractC53633Nne));
                }
                pjg.A03 = null;
            }
        }
    }
}
