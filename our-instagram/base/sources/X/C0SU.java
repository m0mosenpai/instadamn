package X;

/* renamed from: X.0SU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0SU implements Runnable {
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C07830b1 c07830b1 = (C07830b1) this;
            C0SJ c0sj = c07830b1.A00;
            if (c0sj != null) {
                c07830b1.A00 = C06600Wq.A01(c0sj, c0sj.getType());
            }
            this.A00.run();
            C0SJ c0sj2 = c07830b1.A00;
            if (c0sj2 != null) {
                c07830b1.A00 = null;
                c0sj2.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C07830b1 c07830b12 = (C07830b1) this;
                C0SJ c0sj3 = c07830b12.A00;
                if (c0sj3 != null) {
                    c07830b12.A00 = null;
                    c0sj3.close();
                }
                throw th2;
            }
        }
    }

    public C0SU(Runnable runnable) {
        this.A00 = runnable;
    }
}
