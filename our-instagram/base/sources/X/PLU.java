package X;

/* loaded from: classes9.dex */
public final class PLU implements Runnable {
    public final /* synthetic */ C50809McW A00;

    public PLU(C50809McW c50809McW) {
        this.A00 = c50809McW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidate();
    }
}