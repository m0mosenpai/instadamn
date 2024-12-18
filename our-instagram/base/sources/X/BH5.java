package X;

/* loaded from: classes5.dex */
public final class BH5 {
    public final C57S A03 = new C57S(new JTG[16]);
    public final InterfaceC74953Yl A02 = AbstractC25230BEn.A0U(false);
    public long A00 = Long.MIN_VALUE;
    public final InterfaceC74953Yl A01 = AbstractC25229BEm.A0R(AbstractC166997dE.A0b());

    public final void A00(C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-318043801);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, this) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1025754308, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            if (EEc == obj) {
                EEc = AbstractC25232BEp.A0w(c5Tl, null);
            }
            if (!AbstractC25230BEn.A1X(this.A01) && !AbstractC25230BEn.A1X(this.A02)) {
                c5Tl.Eno(1721436120);
            } else {
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, this, 1719915818);
                Object EEc2 = c5Tl.EEc();
                if (A1Z || EEc2 == obj) {
                    EEc2 = new MCP(EEc, this, (InterfaceC23621Ds) null, 1, 42);
                    c5Tl.FBy(EEc2);
                }
                C5UX.A04(c5Tl, this, (InterfaceC16620sF) EEc2);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(-116243234);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, this, i, 0);
        }
    }
}
