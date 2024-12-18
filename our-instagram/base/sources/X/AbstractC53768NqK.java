package X;

import com.instagram.api.schemas.AchievementButtonAction;
import com.instagram.api.schemas.AchievementButtonInfoImpl;
import java.io.IOException;

/* renamed from: X.NqK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53768NqK {
    public static AchievementButtonInfoImpl parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AchievementButtonAction achievementButtonAction = null;
            String str = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(61);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    achievementButtonAction = (AchievementButtonAction) AchievementButtonAction.A01.get(A1P);
                    if (achievementButtonAction == null) {
                        achievementButtonAction = AchievementButtonAction.A09;
                    }
                } else if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("deeplink_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (achievementButtonAction == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "AchievementButtonInfoImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deeplink_url", c16l, "AchievementButtonInfoImpl");
                } else {
                    return new AchievementButtonInfoImpl(achievementButtonAction, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("button_text", c16l, "AchievementButtonInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
