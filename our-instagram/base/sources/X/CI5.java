package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;

/* loaded from: classes5.dex */
public abstract class CI5 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, Badge badge, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        Integer num;
        boolean z;
        Integer num2;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, badge, interfaceC16660sJ);
        c5Tl.Enr(-1123983569);
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(1268818838, "com.instagram.creator.achievements.modules.views.UnearnedAchievement (UnearnedAchievement.kt:40)");
        }
        UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
        Modifier A0E = AbstractC118175Wb.A0E(modifier2, 0.0f, 0.0f, 0.0f, 16.0f);
        InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, A0E);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A0M, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        C6LQ.A00(c5Tl, C118195Wf.A09, C5XR.A05(AbstractC118185Wd.A0C(modifier2, 96.0f), null, null, new C29894DGi(16, interfaceC16660sJ, badge), A1R), null, AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(badge.A02())), null, "", 0.0f, 3128, 112);
        C5WR.A07(c5Tl, AbstractC118185Wd.A0D(modifier2, 80.0f), AbstractC25226BEj.A0f(c5Tl), badge.A03());
        boolean z2 = badge instanceof Badge.ChallengeBadge;
        if (z2) {
            num = ((Badge.ChallengeBadge) badge).A02;
        } else if (badge instanceof Badge.AchievementBadge) {
            num = ((Badge.AchievementBadge) badge).A02;
        } else {
            num = badge.A00;
        }
        c5Tl.Eno(-1553193078);
        if (num != null) {
            int intValue = num.intValue();
            c5Tl.Eno(-1553192065);
            if (z2) {
                z = ((Badge.ChallengeBadge) badge).A0D;
            } else {
                z = badge.A02;
            }
            if (z) {
                if (z2) {
                    num2 = ((Badge.ChallengeBadge) badge).A04;
                } else if (badge instanceof Badge.AchievementBadge) {
                    num2 = ((Badge.AchievementBadge) badge).A04;
                } else {
                    num2 = badge.A01;
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    C06090Tz A0j = AbstractC25225BEi.A0j(A0u, 0);
                    if (C18U.A06(A0j, A0u, 36322993689275207L)) {
                        CIP.A00(A0u, "ig_achievements_2024", C18U.A04(A0j, A0u, 36885943642620602L), "achievements_hub");
                    }
                    if (C18U.A06(A0j, A0u, 36322993688947523L)) {
                        c5Tl.Eno(-417688449);
                        AbstractC27654CHz.A00(c5Tl, AbstractC118185Wd.A08(AbstractC118185Wd.A0D(AbstractC118175Wb.A0E(modifier2, 0.0f, 4.0f, 0.0f, 0.0f), 80.0f), 4.0f), intValue / intValue2, 0, 12, 0L, 0L);
                    } else {
                        c5Tl.Eno(-417480935);
                        CI4.A00(c5Tl, AbstractC118185Wd.A0D(modifier2, 80.0f), null, intValue, intValue2, 0, 24, 0L);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                }
            }
            C117505Tk.A0L(c117505Tk, false);
        }
        if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
            C0fH.A00(-782012006);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 27, badge, interfaceC16660sJ, modifier2);
        }
    }
}
