package X;

/* loaded from: classes10.dex */
public final class TN1 implements Runnable {
    public final C63876SvA A00;
    public final /* synthetic */ C63891SvP A01;

    public TN1(C63891SvP c63891SvP, C63876SvA c63876SvA) {
        this.A01 = c63891SvP;
        this.A00 = c63876SvA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63876SvA c63876SvA = this.A00;
        c63876SvA.A0G.A00();
        synchronized (c63876SvA.A0I) {
            C63891SvP c63891SvP = this.A01;
            synchronized (c63891SvP) {
                if (c63891SvP.A0H.A00.contains(new SNV(c63876SvA, S8T.A00))) {
                    c63891SvP.A02.A01();
                    try {
                        c63876SvA.A04(c63891SvP.A02, c63891SvP.A05);
                        c63891SvP.A03(c63876SvA);
                    } catch (Throwable th) {
                        throw new RuntimeException("Unexpected exception thrown by non-Glide code", th);
                    }
                }
                c63891SvP.A01();
            }
        }
    }
}
