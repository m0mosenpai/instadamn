package X;

import com.instagram.api.schemas.StoryTextAttributionType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hui, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40338Hui {
    public static Map A00(JL9 jl9) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jl9.AdM() != null) {
            StoryTextAttributionType AdM = jl9.AdM();
            C14360o3.A0B(AdM, 0);
            A1I.put("attribution_type", AdM.A00);
        }
        if (jl9.Ah3() != null) {
            List<JKX> Ah3 = jl9.Ah3();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (JKX jkx : Ah3) {
                if (jkx != null) {
                    A1E.add(jkx.F7o());
                }
            }
            A1I.put("bold_ranges", A1E);
        }
        if (jl9.getText() != null) {
            AbstractC37300Gc1.A15(jl9.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
