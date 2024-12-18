package X;

/* renamed from: X.AtU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24511AtU implements Runnable {
    public final /* synthetic */ AKB A00;

    public RunnableC24511AtU(AKB akb) {
        this.A00 = akb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AKB akb = this.A00;
        C1OK c1ok = akb.A00;
        if (c1ok != null) {
            c1ok.A00();
            akb.A00 = null;
        }
        AKB.A00(akb);
    }
}
