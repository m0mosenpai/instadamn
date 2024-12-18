package X;

/* renamed from: X.AwJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24678AwJ implements Runnable {
    public final /* synthetic */ C81J A00;
    public final /* synthetic */ C214789fG A01;

    public RunnableC24678AwJ(C81J c81j, C214789fG c214789fG) {
        this.A01 = c214789fG;
        this.A00 = c81j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214789fG c214789fG = this.A01;
        if (c214789fG.mView != null) {
            C81Y c81y = new C81Y(this.A00);
            c214789fG.A01 = c81y;
            if (c214789fG.isResumed()) {
                c81y.A01();
            }
        }
    }
}
