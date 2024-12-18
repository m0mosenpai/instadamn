package X;

import com.instagram.shopping.model.taggingfeed.SourceType;
import java.io.IOException;

/* renamed from: X.I8k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40860I8k {
    public static C38687GzS parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            SourceType sourceType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("keyword".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("source_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    sourceType = (SourceType) SourceType.A01.get(A1P);
                    if (sourceType == null) {
                        sourceType = SourceType.A0E;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("keyword", c16l, "KeywordMetadataImpl");
            } else if (sourceType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("source_type", c16l, "KeywordMetadataImpl");
            } else {
                return new C38687GzS(sourceType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
