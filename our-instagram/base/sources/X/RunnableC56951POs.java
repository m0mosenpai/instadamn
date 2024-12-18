package X;

/* renamed from: X.POs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56951POs implements Runnable {
    public final /* synthetic */ C53021Nct A00;

    public RunnableC56951POs(C53021Nct c53021Nct) {
        this.A00 = c53021Nct;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PJC pjc = this.A00.A0E;
        if (pjc != null && pjc.A05 != EnumC53324Ni1.A09) {
            C56806PIx c56806PIx = pjc.A08;
            if (c56806PIx != null) {
                C56806PIx.A01(c56806PIx, true);
            }
            OLC A02 = pjc.A0W.A02();
            A02.A0U.Egh(EnumC53165NfK.A03);
        }
    }
}
