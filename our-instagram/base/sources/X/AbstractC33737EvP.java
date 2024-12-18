package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.EvP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33737EvP {
    public static C38521qg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image_url".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "ReelToastAPIImpl");
                throw C00O.createAndThrow();
            }
            return new C38521qg(simpleImageUrl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
