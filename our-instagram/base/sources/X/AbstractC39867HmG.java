package X;

import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import java.io.IOException;

/* renamed from: X.HmG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39867HmG {
    public static CreatorViewerBottomCTAImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerBottomCTAType creatorViewerBottomCTAType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bottom_cta_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creatorViewerBottomCTAType = (CreatorViewerBottomCTAType) CreatorViewerBottomCTAType.A01.get(A1P);
                    if (creatorViewerBottomCTAType == null) {
                        creatorViewerBottomCTAType = CreatorViewerBottomCTAType.A06;
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (creatorViewerBottomCTAType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("bottom_cta_type", c16l, "CreatorViewerBottomCTAImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "CreatorViewerBottomCTAImpl");
            } else {
                return new CreatorViewerBottomCTAImpl(creatorViewerBottomCTAType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
