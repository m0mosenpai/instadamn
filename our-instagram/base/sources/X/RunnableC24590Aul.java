package X;

/* renamed from: X.Aul, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24590Aul implements Runnable {
    public final /* synthetic */ C214869fO A00;
    public final /* synthetic */ C81J A01;

    public RunnableC24590Aul(C214869fO c214869fO, C81J c81j) {
        this.A00 = c214869fO;
        this.A01 = c81j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214869fO c214869fO = this.A00;
        if (c214869fO.mView != null) {
            C81Y c81y = new C81Y(this.A01);
            c214869fO.A01 = c81y;
            if (c214869fO.isResumed()) {
                c81y.A01();
            }
        }
    }
}
