package X;

/* renamed from: X.D1c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29575D1c implements Runnable {
    public final /* synthetic */ CU6 A00;
    public final /* synthetic */ Runnable A01;

    public RunnableC29575D1c(CU6 cu6, Runnable runnable) {
        this.A00 = cu6;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CU6 cu6 = this.A00;
        if (!cu6.A02.get()) {
            cu6.A00.removeCallbacksAndMessages(null);
            this.A01.run();
        } else {
            AbstractC12120kG.A0J("MsysMailboxSessionManagerImpl:  Timeout tearing down ACT", null, AbstractC06930Yk.A0E(), 20134884);
        }
    }
}
