package X;

import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.HyU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40548HyU {
    public static final C1ON A00(ClipsContextualHighlightInfo clipsContextualHighlightInfo, UserSession userSession, String str) {
        String str2;
        String str3;
        String str4 = null;
        if (clipsContextualHighlightInfo != null) {
            str2 = clipsContextualHighlightInfo.A02;
            ContextualHighlightType contextualHighlightType = clipsContextualHighlightInfo.A00;
            if (contextualHighlightType != null) {
                str4 = contextualHighlightType.A00;
                str3 = clipsContextualHighlightInfo.A01;
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0R(C124275jh.class, C37410Gdq.class);
                A0c.A0B("clips/contextual_highlight_chaining/");
                A0c.A0H("contextual_highlight_id", str2);
                A0c.A0H("contextual_highlight_type", str4);
                AbstractC37301Gc2.A1N(A0c, "chaining_media_id", str3, str);
                return A0c.A0N();
            }
        } else {
            str2 = null;
        }
        if (clipsContextualHighlightInfo == null) {
            str3 = null;
            C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
            A0c2.A0R(C124275jh.class, C37410Gdq.class);
            A0c2.A0B("clips/contextual_highlight_chaining/");
            A0c2.A0H("contextual_highlight_id", str2);
            A0c2.A0H("contextual_highlight_type", str4);
            AbstractC37301Gc2.A1N(A0c2, "chaining_media_id", str3, str);
            return A0c2.A0N();
        }
        str3 = clipsContextualHighlightInfo.A01;
        C25621Ms A0c22 = AbstractC167017dG.A0c(userSession);
        A0c22.A0R(C124275jh.class, C37410Gdq.class);
        A0c22.A0B("clips/contextual_highlight_chaining/");
        A0c22.A0H("contextual_highlight_id", str2);
        A0c22.A0H("contextual_highlight_type", str4);
        AbstractC37301Gc2.A1N(A0c22, "chaining_media_id", str3, str);
        return A0c22.A0N();
    }
}
