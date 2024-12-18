package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.F0q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34037F0q {
    public static MUD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collapsed_icon".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("label".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("label", c16l, "AttributionPivotPageResponse.AttributionPivotPageCTA");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("url", c16l, "AttributionPivotPageResponse.AttributionPivotPageCTA");
            } else {
                return new MUD((ImageUrl) simpleImageUrl, str, str2, 12);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
