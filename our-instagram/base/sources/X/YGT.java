package X;

/* loaded from: classes12.dex */
public final class YGT implements Runnable {
    public final /* synthetic */ XMB A00;

    public YGT(XMB xmb) {
        this.A00 = xmb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XMB xmb = this.A00;
        synchronized (xmb.A01) {
            xmb.A00.D1x();
        }
    }
}
