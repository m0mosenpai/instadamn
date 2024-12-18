package X;

import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hus, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40348Hus {
    public static Map A00(JKZ jkz) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jkz.getMediaId() != null) {
            AbstractC37300Gc1.A18(jkz.getMediaId(), A1I);
        }
        if (jkz.BRg() != null) {
            StoryTrendingPromptMediaSubType BRg = jkz.BRg();
            C14360o3.A0B(BRg, 0);
            A1I.put("media_subtype", BRg.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
