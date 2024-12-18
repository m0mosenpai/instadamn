package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.HlU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39820HlU {
    public static C26126BhC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            String str2 = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("content_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC58317Pt9.A00(10).equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("media_count".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, "profile");
                }
                c16l.A0z();
            }
            return new C26126BhC(simpleImageUrl, user, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
