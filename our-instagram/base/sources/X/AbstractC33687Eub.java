package X;

import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Eub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33687Eub {
    public static C26086BgF parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            FanClubCategoryType fanClubCategoryType = null;
            User user2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("back_subscriber".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("category_context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("category_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("category_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    fanClubCategoryType = (FanClubCategoryType) FanClubCategoryType.A01.get(A1P);
                    if (fanClubCategoryType == null) {
                        fanClubCategoryType = FanClubCategoryType.A07;
                    }
                } else {
                    user2 = AbstractC31180DnO.A0W(c16l, user2, A0s, "front_subscriber");
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("back_subscriber", c16l, "FanClubCategoryMetadata");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("category_name", c16l, "FanClubCategoryMetadata");
                } else if (fanClubCategoryType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("category_type", c16l, "FanClubCategoryMetadata");
                } else if (user2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("front_subscriber", c16l, "FanClubCategoryMetadata");
                } else {
                    return new C26086BgF(fanClubCategoryType, user, user2, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("category_context", c16l, "FanClubCategoryMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
