package X;

/* loaded from: classes10.dex */
public final class TN3 implements Runnable {
    public final /* synthetic */ Q2Z A00;
    public final /* synthetic */ boolean A01;

    public TN3(Q2Z q2z, boolean z) {
        this.A00 = q2z;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q2Z q2z = this.A00;
        boolean z = this.A01;
        C63375Sim.A04();
        SHF shf = (SHF) q2z.A01;
        boolean z2 = shf.A00;
        shf.A00 = z;
        if (z2 != z) {
            shf.A02.D7I(z);
        }
    }
}
