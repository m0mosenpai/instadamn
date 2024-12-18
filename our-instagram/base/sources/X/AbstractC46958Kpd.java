package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Kpd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46958Kpd {
    public static C29891c4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29891c4 c29891c4 = new C29891c4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sender".equals(A0s)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    c29891c4.A00 = AbstractC38851rI.A00(c16l, false);
                } else {
                    AbstractC47856LCb.A01(c16l, c29891c4, A0s);
                }
                c16l.A0z();
            }
            return c29891c4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
