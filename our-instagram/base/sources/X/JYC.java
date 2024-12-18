package X;

/* loaded from: classes8.dex */
public final class JYC implements Runnable {
    public final /* synthetic */ JYB A00;

    public JYC(JYB jyb) {
        this.A00 = jyb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JYB jyb = this.A00;
        Object A00 = jyb.A00.A00();
        if (A00 != null) {
            jyb.A09(A00, null, true);
        }
    }
}
