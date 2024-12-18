package X;

/* loaded from: classes8.dex */
public final class M5Z implements Runnable {
    public final /* synthetic */ KDK A00;
    public final /* synthetic */ C31349DqE A01;
    public final /* synthetic */ boolean A02;

    public M5Z(KDK kdk, C31349DqE c31349DqE, boolean z) {
        this.A01 = c31349DqE;
        this.A02 = z;
        this.A00 = kdk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC166997dE.A1O(C41451vu.A01, this.A01);
        if (this.A02) {
            AbstractC31177DnL.A12(this.A00);
        }
    }
}
