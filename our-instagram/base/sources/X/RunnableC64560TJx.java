package X;

/* renamed from: X.TJx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64560TJx implements Runnable {
    public final /* synthetic */ C27011Sy A00;

    public RunnableC64560TJx(C27011Sy c27011Sy) {
        this.A00 = c27011Sy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C09170dP.A0C("spark-qpluserflow-native");
        } catch (Throwable th) {
            C27011Sy c27011Sy = this.A00;
            boolean z = C27011Sy.A0E;
            c27011Sy.A0C(th);
        }
    }
}
