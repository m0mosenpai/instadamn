package X;

/* renamed from: X.Wr4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71275Wr4 implements Runnable {
    public final /* synthetic */ UAW A00;

    public RunnableC71275Wr4(UAW uaw) {
        this.A00 = uaw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UAW uaw = this.A00;
        uaw.removeCallbacks(uaw.A05);
        uaw.removeCallbacks(uaw.A04);
        uaw.A01 = true;
        U8X u8x = uaw.A00;
        if (u8x != null) {
            C65726Tt0 c65726Tt0 = u8x.A03;
            if (c65726Tt0 != null) {
                c65726Tt0.A01();
            }
            u8x.A03 = null;
        }
    }
}
