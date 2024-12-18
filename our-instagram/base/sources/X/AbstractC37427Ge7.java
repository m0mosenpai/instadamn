package X;

import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ge7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37427Ge7 {
    public static Map A00(ClipsContextualHighlightInfoIntf clipsContextualHighlightInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (clipsContextualHighlightInfoIntf.getChainingMediaId() != null) {
            A1I.put("chaining_media_id", clipsContextualHighlightInfoIntf.getChainingMediaId());
        }
        if (clipsContextualHighlightInfoIntf.getContextualHighlightId() != null) {
            A1I.put("contextual_highlight_id", clipsContextualHighlightInfoIntf.getContextualHighlightId());
        }
        if (clipsContextualHighlightInfoIntf.getContextualHighlightTitle() != null) {
            A1I.put("contextual_highlight_title", clipsContextualHighlightInfoIntf.getContextualHighlightTitle());
        }
        if (clipsContextualHighlightInfoIntf.ArX() != null) {
            ContextualHighlightType ArX = clipsContextualHighlightInfoIntf.ArX();
            C14360o3.A0B(ArX, 0);
            A1I.put("contextual_highlight_type", ArX.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
