package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrlBase;

/* loaded from: classes5.dex */
public abstract class CE5 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, MUD mud, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        long A02;
        C118125Vw A00;
        AbstractC167007dF.A1K(mud, interfaceC16660sJ);
        c5Tl.Enr(-906842530);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, mud) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-426115586, "com.instagram.barcelona.feed.mediaviewer.ui.WearableAttributionCTA (WearableAttributionCTA.kt:24)");
            }
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(AbstractC121605fB.A0K), 0.2f);
            Modifier A0Z = AbstractC25228BEl.A0Z(modifier, 10.0f, A02);
            c5Tl.Eno(-1560895054);
            boolean A1P = AbstractC167007dF.A1P(i3 & 112, 32) | AbstractC25228BEl.A1R(i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new MHV(48, interfaceC16660sJ, mud);
                c5Tl.FBy(EEc);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC25235BEs.A0I(c5Tl, c117505Tk, A0Z, (InterfaceC16820sZ) EEc), 8.0f, 4.0f);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC136656Gu.A03(c5Tl, AbstractC118175Wb.A0E(AbstractC118185Wd.A0C(Modifier.A00, 14.0f), 0.0f, 0.0f, 4.0f, 0.0f), (ImageUrlBase) mud.A00, 432);
            String str = mud.A02;
            A00 = C118125Vw.A00(null, null, AbstractC25226BEj.A0f(c5Tl), null, null, null, 0, 0, 0, 16777214, AbstractC25226BEj.A0H(c5Tl), 0L, 0L, 0L);
            C5WR.A0j(c5Tl, A00, str);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(45760000);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 12, modifier, mud, interfaceC16660sJ);
        }
    }
}
