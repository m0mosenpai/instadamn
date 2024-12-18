package X;

/* renamed from: X.TOe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64647TOe implements Runnable {
    public final /* synthetic */ T7G A00;
    public final /* synthetic */ C5KS A01;

    public RunnableC64647TOe(T7G t7g, C5KS c5ks) {
        this.A00 = t7g;
        this.A01 = c5ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5KS c5ks = this.A01;
        if (c5ks.A05) {
            this.A00.A01.A07();
            return;
        }
        try {
            T7G t7g = this.A00;
            t7g.A01.A0D(t7g.A00.Eq5(c5ks));
        } catch (TXJ e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            C5KS c5ks2 = this.A00.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            c5ks2.A0C(e);
        } catch (Exception e2) {
            this.A00.A01.A0C(e2);
        }
    }
}
