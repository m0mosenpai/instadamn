package X;

import com.instagram.api.schemas.TemplateTopic;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HvY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40385HvY {
    public static C38786H6b parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            TemplateTopic templateTopic = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("category".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    templateTopic = (TemplateTopic) TemplateTopic.A01.get(A1P);
                    if (templateTopic == null) {
                        templateTopic = TemplateTopic.A0K;
                    }
                } else if ("clips_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("subtype".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("body_text", c16l, "TemplateMidCardMetadata");
            } else if (templateTopic != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("clips_items", c16l, "TemplateMidCardMetadata");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_text", c16l, "TemplateMidCardMetadata");
                } else {
                    return new C38786H6b(templateTopic, str, str2, str3, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("category", c16l, "TemplateMidCardMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
