package X;

/* renamed from: X.OrL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55871OrL implements XCQ {
    public final int A00;
    public final Object A01;

    public C55871OrL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XCQ
    public final void Dwe() {
        C141796aw A00;
        InterfaceC16620sF pyz;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C51011MgI c51011MgI = (C51011MgI) obj;
            c51011MgI.A07.A02(c51011MgI.A0C, false);
            A00 = AbstractC141776au.A00(c51011MgI);
            pyz = new PZF(c51011MgI, null, 6);
        } else {
            AbstractC51028Mgb abstractC51028Mgb = (AbstractC51028Mgb) obj;
            abstractC51028Mgb.A05.A02(abstractC51028Mgb.A03(), false);
            A00 = AbstractC141776au.A00(abstractC51028Mgb);
            pyz = new PYZ(abstractC51028Mgb, null, 45);
        }
        AbstractC166987dD.A1Z(pyz, A00);
    }

    @Override // X.XCQ
    public final void E65(String str) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C51011MgI c51011MgI = (C51011MgI) obj;
            c51011MgI.A07.A02(c51011MgI.A0C, true);
            c51011MgI.A02 = str;
            C51011MgI.A00(c51011MgI, str);
            return;
        }
        AbstractC51028Mgb abstractC51028Mgb = (AbstractC51028Mgb) obj;
        abstractC51028Mgb.A05.A02(abstractC51028Mgb.A03(), true);
        if (abstractC51028Mgb instanceof NP7) {
            ((NP7) abstractC51028Mgb).A00 = str;
        }
        AbstractC51028Mgb.A00(abstractC51028Mgb, str);
    }
}
