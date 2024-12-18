package X;

/* renamed from: X.PMx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56904PMx implements Runnable {
    public final /* synthetic */ NMW A00;

    public RunnableC56904PMx(NMW nmw) {
        this.A00 = nmw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC10360h2 abstractC10360h2;
        NMW nmw = this.A00;
        if (nmw.isResumed() && (abstractC10360h2 = nmw.mFragmentManager) != null) {
            abstractC10360h2.A12();
        }
    }
}
