package X;

/* renamed from: X.9QP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9QP implements Runnable {
    public boolean A00;
    public final Runnable A01;

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.A00) {
            this.A01.run();
        }
    }

    public C9QP(Runnable runnable) {
        this.A01 = runnable;
    }
}
