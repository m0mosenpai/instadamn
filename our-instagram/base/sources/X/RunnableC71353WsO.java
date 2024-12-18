package X;

/* renamed from: X.WsO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71353WsO implements Runnable {
    public final /* synthetic */ C70684Wf5 A00;

    public RunnableC71353WsO(C70684Wf5 c70684Wf5) {
        this.A00 = c70684Wf5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70684Wf5 c70684Wf5 = this.A00;
        if (!c70684Wf5.A05) {
            C55014OWb c55014OWb = c70684Wf5.A0O;
            if (true != c55014OWb.A01) {
                c55014OWb.A01 = true;
                C55014OWb.A00(c55014OWb);
            }
            c55014OWb.A02();
        }
    }
}
