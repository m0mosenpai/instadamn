package X;

/* renamed from: X.POr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56950POr implements Runnable {
    public final /* synthetic */ C53021Nct A00;

    public RunnableC56950POr(C53021Nct c53021Nct) {
        this.A00 = c53021Nct;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PJC pjc = this.A00.A0E;
        if (pjc != null) {
            N3J n3j = pjc.A04;
            if (n3j != null && n3j.A0K) {
                C55085Oah c55085Oah = pjc.A0U;
                if (c55085Oah.A06 != null) {
                    c55085Oah.A01 = C05F.A15;
                    C55085Oah.A00(null, c55085Oah, "END", "INFO", "BROADCASTER");
                    c55085Oah.A06 = null;
                }
            }
            C56806PIx c56806PIx = pjc.A08;
            if (c56806PIx != null) {
                c56806PIx.A07.A00.hide();
                c56806PIx.A0H.invoke();
                C56806PIx.A01(c56806PIx, false);
            }
            OLC A02 = pjc.A0W.A02();
            A02.A0U.Egh(EnumC53165NfK.A05);
        }
    }
}
