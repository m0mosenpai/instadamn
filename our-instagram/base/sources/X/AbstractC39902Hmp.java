package X;

import java.io.IOException;

/* renamed from: X.Hmp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39902Hmp {
    public static C26128BhF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C26134BhL c26134BhL = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("primary_cta".equals(A0s)) {
                    c26134BhL = AbstractC40083HqA.parseFromJson(c16l);
                } else if ("title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("body_text", c16l, "DraftMidcardFallbackMetadata");
            } else if (c26134BhL != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_text", c16l, "DraftMidcardFallbackMetadata");
                } else {
                    return new C26128BhF(c26134BhL, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("primary_cta", c16l, "DraftMidcardFallbackMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
