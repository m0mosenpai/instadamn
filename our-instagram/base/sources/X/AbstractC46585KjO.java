package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.KjO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46585KjO {
    public static C45127Jxw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("actor".equals(A0s)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("reaction_emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("actor", c16l, "CollectionItemReactionDetails");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("reaction_emoji", c16l, "CollectionItemReactionDetails");
            } else {
                return new C45127Jxw(user, str, 10);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
