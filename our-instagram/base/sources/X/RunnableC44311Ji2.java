package X;

/* renamed from: X.Ji2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44311Ji2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C44265JhC A01;

    public RunnableC44311Ji2(C44265JhC c44265JhC, int i) {
        this.A01 = c44265JhC;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44265JhC c44265JhC = this.A01;
        int i = c44265JhC.A02 + this.A00;
        if (c44265JhC.A03 != i) {
            c44265JhC.A03 = i;
            MSF msf = c44265JhC.A09.mCaptureProvider;
            if (msf != null) {
                msf.setFocusIndicatorOrientation(i);
            }
        }
    }
}
