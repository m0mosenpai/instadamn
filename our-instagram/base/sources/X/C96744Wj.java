package X;

/* renamed from: X.4Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96744Wj implements C4UC {
    public InterfaceC96054To A00;
    public C4UC A01;
    public boolean A03;
    public final InterfaceC96684Wd A05;
    public final C96754Wk A06;
    public boolean A02 = true;
    public boolean A04 = C2C5.A02(C2C1.A1D);

    public final long A00(boolean z) {
        InterfaceC96054To interfaceC96054To = this.A00;
        if (interfaceC96054To == null || interfaceC96054To.CTt() || (!this.A00.CbZ() && (z || this.A00.CLd()))) {
            this.A02 = true;
            if (this.A03) {
                this.A06.A00();
            }
        } else {
            C4UC c4uc = this.A01;
            c4uc.getClass();
            long Beg = c4uc.Beg();
            if (this.A02) {
                C96754Wk c96754Wk = this.A06;
                if (Beg < c96754Wk.Beg()) {
                    c96754Wk.A01();
                } else {
                    this.A02 = false;
                    if (this.A03) {
                        c96754Wk.A00();
                    }
                }
            }
            C96754Wk c96754Wk2 = this.A06;
            c96754Wk2.A02(Beg);
            C4TU Bdw = c4uc.Bdw();
            if (!Bdw.equals(c96754Wk2.A00)) {
                c96754Wk2.Eaz(Bdw);
                this.A05.DZ4(Bdw);
            }
        }
        return Beg();
    }

    public final void A01(InterfaceC96054To interfaceC96054To) {
        C4UC c4uc;
        C4UC c4uc2;
        if (interfaceC96054To instanceof C4UB) {
            c4uc = (C4UB) interfaceC96054To;
        } else if (!(interfaceC96054To instanceof C98174aw)) {
            return;
        } else {
            c4uc = (C98174aw) interfaceC96054To;
        }
        if (c4uc != null && c4uc != (c4uc2 = this.A01)) {
            if (c4uc2 == null) {
                this.A01 = c4uc;
                this.A00 = interfaceC96054To;
                c4uc.Eaz(this.A06.A00);
                return;
            }
            throw C4Y3.A01(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override // X.C4UC
    public final C4TU Bdw() {
        C4UC c4uc = this.A01;
        if (c4uc != null) {
            return c4uc.Bdw();
        }
        return this.A06.A00;
    }

    @Override // X.C4UC
    public final long Beg() {
        if (this.A02) {
            return this.A06.Beg();
        }
        C4UC c4uc = this.A01;
        c4uc.getClass();
        return c4uc.Beg();
    }

    @Override // X.C4UC
    public final void Eaz(C4TU c4tu) {
        C4UC c4uc = this.A01;
        if (c4uc != null) {
            c4uc.Eaz(c4tu);
            c4tu = this.A01.Bdw();
        }
        this.A06.Eaz(c4tu);
        if (this.A04) {
            this.A05.DZ4(c4tu);
        }
    }

    public C96744Wj(InterfaceC96684Wd interfaceC96684Wd, C2A7 c2a7) {
        this.A05 = interfaceC96684Wd;
        this.A06 = new C96754Wk(c2a7);
    }
}
