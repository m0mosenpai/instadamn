package X;

/* renamed from: X.Asy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24479Asy implements Runnable {
    public final /* synthetic */ C8HB A00;

    public RunnableC24479Asy(C8HB c8hb) {
        this.A00 = c8hb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8HC c8hc = (C8HC) this.A00.A0F.getValue();
        if (!c8hc.A03) {
            C8HC.A05(c8hc, true, true, false);
            return;
        }
        c8hc.A00 = 0;
        c8hc.A02 = false;
        c8hc.A03 = false;
        c8hc.A01 = C8HC.A02(c8hc);
        C8HC.A04(c8hc, new C57748Pjb(c8hc, 48));
        if (c8hc.A01 != C05F.A0Y) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c8hc.A0A.A00, "ig_quicksnap_creation_nux_impression");
            if (A0f.isSampled()) {
                A0f.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A0f.Cht();
            }
        }
        C8HC.A03(C24003Akh.A00, c8hc);
        C8HC.A05(c8hc, true, true, false);
        c8hc.A07.A9e(c8hc.A06);
    }
}
