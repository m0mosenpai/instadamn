package X;

/* renamed from: X.Wrt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71325Wrt implements Runnable {
    public final /* synthetic */ U8W A00;

    public RunnableC71325Wrt(U8W u8w) {
        this.A00 = u8w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U8W u8w = this.A00;
        u8w.A03 = System.currentTimeMillis();
        u8w.A04 = false;
        u8w.invalidateSelf();
    }
}
