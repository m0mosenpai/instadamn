package X;

/* loaded from: classes8.dex */
public final class M07 implements Runnable {
    public final /* synthetic */ C43822JZk A00;

    public M07(C43822JZk c43822JZk) {
        this.A00 = c43822JZk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C43822JZk c43822JZk = this.A00;
        C24Q c24q = c43822JZk.A04;
        if (c24q.A0E(585177486, c43822JZk.A00)) {
            c43822JZk.A00 = c24q.A07("Failed to create QuickCaptureFragment", "", 585177486, c43822JZk.A00);
        }
    }
}
