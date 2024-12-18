package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementButtonInfo;

/* renamed from: X.CHg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27635CHg {
    public static final void A00(C5Tl c5Tl, QIz qIz, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(589744130);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, qIz) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(377601098, "com.instagram.creator.achievements.modules.fragments.AboutAchievementsScreen (AboutAchievementsFragment.kt:121)");
            }
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A04;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(interfaceC118335Wv, c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Modifier A0M = AbstractC25227BEk.A0M(c1130158n, 32.0f);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, qIz, -13361567);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new C57749Pjc(qIz, 24);
                c5Tl.FBy(EEc);
            }
            C6IS.A06(c5Tl, A0M, AbstractC25225BEi.A1B(c117505Tk, EEc, false));
            AchievementButtonInfo achievementButtonInfo = (AchievementButtonInfo) qIz.A02;
            c5Tl.Eno(-13333144);
            if (achievementButtonInfo != null) {
                String Aj7 = achievementButtonInfo.Aj7();
                boolean AH6 = c5Tl.AH6(achievementButtonInfo) | AbstractC25234BEr.A1Y(c5Tl, -688552972, i2);
                Object EEc2 = c5Tl.EEc();
                if (AH6 || EEc2 == C5UI.A00) {
                    EEc2 = new ME0(43, interfaceC16660sJ, achievementButtonInfo);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28506Chz.A0A(c5Tl, Aj7, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 0, 32764);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-480303147);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, interfaceC16660sJ, qIz, i, 45);
        }
    }
}
