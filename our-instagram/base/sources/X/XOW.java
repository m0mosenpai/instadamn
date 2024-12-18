package X;

/* loaded from: classes12.dex */
public final class XOW implements Runnable {
    public final /* synthetic */ XOE A00;
    public final /* synthetic */ C5KS A01;

    public XOW(XOE xoe, C5KS c5ks) {
        this.A00 = xoe;
        this.A01 = c5ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XOE xoe = this.A00;
        synchronized (xoe.A01) {
            xoe.A00.D6a(this.A01);
        }
    }
}
