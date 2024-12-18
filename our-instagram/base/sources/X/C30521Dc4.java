package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dc4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30521Dc4 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30521Dc4(InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A02 = z;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-495165616, "com.instagram.aistudio.editor.sectionHeaderItems.<anonymous> (AiKnowledgeScreen.kt:151)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0D = AbstractC118175Wb.A0D(AbstractC25226BEj.A0T(c1130158n), 16.0f, 16.0f, 0.0f);
            int i = this.A00;
            boolean z = this.A02;
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0D);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            String A002 = C5YD.A00(c5Tl, i);
            C5WR.A0R(c5Tl, c6l0.A00(c1130158n), AbstractC25225BEi.A0X(c5Tl), A002, AbstractC25226BEj.A0G(c5Tl));
            String A003 = C5YD.A00(c5Tl, 2131952265);
            Modifier A004 = CB8.A00(c1130158n, AbstractC25230BEn.A00(z ? 1 : 0));
            boolean A1W = AbstractC25232BEp.A1W(c5Tl, interfaceC16820sZ, -674779336, z);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A0x(c5Tl, interfaceC16820sZ, 8, z);
            }
            C5WR.A0R(c5Tl, C5XR.A05(A004, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), AbstractC25225BEi.A0X(c5Tl), A003, AbstractC25226BEj.A0C(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1732117106);
            }
        }
        return C0eB.A00;
    }
}
