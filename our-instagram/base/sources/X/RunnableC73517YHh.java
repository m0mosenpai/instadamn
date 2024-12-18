package X;

/* renamed from: X.YHh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73517YHh implements Runnable {
    public final /* synthetic */ Y1T A00;
    public final /* synthetic */ C75113Zb A01;

    public RunnableC73517YHh(Y1T y1t, C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
        this.A00 = y1t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A01;
        if (false != c75113Zb.A1n) {
            c75113Zb.A1n = false;
            C75113Zb.A00(c75113Zb, 79);
        }
        this.A00.A00 = null;
    }
}
