package X;

import androidx.compose.ui.Modifier;
import com.instagram.creator.achievements.modules.models.Badge;

/* loaded from: classes5.dex */
public abstract class CYP {
    public static final void A00(C5Tl c5Tl, Modifier modifier, Badge.ChallengeBadge challengeBadge, int i, int i2) {
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1803514468);
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(317766790, "com.instagram.creator.achievements.modules.views.TextBox (ChallengeCard.kt:76)");
        }
        InterfaceC1127857k A0D = AbstractC25233BEq.A0D(c5Tl, (i >> 3) & 14);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, modifier2);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A0D, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        Modifier A0W = AbstractC25228BEl.A0W();
        C5WR.A0A(c5Tl, AbstractC25227BEk.A0H(A0W, 4.0f), AbstractC25225BEi.A0X(c5Tl), challengeBadge.A07, 2, 48, 390, 11260);
        String str = challengeBadge.A05;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        c5Tl.Eno(-961777885);
        if (str != null) {
            C5WR.A0A(c5Tl, A0W, AbstractC25225BEi.A0Y(c5Tl), str, 2, 48, 390, 11260);
        }
        if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
            C0fH.A00(-1281764848);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(challengeBadge, modifier2, i2, i, 32);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, Badge.ChallengeBadge challengeBadge, InterfaceC16660sJ interfaceC16660sJ, int i) {
        Integer num;
        float f;
        boolean A1b = AbstractC25233BEq.A1b(challengeBadge, interfaceC16660sJ, modifier);
        if (AbstractC25235BEs.A1W(c5Tl, 1427942308)) {
            C0fH.A01(-312484714, "com.instagram.creator.achievements.modules.views.ChallengeCard (ChallengeCard.kt:36)");
        }
        Modifier A05 = C5XR.A05(AbstractC25226BEj.A0X(AbstractC25228BEl.A0X(modifier, 16.0f), AbstractC25226BEj.A0B(c5Tl)), null, null, new C29894DGi(10, interfaceC16660sJ, challengeBadge), A1b);
        InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, A05);
        InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
        AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
        InterfaceC16620sF interfaceC16620sF = C5X8.A03;
        InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
        InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
        }
        InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
        C1130158n c1130158n = Modifier.A00;
        Modifier A08 = AbstractC118175Wb.A08(c1130158n, 16.0f);
        InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
        int A002 = C5X2.A00(c5Tl);
        C59P A042 = C117505Tk.A04(c117505Tk);
        Modifier A012 = C5X3.A01(c5Tl, A08);
        AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
        C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
        if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
        }
        C5XJ.A00(c5Tl, A012, A1K);
        InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
        Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 8.0f);
        InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
        int A003 = C5X2.A00(c5Tl);
        C59P A043 = C117505Tk.A04(c117505Tk);
        Modifier A013 = C5X3.A01(c5Tl, A0E);
        AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
        C5XJ.A00(c5Tl, A0V, interfaceC16620sF);
        if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
        }
        C5XJ.A00(c5Tl, A013, A1K);
        C6LQ.A04(c5Tl, AbstractC118185Wd.A0C(c1130158n, 76.0f), AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(challengeBadge.A06)));
        A00(c5Tl, AbstractC118175Wb.A0B(c1130158n, 0.0f, 0.0f, 0.0f), challengeBadge, 56, 0);
        c5Tl.ASW();
        c5Tl.Eno(-623933510);
        if (challengeBadge.A0D && (num = challengeBadge.A02) != null) {
            int intValue = num.intValue();
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC25226BEj.A0T(c1130158n), 0.0f, 4.0f);
            float f2 = intValue;
            Integer num2 = challengeBadge.A04;
            if (num2 != null) {
                f = num2.intValue();
            } else {
                f = 1.0f;
            }
            CI0.A00(c5Tl, A0A, challengeBadge.A0A, challengeBadge.A0B, f2 / f, 6, 4, 0L, AbstractC25226BEj.A09(c5Tl));
        }
        C117505Tk.A0L(c117505Tk, false);
        String str = challengeBadge.A09;
        c5Tl.Eno(-623916590);
        if (str != null) {
            C6GE.A04(c5Tl, AbstractC25226BEj.A0T(c1130158n), AbstractC25225BEi.A0u(c5Tl), str, new C29894DGi(11, interfaceC16660sJ, challengeBadge));
        }
        if (AbstractC25233BEq.A1S(c5Tl, c117505Tk)) {
            C0fH.A00(751315960);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC16660sJ, challengeBadge, modifier, i, 27);
        }
    }
}
