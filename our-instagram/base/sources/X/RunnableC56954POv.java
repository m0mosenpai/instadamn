package X;

/* renamed from: X.POv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56954POv implements Runnable {
    public final /* synthetic */ PJF A00;

    public RunnableC56954POv(PJF pjf) {
        this.A00 = pjf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        YQR yqr;
        AbstractC70118W4q abstractC70118W4q;
        AbstractC53633Nne abstractC53633Nne = PJF.A0K;
        if (abstractC53633Nne != null) {
            abstractC53633Nne.A00();
        }
        PJF.A0K = null;
        PJF pjf = this.A00;
        if (pjf.A0G && (yqr = pjf.A01) != null && (abstractC70118W4q = PJF.A0L) != null) {
            abstractC70118W4q.A04(AbstractC166987dD.A1J(yqr));
        }
    }
}
