package X;

/* renamed from: X.WZp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70508WZp implements YNw {
    public final VgV A00;

    @Override // X.YNw
    public final /* bridge */ /* synthetic */ void CuU(YNq yNq, Object obj) {
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
        if (abstractC72503XfI instanceof XYO) {
            VgV vgV = this.A00;
            C69072VhN c69072VhN = new C69072VhN(yNq, this, abstractC72503XfI);
            C25621Ms c25621Ms = new C25621Ms(vgV.A00, 606);
            c25621Ms.A06();
            c25621Ms.A0B("zr/carrier_signal/config/");
            C1ON A0S = AbstractC31172DnG.A0S(c25621Ms, N2M.class, C54854ONf.class);
            A0S.A00 = new C67954V3t(21, vgV, c69072VhN);
            vgV.A01.schedule(A0S);
        }
    }

    public C70508WZp(VgV vgV) {
        this.A00 = vgV;
    }
}
