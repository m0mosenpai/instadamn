package X;

/* renamed from: X.AwY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24692AwY implements Runnable {
    public final /* synthetic */ C81J A00;
    public final /* synthetic */ C214819fJ A01;

    public RunnableC24692AwY(C81J c81j, C214819fJ c214819fJ) {
        this.A01 = c214819fJ;
        this.A00 = c81j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214819fJ c214819fJ = this.A01;
        if (c214819fJ.mView != null) {
            C81Y c81y = new C81Y(this.A00);
            c214819fJ.A01 = c81y;
            if (c214819fJ.isResumed()) {
                c81y.A01();
            }
        }
    }
}
