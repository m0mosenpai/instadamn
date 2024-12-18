package X;

/* renamed from: X.Wr2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71273Wr2 implements Runnable {
    public final /* synthetic */ U8O A00;

    public RunnableC71273Wr2(U8O u8o) {
        this.A00 = u8o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
