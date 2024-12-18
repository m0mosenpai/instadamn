package X;

import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import java.io.IOException;

/* renamed from: X.3x0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3x0 {
    public static ClipsContextualHighlightInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ContextualHighlightType contextualHighlightType = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("chaining_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("contextual_highlight_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("contextual_highlight_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("contextual_highlight_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    contextualHighlightType = (ContextualHighlightType) ContextualHighlightType.A01.get(A1P);
                    if (contextualHighlightType == null) {
                        contextualHighlightType = ContextualHighlightType.A06;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("contextual_highlight_id", "ClipsContextualHighlightInfo");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (contextualHighlightType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("contextual_highlight_type", "ClipsContextualHighlightInfo");
                } else {
                    return new ClipsContextualHighlightInfo(contextualHighlightType, str3, str, str2);
                }
            } else {
                ((C07950bF) c16l).A03.A00("contextual_highlight_title", "ClipsContextualHighlightInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
