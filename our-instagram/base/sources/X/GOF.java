package X;

/* loaded from: classes6.dex */
public final class GOF implements Runnable {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ Throwable A01;

    public GOF(C1P1 c1p1, Throwable th) {
        this.A00 = c1p1;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1P1 c1p1 = this.A00;
        c1p1.onFail(new C115095Ie(this.A01));
        c1p1.onFinish();
    }
}
