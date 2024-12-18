package X;

/* loaded from: classes7.dex */
public final class J3S implements Runnable {
    public final /* synthetic */ C38934HCh A00;

    public J3S(C38934HCh c38934HCh) {
        this.A00 = c38934HCh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38934HCh c38934HCh = this.A00;
        if (c38934HCh.isResumed()) {
            AbstractC31178DnM.A0x(c38934HCh);
        }
    }
}
