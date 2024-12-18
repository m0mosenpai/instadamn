package X;

/* renamed from: X.Wrs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71324Wrs implements Runnable {
    public final /* synthetic */ U8W A00;

    public RunnableC71324Wrs(U8W u8w) {
        this.A00 = u8w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U8W u8w = this.A00;
        u8w.A03 = -1L;
        u8w.A04 = false;
        u8w.A00 = 1.0f;
        u8w.invalidateSelf();
    }
}
