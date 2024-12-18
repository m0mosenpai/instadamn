package X;

/* renamed from: X.9OV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9OV implements Runnable {
    public final /* synthetic */ C9LP A00;

    public C9OV(C9LP c9lp) {
        this.A00 = c9lp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C81Y c81y;
        C8XA c8xa;
        C8XB A00;
        C9LP c9lp = this.A00;
        if (c9lp.isResumed() && (c81y = c9lp.A02) != null && (c8xa = c81y.A00.A17) != null && (A00 = c8xa.A00()) != null) {
            A00.A08(c9lp.A00);
        }
    }
}
