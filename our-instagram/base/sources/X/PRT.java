package X;

/* loaded from: classes9.dex */
public final class PRT implements Runnable {
    public final /* synthetic */ C52690NTb A00;
    public final /* synthetic */ boolean A01;

    public PRT(C52690NTb c52690NTb, boolean z) {
        this.A00 = c52690NTb;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0A.A05(new PDA(this.A01));
    }
}
