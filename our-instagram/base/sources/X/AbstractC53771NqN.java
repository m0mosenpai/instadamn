package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.CloseToEarningAchievementMedia;
import java.io.IOException;

/* renamed from: X.NqN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53771NqN {
    public static CloseToEarningAchievementMedia parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_display_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_id", c16l, "CloseToEarningAchievementMedia");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(ReactProgressBarViewManager.PROP_PROGRESS, c16l, "CloseToEarningAchievementMedia");
            } else {
                return new CloseToEarningAchievementMedia(str2, str, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
