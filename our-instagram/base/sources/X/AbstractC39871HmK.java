package X;

import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.HmK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39871HmK {
    public static CreatorViewerInsightInfoImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2 = null;
            String str = null;
            FormattedStringImpl formattedStringImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("formatted_text".equals(A0s)) {
                    formattedStringImpl = IO9.parseFromJson(c16l);
                } else if ("insight_type_v2".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creatorViewerInsightTypeV2 = (CreatorViewerInsightTypeV2) CreatorViewerInsightTypeV2.A01.get(A1P);
                    if (creatorViewerInsightTypeV2 == null) {
                        creatorViewerInsightTypeV2 = CreatorViewerInsightTypeV2.A0C;
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
            if (creatorViewerInsightTypeV2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("insight_type_v2", c16l, "CreatorViewerInsightInfoImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "CreatorViewerInsightInfoImpl");
            } else {
                return new CreatorViewerInsightInfoImpl(creatorViewerInsightTypeV2, formattedStringImpl, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
