package X;

/* renamed from: X.WvF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71510WvF implements Runnable {
    public final /* synthetic */ C67957V3w A00;
    public final /* synthetic */ V1R A01;

    public RunnableC71510WvF(C67957V3w c67957V3w, V1R v1r) {
        this.A01 = v1r;
        this.A00 = c67957V3w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WG5 wg5 = this.A01.A0c;
        int i = this.A00.A00;
        WG5.A01(wg5, i, false);
        WG5.A04(wg5, "INFO_REQUEST_FAIL", i);
    }
}
