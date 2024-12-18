package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.CHs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27647CHs {
    public static final void A00(C5Tl c5Tl, Modifier modifier, UserSession userSession, InterfaceC30804Dgf interfaceC30804Dgf, String str, List list, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        Modifier modifier2 = modifier;
        AbstractC167017dG.A1P(userSession, list);
        int A08 = AbstractC25230BEn.A08(3, str, interfaceC16660sJ);
        c5Tl.Enr(-75543261);
        if ((i2 & 1) != 0) {
            modifier2 = Modifier.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(494839296, "com.instagram.creator.achievements.modules.views.EarnedAchievementsRow (EarnedAchievementsRow.kt:33)");
        }
        Modifier A0E = AbstractC118175Wb.A0E(modifier2, 0.0f, 0.0f, 0.0f, 16.0f);
        InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, A0E);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A02, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        FillElement fillElement = AbstractC118185Wd.A02;
        BY1.A00(c5Tl, modifier2.Eq3(fillElement), interfaceC30804Dgf, null, str, ((i >> 9) & 14) | Constants.LOAD_RESULT_PGO, 44);
        C6IS.A02(null, new C1333560c(16.0f, 0.0f, 16.0f, 0.0f), C6IE.A00(c5Tl, 0, 0, 0, 3), c5Tl, C118195Wf.A05, modifier2.Eq3(fillElement), new C30172DRc(34, list, interfaceC16660sJ, userSession), 12779904, 88);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(-1625295784);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30293DVu(userSession, interfaceC16660sJ, interfaceC30804Dgf, modifier2, list, str, i, i2, A08);
        }
    }
}
