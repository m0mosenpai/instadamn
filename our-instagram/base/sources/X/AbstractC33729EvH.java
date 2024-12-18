package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.EvH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33729EvH {
    public static E81 parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(543);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_fbid", c16l, "PreviewMedia");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (simpleImageUrl == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "PreviewMedia");
                } else {
                    return new E81(simpleImageUrl, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("media_id", c16l, "PreviewMedia");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
