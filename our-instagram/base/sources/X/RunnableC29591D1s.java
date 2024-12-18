package X;

/* renamed from: X.D1s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29591D1s implements Runnable {
    public final /* synthetic */ C89253yR A00;
    public final /* synthetic */ AbstractC65902yS A01;

    public RunnableC29591D1s(C89253yR c89253yR, AbstractC65902yS abstractC65902yS) {
        this.A01 = abstractC65902yS;
        this.A00 = c89253yR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01.getLifecycle().A09(this.A00);
    }
}
