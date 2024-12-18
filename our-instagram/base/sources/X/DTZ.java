package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTZ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTZ(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        int i;
        C5Hc c5Hc;
        if (this.A00 != 0) {
            c5Tl = (C5Tl) obj;
            if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(642001203, "com.instagram.schools.management.visibility.EditVisibilityComposeView.<anonymous> (EditVisibilityComposeView.kt:33)");
                }
                if (this.A04) {
                    c5Tl.Eno(1226280835);
                    CGQ.A00(c5Tl, null, 0, 1);
                } else if (!this.A05 && (c5Hc = (C5Hc) this.A03) != null) {
                    c5Tl.Eno(-639728279);
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                    C1130158n c1130158n = Modifier.A00;
                    InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A0Y, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    CKB.A00(C5YD.A00(c5Tl, 2131977097), c5Tl, 0);
                    CYz.A01(c5Hc, interfaceC16660sJ, c5Tl, 0);
                    c5Tl.ASW();
                } else {
                    c5Tl.Eno(-639924230);
                    C0eB c0eB = C0eB.A00;
                    c5Tl.Eno(1226284225);
                    Object obj3 = this.A01;
                    boolean AH6 = c5Tl.AH6(obj3);
                    Object EEc = c5Tl.EEc();
                    if (AH6 || EEc == C5UI.A00) {
                        EEc = new PYs(obj3, null, 20);
                        c5Tl.FBy(EEc);
                    }
                    AbstractC25231BEo.A10(c5Tl, EEc, c0eB);
                }
                if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                    i = -583056021;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            c5Tl = (C5Tl) obj;
            if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-732305874, "com.instagram.barcelona.common.ui.toast.BdsToastMessage.<anonymous>.<anonymous> (BdsToastMessage.kt:74)");
                }
                Modifier modifier = Modifier.A00;
                CS5 cs5 = (CS5) this.A01;
                float f = 20.0f;
                if (this.A04) {
                    f = 0.0f;
                }
                Modifier A0E = AbstractC118175Wb.A0E(modifier, 20.0f, 0.0f, f, 0.0f);
                InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
                boolean z = this.A05;
                InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
                int A002 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                C59P A042 = C117505Tk.A04(c117505Tk2);
                Modifier A012 = C5X3.A01(c5Tl, A0E);
                AbstractC25233BEq.A11(c5Tl, c117505Tk2);
                AbstractC25231BEo.A12(c5Tl, A0V, A042);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                if (c117505Tk2.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                }
                AbstractC25225BEi.A1K(c5Tl, A012);
                C6L0 c6l0 = C6L0.A00;
                c5Tl.Eno(-976017016);
                C117505Tk.A0L(c117505Tk2, false);
                String str = cs5.A01;
                float f2 = 12.0f;
                if (z) {
                    f2 = 16.0f;
                }
                Modifier A0A = AbstractC118175Wb.A0A(modifier, 0.0f, f2);
                if (z) {
                    modifier = c6l0.A00(modifier);
                }
                Modifier Eq3 = A0A.Eq3(modifier);
                int i2 = 5;
                if (!z) {
                    i2 = 3;
                }
                C5WR.A0J(c5Tl, Eq3, AbstractC25226BEj.A0h(c5Tl), str, i2, 16252, 0L);
                c5Tl.Eno(-976002928);
                if (AbstractC25230BEn.A1U(c5Tl, c117505Tk2, false)) {
                    i = -79480446;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
