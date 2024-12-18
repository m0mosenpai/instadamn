package X;

import com.instagram.api.schemas.ContextualLinkCtaType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hm3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39855Hm3 {
    public static C38711H2x parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C84123oy c84123oy = null;
            ContextualLinkCtaType contextualLinkCtaType = null;
            C84153p2 c84153p2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            C110204xp c110204xp = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("content_appreciation_info".equals(A0s)) {
                    c84123oy = AbstractC84113ox.parseFromJson(c16l);
                } else if ("contextual_link_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    contextualLinkCtaType = (ContextualLinkCtaType) ContextualLinkCtaType.A01.get(A1P);
                    if (contextualLinkCtaType == null) {
                        contextualLinkCtaType = ContextualLinkCtaType.A0A;
                    }
                } else if ("mashup_info".equals(A0s)) {
                    c84153p2 = AbstractC84143p0.parseFromJson(c16l);
                } else if ("prompt_stickers_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C109354wK parseFromJson = AbstractC109284vu.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reusable_text_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C93094Fl parseFromJson2 = AbstractC93044Fd.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("template_info".equals(A0s)) {
                    c110204xp = AbstractC88493x6.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (contextualLinkCtaType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("contextual_link_type", c16l, "ContextualLinkCtaInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C38711H2x(contextualLinkCtaType, c84123oy, c84153p2, c110204xp, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
