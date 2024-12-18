package X;

/* renamed from: X.PPd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56962PPd implements Runnable {
    public final /* synthetic */ C51996Myi A00;
    public final /* synthetic */ boolean A01;

    public RunnableC56962PPd(C51996Myi c51996Myi, boolean z) {
        this.A01 = z;
        this.A00 = c51996Myi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        C51996Myi c51996Myi = this.A00;
        if (z != c51996Myi.A05) {
            if (!z) {
                c51996Myi.A06 = false;
                c51996Myi.A09.A00.A04();
            }
            c51996Myi.A05 = z;
        }
    }
}
