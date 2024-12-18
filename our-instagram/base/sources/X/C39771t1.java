package X;

import android.os.Handler;

/* renamed from: X.1t1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39771t1 implements InterfaceC19300xE {
    public final C1t0 A00;
    public final C5FR A01;
    public final C39091ri A02;
    public final C37951pc A03;
    public final C12130kH A04;
    public final String A05;

    @Override // X.InterfaceC11360iu
    public final String BdA() {
        String str;
        C39701st c39701st = this.A02.A06;
        synchronized (c39701st) {
            C39841t8 c39841t8 = c39701st.A00;
            if (c39841t8 != null) {
                str = c39841t8.A02;
            } else {
                str = null;
            }
        }
        return str;
    }

    @Override // X.InterfaceC11360iu
    public final boolean CU0(C19280xC c19280xC) {
        C12130kH c12130kH = this.A04;
        if (c12130kH != null) {
            String str = this.A05;
            if (!str.equals("0")) {
                return c12130kH.A03(this.A01, c19280xC, str);
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC11160iX
    public final void E7c() {
        C37951pc c37951pc = this.A03;
        synchronized (c37951pc) {
            c37951pc.A02.A01();
        }
    }

    @Override // X.InterfaceC11160iX
    public final void E7d() {
        Handler handler = (Handler) this.A00;
        handler.sendMessage(handler.obtainMessage(4));
    }

    public C39771t1(C5FR c5fr, C39091ri c39091ri, C1t0 c1t0, C37951pc c37951pc, C12130kH c12130kH, String str) {
        this.A02 = c39091ri;
        this.A05 = str;
        this.A04 = c12130kH;
        this.A03 = c37951pc;
        this.A00 = c1t0;
        this.A01 = c5fr;
    }

    @Override // X.InterfaceC11360iu
    public final String Bd9() {
        return AbstractC13670mt.A06("%.3f", Double.valueOf(System.currentTimeMillis() / 1000.0d));
    }

    @Override // X.InterfaceC11360iu
    public final void EHW(C19280xC c19280xC) {
        c19280xC.A00 = System.currentTimeMillis();
        this.A00.EHX(c19280xC, false);
    }

    @Override // X.InterfaceC11360iu
    public final void EIu(C19280xC c19280xC) {
        c19280xC.A00 = System.currentTimeMillis();
        this.A00.EHX(c19280xC, true);
    }
}
