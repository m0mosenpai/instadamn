package X;

/* renamed from: X.AwK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24679AwK implements Runnable {
    public final /* synthetic */ C81J A00;
    public final /* synthetic */ C214809fI A01;

    public RunnableC24679AwK(C81J c81j, C214809fI c214809fI) {
        this.A01 = c214809fI;
        this.A00 = c81j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214809fI c214809fI = this.A01;
        if (c214809fI.mView != null) {
            C81Y c81y = new C81Y(this.A00);
            c214809fI.A01 = c81y;
            if (c214809fI.isResumed()) {
                c81y.A01();
            }
        }
    }
}
