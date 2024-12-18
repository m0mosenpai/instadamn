package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dbw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30513Dbw extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ L4Q A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30513Dbw(L4Q l4q, InterfaceC16820sZ interfaceC16820sZ) {
        super(3);
        this.A01 = interfaceC16820sZ;
        this.A00 = l4q;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, -1792953471)) {
            C0fH.A01(1866927362, "com.instagram.barcelona.feed.mediaviewer.ui.transformable.<anonymous> (Transformable150.kt:81)");
        }
        InterfaceC74953Yl A00 = C5WZ.A00(A0S, AbstractC166997dE.A0a());
        InterfaceC74953Yl A002 = C5WZ.A00(A0S, this.A01);
        Object A0q = AbstractC25227BEk.A0q(A0S, -15255223);
        Object obj4 = C5UI.A00;
        if (A0q == obj4) {
            A0q = AbstractC25229BEm.A12();
            A0S.FBy(A0q);
        }
        InterfaceC24731Iq interfaceC24731Iq = (InterfaceC24731Iq) A0q;
        C117505Tk A0J = AbstractC25225BEi.A0J(A0S);
        A0S.Eno(-15252019);
        L4Q l4q = this.A00;
        boolean A1W = AbstractC25233BEq.A1W(A0S, interfaceC24731Iq, l4q, -15250512);
        Object EEc = A0S.EEc();
        if (A1W || EEc == obj4) {
            EEc = new JTH(l4q, null, interfaceC24731Iq);
            A0S.FBy(EEc);
        }
        C117505Tk.A0I(A0J);
        C5UX.A04(A0S, l4q, (InterfaceC16620sF) EEc);
        C117505Tk.A0I(A0J);
        Object A0q2 = AbstractC25227BEk.A0q(A0S, -15224600);
        if (A0q2 == obj4) {
            A0q2 = new MCP(A00, interfaceC24731Iq, A002, (InterfaceC23621Ds) null, 20);
            A0S.FBy(A0q2);
        }
        C117505Tk.A0I(A0J);
        Modifier A003 = C6KX.A00(Modifier.A00, interfaceC24731Iq, (InterfaceC16620sF) A0q2);
        if (C0fH.A02()) {
            C0fH.A00(55378045);
        }
        C117505Tk.A0I(A0J);
        return A003;
    }
}
