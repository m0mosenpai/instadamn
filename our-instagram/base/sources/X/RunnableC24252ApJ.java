package X;

/* renamed from: X.ApJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24252ApJ implements Runnable {
    public final /* synthetic */ AZX A00;

    public RunnableC24252ApJ(AZX azx) {
        this.A00 = azx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C179977yn c179977yn = this.A00.A00;
        if (c179977yn.A05) {
            if (c179977yn.A04) {
                c179977yn.A00.A02.EGZ(null);
            } else {
                c179977yn.A05 = true;
            }
        }
        c179977yn.A04 = true;
    }
}
