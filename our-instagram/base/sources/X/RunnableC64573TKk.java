package X;

/* renamed from: X.TKk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64573TKk implements Runnable {
    public final /* synthetic */ C63192Seu A00;

    public RunnableC64573TKk(C63192Seu c63192Seu) {
        this.A00 = c63192Seu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63192Seu c63192Seu = this.A00;
        synchronized (c63192Seu.A03) {
            C63192Seu.A01(c63192Seu);
        }
    }
}
