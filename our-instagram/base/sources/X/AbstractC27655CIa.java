package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CIa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27655CIa {
    public static final void A00(InterfaceC119655bO interfaceC119655bO, C5Tl c5Tl, C7T7 c7t7, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1K(interfaceC119655bO, c7t7);
        C14360o3.A0B(interfaceC16660sJ, 2);
        c5Tl.Enr(541792803);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, interfaceC119655bO) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c7t7);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-485383941, "com.instagram.direct.messagethread.compose.MessageMetadata (MessageMetadata.kt:27)");
            }
            c5Tl.Eno(1121469724);
            String str = c7t7.A05;
            if (AbstractC25225BEi.A1Y(str)) {
                C1130158n c1130158n = Modifier.A00;
                Modifier A0E = AbstractC118175Wb.A0E(interfaceC119655bO.AB5(C118195Wf.A0A, AbstractC28010CWi.A00(AbstractC118185Wd.A0D(c1130158n, 120.0f), 120.0f, 0.0f)), 8.0f, 0.0f, 0.0f, 0.0f);
                InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A0E);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0f, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6L0 c6l0 = C6L0.A00;
                C2DC A002 = C5Y7.A00(c5Tl, c7t7.A02.A02, 0);
                long A0B = AbstractC25225BEi.A0B(c7t7.A00);
                C5YS.A01(c5Tl, null, A002, 48, 20, A0B);
                C5WR.A0B(c5Tl, AbstractC118175Wb.A0E(c6l0.AB7(C118195Wf.A04, c1130158n), 5.0f, 0.0f, 0.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), str, 5, 0, 2, 0, 384, 12152, A0B);
                c5Tl.ASW();
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC27656CIb.A00(c5Tl, interfaceC119655bO.AB5(C118195Wf.A07, Modifier.A00), c7t7, interfaceC16660sJ, AbstractC25228BEl.A0h(c5Tl).Awk() * 31.0f, (i2 & 112) | ((i2 << 3) & 7168));
            if (C0fH.A02()) {
                C0fH.A00(1474176613);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC119655bO, c7t7, interfaceC16660sJ, i, 40);
        }
    }
}
