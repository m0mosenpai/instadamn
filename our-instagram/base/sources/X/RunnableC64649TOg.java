package X;

/* renamed from: X.TOg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64649TOg implements Runnable {
    public final /* synthetic */ C58441PvK A00;
    public final /* synthetic */ C5KS A01;

    public RunnableC64649TOg(C58441PvK c58441PvK, C5KS c5ks) {
        this.A00 = c58441PvK;
        this.A01 = c5ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58441PvK c58441PvK = this.A00;
        synchronized (c58441PvK.A01) {
            InterfaceC65424Tjv interfaceC65424Tjv = c58441PvK.A00;
            Exception A05 = this.A01.A05();
            C3U5.A02(A05);
            interfaceC65424Tjv.onFailure(A05);
        }
    }
}
