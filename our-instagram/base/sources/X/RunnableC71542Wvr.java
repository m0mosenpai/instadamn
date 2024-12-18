package X;

/* renamed from: X.Wvr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71542Wvr implements Runnable {
    public final /* synthetic */ C6PT A00;
    public final /* synthetic */ C902840n A01;
    public final /* synthetic */ AbstractC115825Lw A02;

    public RunnableC71542Wvr(C6PT c6pt, C902840n c902840n, AbstractC115825Lw abstractC115825Lw) {
        this.A02 = abstractC115825Lw;
        this.A00 = c6pt;
        this.A01 = c902840n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.DEB(this.A00, this.A01);
    }
}
