package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.Iterator;

/* renamed from: X.CgE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28408CgE {
    public static final void A01(C5Tl c5Tl, MUW muw, InterfaceC58202Pr8 interfaceC58202Pr8, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        C14360o3.A0B(muw, 0);
        AbstractC167027dH.A13(interfaceC16660sJ, interfaceC16660sJ2, interfaceC58202Pr8);
        c5Tl.Enr(-215596436);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, muw) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC58202Pr8);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-65291805, "instagram.features.clips.spins.creation.ui.components.SpinsSelectionRoot (SpinsSelectionComposables.kt:38)");
            }
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
            C6GM c6gm = C6GM.A00;
            String str = muw.A03;
            if (str == null) {
                str = muw.A02;
            }
            C211819a8 c211819a8 = (C211819a8) muw.A01;
            A00(c6gm, c5Tl, c211819a8, str, 6);
            A03(c5Tl, interfaceC58202Pr8, c211819a8, interfaceC16660sJ, (C5Hb) muw.A00, ((i2 << 3) & 896) | (i2 & 7168));
            int i3 = i2 >> 3;
            A02(c5Tl, interfaceC58202Pr8, c211819a8, interfaceC16660sJ2, (i3 & 896) | (i3 & 112));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1469289211);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(muw, interfaceC58202Pr8, interfaceC16660sJ2, interfaceC16660sJ, i, 30);
        }
    }

    public static final void A00(C6GN c6gn, C5Tl c5Tl, C211819a8 c211819a8, String str, int i) {
        int i2;
        c5Tl.Enr(13594889);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6gn) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c211819a8);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1083609124, "instagram.features.clips.spins.creation.ui.components.Preview (SpinsSelectionComposables.kt:53)");
            }
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            Modifier AB6 = c6gn.AB6(C118195Wf.A00, AbstractC118185Wd.A08(AbstractC118185Wd.A0D(Modifier.A00, C5XT.A02(c5Tl, R.dimen.avatar_size_ridiculously_xxxlarge_plus)), C5XT.A02(c5Tl, R.dimen.before_and_after_media_card_width)));
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, A0M, AbstractC25233BEq.A1P(c5Tl, 1031923044, i2));
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new DHQ(A0M, str, 1);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A01 = AbstractC119675bQ.A01(AB6, (InterfaceC16660sJ) EEc);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            c5Tl.Eno(950954519);
            if (str != null) {
                CLK.A00(c5Tl, c211819a8, str, AbstractC25228BEl.A01(i2));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(1589905323);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(c6gn, c211819a8, str, i, 19);
        }
    }

    public static final void A02(C5Tl c5Tl, InterfaceC58202Pr8 interfaceC58202Pr8, C211819a8 c211819a8, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(1905796729);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c211819a8) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC58202Pr8);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-858797590, "instagram.features.clips.spins.creation.ui.components.BottomButton (SpinsSelectionComposables.kt:120)");
            }
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131961124);
            boolean A1W = AbstractC167007dF.A1W(c211819a8);
            String A002 = AbstractC136736Hc.A00(c5Tl, interfaceC58202Pr8.BzB());
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 548338070, i2) | AbstractC25228BEl.A1T(i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new D8J(16, interfaceC16660sJ, c211819a8);
                c5Tl.FBy(EEc);
            }
            boolean A1W2 = AbstractC25228BEl.A1W(c5Tl);
            AbstractC28506Chz.A02(c5Tl, null, A002, A00, null, (InterfaceC16820sZ) EEc, null, A1W2 ? 1 : 0, 3072, 23540, A1W, A1W2);
            if (C0fH.A02()) {
                C0fH.A00(-83682094);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 14, c211819a8, interfaceC58202Pr8, interfaceC16660sJ);
        }
    }

    public static final void A03(C5Tl c5Tl, InterfaceC58202Pr8 interfaceC58202Pr8, C211819a8 c211819a8, InterfaceC16660sJ interfaceC16660sJ, C5Hb c5Hb, int i) {
        int i2;
        C118125Vw A00;
        c5Tl.Enr(722423050);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c211819a8) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c5Hb);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC58202Pr8);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1823256689, "instagram.features.clips.spins.creation.ui.components.TextList (SpinsSelectionComposables.kt:79)");
            }
            String A002 = AbstractC136736Hc.A00(c5Tl, interfaceC58202Pr8.BzC());
            Modifier A0W = AbstractC25228BEl.A0W();
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0E(A0W, C5XT.A00(c5Tl), 12.0f, C5XT.A00(c5Tl), 0.0f), C5XL.A01(c5Tl).A04, A002, AbstractC25226BEj.A0G(c5Tl));
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, c5Hb, -689500914);
            while (A0x.hasNext()) {
                C211819a8 c211819a82 = (C211819a8) A0x.next();
                String text = c211819a82.getText();
                C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_text_pano_outline_24, 0);
                boolean equals = c211819a82.equals(c211819a8);
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, c211819a82, AbstractC25234BEr.A1Z(c5Tl, 652685362, i2));
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new D8J(17, c211819a82, interfaceC16660sJ);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC25705BXp.A05(c5Tl, A0W, A003, new C29197Cu2(equals, (InterfaceC16820sZ) EEc), text, 48, 130780);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            String A004 = AbstractC136736Hc.A00(c5Tl, 2131955853);
            Modifier A0A = AbstractC118175Wb.A0A(A0W, C5XT.A00(c5Tl), 0.0f);
            A00 = C118125Vw.A00(null, null, AbstractC25225BEi.A0Y(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0M(c5Tl), 0L, 0L, 0L);
            C5WR.A07(c5Tl, A0A, A00, A004);
            if (C0fH.A02()) {
                C0fH.A00(-422576409);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(interfaceC58202Pr8, c5Hb, interfaceC16660sJ, c211819a8, i, 31);
        }
    }
}
