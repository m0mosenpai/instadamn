package X;

/* renamed from: X.WuD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71451WuD implements Runnable {
    public final /* synthetic */ WOB A00;
    public final /* synthetic */ C67727Uwt A01;

    public RunnableC71451WuD(WOB wob, C67727Uwt c67727Uwt) {
        this.A01 = c67727Uwt;
        this.A00 = wob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C67727Uwt c67727Uwt = this.A01;
        UIK uik = c67727Uwt.A07;
        if (uik != null) {
            if (uik.A00.getViewTreeObserver().isAlive()) {
                UIK uik2 = c67727Uwt.A07;
                if (uik2 != null) {
                    uik2.A00.getViewTreeObserver().removeOnDrawListener(this.A00);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("payButtonViewHolder");
        throw C00O.createAndThrow();
    }
}
