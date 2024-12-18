package X;

import com.instagram.api.schemas.TemplatesBrowserSectionSize;
import java.io.IOException;

/* renamed from: X.Hvb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40388Hvb {
    public static MUW parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            TemplatesBrowserSectionSize templatesBrowserSectionSize = null;
            String str2 = null;
            C111074zO c111074zO = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("paging_info".equals(A0s)) {
                    c111074zO = AbstractC111064zN.parseFromJson(c16l);
                } else if ("section_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("section_size".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    templatesBrowserSectionSize = (TemplatesBrowserSectionSize) TemplatesBrowserSectionSize.A01.get(A1P);
                    if (templatesBrowserSectionSize == null) {
                        templatesBrowserSectionSize = TemplatesBrowserSectionSize.A05;
                    }
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
                AbstractC166997dE.A1V("section_id", c16l, "TemplatesBrowserSectionInfo");
            } else if (templatesBrowserSectionSize != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_text", c16l, "TemplatesBrowserSectionInfo");
                } else {
                    return new MUW(c111074zO, templatesBrowserSectionSize, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("section_size", c16l, "TemplatesBrowserSectionInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
