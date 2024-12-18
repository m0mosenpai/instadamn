package X;

/* renamed from: X.TKi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64571TKi implements Runnable {
    public final /* synthetic */ C63150Sdx A00;

    public RunnableC64571TKi(C63150Sdx c63150Sdx) {
        this.A00 = c63150Sdx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (T08 t08 : this.A00.A03) {
            if (C63150Sdx.A00(t08.A05).A02.size() <= 0) {
                t08.A0E.set(false);
                T08.A00(t08);
                T08.A01(t08);
            }
        }
    }
}
