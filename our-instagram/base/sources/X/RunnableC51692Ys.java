package X;

/* renamed from: X.2Ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC51692Ys implements Runnable {
    public Runnable A00;
    public final /* synthetic */ C214212u A01;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.A00.run();
            } catch (Throwable th) {
                CLX.A00(AnonymousClass191.A00, th);
            }
            C214212u c214212u = this.A01;
            Runnable A00 = C214212u.A00(c214212u);
            if (A00 != null) {
                this.A00 = A00;
                i++;
                if (i >= 16) {
                    C12T c12t = c214212u.A02;
                    if (c12t.A02(c214212u)) {
                        c12t.A05(this, c214212u);
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public RunnableC51692Ys(Runnable runnable, C214212u c214212u) {
        this.A01 = c214212u;
        this.A00 = runnable;
    }
}
