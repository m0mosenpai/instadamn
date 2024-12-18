package X;

/* renamed from: X.TJv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64558TJv implements Runnable {
    public final /* synthetic */ C27011Sy A00;

    public RunnableC64558TJv(C27011Sy c27011Sy) {
        this.A00 = c27011Sy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C09270dc.A01("xanalyticsadapter-jni");
        } catch (Throwable th) {
            C27011Sy c27011Sy = this.A00;
            boolean z = C27011Sy.A0E;
            c27011Sy.A0C(th);
        }
    }
}
