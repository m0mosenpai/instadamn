package X;

import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Huq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40346Huq {
    public static Map A00(JKY jky) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (jky.BRF() != null) {
            List<JKZ> BRF = jky.BRF();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (JKZ jkz : BRF) {
                if (jkz != null) {
                    A1E.add(jkz.F7o());
                }
            }
            A1I.put("media_logging_infos", A1E);
        }
        if (jky.Bil() != null) {
            StoryTrendingPromptSubType Bil = jky.Bil();
            if (Bil != null) {
                str = Bil.A00;
            }
            A1I.put("prompt_subtype", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
