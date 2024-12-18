package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.CHt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27648CHt {
    public static final void A00(C5Tl c5Tl, FragmentActivity fragmentActivity, UserSession userSession, String str, List list, int i) {
        AbstractC167017dG.A1P(userSession, fragmentActivity);
        if (AbstractC25235BEs.A1W(c5Tl, -205067999)) {
            C0fH.A01(1766305791, "com.instagram.creator.achievements.modules.views.EarnedAchievementsScreen (EarnedAchievementsScreen.kt:25)");
        }
        C6IS.A06(c5Tl, AbstractC25228BEl.A0W(), new C50365MLr(list, userSession, fragmentActivity, str, 32));
        if (C0fH.A02()) {
            C0fH.A00(645619271);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30224DTd(list, userSession, fragmentActivity, str, i, 5);
        }
    }
}
