package X;

/* loaded from: classes12.dex */
public final class XMF implements Runnable {
    public final /* synthetic */ XMA A00;
    public final /* synthetic */ C5KS A01;

    public XMF(XMA xma, C5KS c5ks) {
        this.A00 = xma;
        this.A01 = c5ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XMA xma = this.A00;
        synchronized (xma.A01) {
            xma.A00.onSuccess(this.A01.A06());
        }
    }
}
