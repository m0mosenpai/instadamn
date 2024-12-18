package X;

/* renamed from: X.AwI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24677AwI implements Runnable {
    public final /* synthetic */ C81J A00;
    public final /* synthetic */ C214779fF A01;

    public RunnableC24677AwI(C81J c81j, C214779fF c214779fF) {
        this.A01 = c214779fF;
        this.A00 = c81j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214779fF c214779fF = this.A01;
        if (c214779fF.mView != null) {
            C81Y c81y = new C81Y(this.A00);
            c214779fF.A01 = c81y;
            if (c214779fF.isResumed()) {
                c81y.A01();
            }
        }
    }
}
