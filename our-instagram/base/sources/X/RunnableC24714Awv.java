package X;

/* renamed from: X.Awv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24714Awv implements Runnable {
    public final /* synthetic */ C1OK A00;
    public final /* synthetic */ C8YE A01;

    public RunnableC24714Awv(C1OK c1ok, C8YE c8ye) {
        this.A00 = c1ok;
        this.A01 = c8ye;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1OK c1ok = this.A00;
        if (c1ok != null) {
            c1ok.A00();
        }
        this.A01.A0A.E4v();
    }
}
