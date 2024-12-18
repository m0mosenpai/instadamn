package X;

/* loaded from: classes9.dex */
public final class PLA implements Runnable {
    public final /* synthetic */ Ox9 A00;

    public PLA(Ox9 ox9) {
        this.A00 = ox9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ox9 ox9 = this.A00;
        if (!ox9.A00) {
            C52690NTb c52690NTb = ox9.A01.A00;
            if (!c52690NTb.A03) {
                c52690NTb.A0A.A03(new PBX(false));
            }
        }
    }
}
