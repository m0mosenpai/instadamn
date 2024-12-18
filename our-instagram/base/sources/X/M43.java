package X;

/* loaded from: classes8.dex */
public final class M43 implements Runnable {
    public final /* synthetic */ C162307Os A00;
    public final /* synthetic */ AbstractC46524KiP A01;

    public M43(C162307Os c162307Os, AbstractC46524KiP abstractC46524KiP) {
        this.A00 = c162307Os;
        this.A01 = abstractC46524KiP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C162307Os c162307Os = this.A00;
        AbstractC46524KiP abstractC46524KiP = this.A01;
        C162307Os.A02(c162307Os, abstractC46524KiP, false);
        if (c162307Os.A01 != null && !abstractC46524KiP.A05()) {
            C162307Os.A01(c162307Os);
        }
    }
}
