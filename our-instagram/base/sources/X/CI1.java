package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementIntf;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CI1 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, AchievementIntf achievementIntf, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, achievementIntf, interfaceC16660sJ);
        c5Tl.Enr(-1486932256);
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(-925163838, "com.instagram.creator.achievements.modules.views.ProgressMediaList (ProgressMediaList.kt:39)");
        }
        List Aoj = achievementIntf.Aoj();
        if (Aoj != null && !Aoj.isEmpty()) {
            C6IS.A01(null, AbstractC118255Wn.A01(16.0f), null, null, c5Tl, null, AbstractC25227BEk.A0H(AbstractC118185Wd.A00(C118195Wf.A02, AbstractC25225BEi.A0Q(modifier2)), 16.0f), new C50372MLz(32, modifier2, Aoj, interfaceC16660sJ, achievementIntf), 12607488, 110, false, A1R);
        }
        if (C0fH.A02()) {
            C0fH.A00(100435148);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 26, achievementIntf, interfaceC16660sJ, modifier2);
        }
    }
}
