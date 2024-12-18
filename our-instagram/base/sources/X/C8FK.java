package X;

/* renamed from: X.8FK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FK implements InterfaceC1819385d {
    public int A00 = -1;
    public C88X A01;
    public String A02;
    public boolean A03;
    public final /* synthetic */ C8FG A04;

    @Override // X.InterfaceC1819385d
    public final void AJV(EnumC222919sW enumC222919sW) {
        C8FK c8fk;
        C8FG c8fg = this.A04;
        C85Z c85z = c8fg.A0J;
        if (c85z != null && (c8fk = c8fg.A0P) != null) {
            C82K c82k = c85z.A00;
            if (((C189698ao) c82k.A00()).A00 == C05F.A01) {
                if (enumC222919sW == EnumC222919sW.A04) {
                    C88X c88x = c8fk.A01;
                    if (c88x != null) {
                        c8fg.DDC(c88x, c8fk.A02, c8fk.A00, c8fk.A03);
                    }
                } else if (enumC222919sW == EnumC222919sW.A05) {
                    ((C189698ao) c82k.A00()).A00();
                    c8fg.A0Q.A0X.Egh(true);
                    c8fg.A0H(false);
                }
                C189698ao c189698ao = (C189698ao) c82k.A00();
                c189698ao.A02 = null;
                c189698ao.A00 = null;
                c189698ao.A01 = null;
                c8fk.A01 = null;
                c8fk.A00 = -1;
                c8fk.A03 = false;
                c8fk.A02 = null;
            }
        }
    }

    public C8FK(C8FG c8fg) {
        this.A04 = c8fg;
    }
}
