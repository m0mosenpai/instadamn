package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HsJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40196HsJ {
    public static Map A00(JL6 jl6) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jl6.getOriginalMediaId() != null) {
            A1I.put("original_media_id", jl6.getOriginalMediaId());
        }
        if (jl6.Boi() != null) {
            A1I.put("response_creator_username", jl6.Boi());
        }
        if (jl6.Boj() != null) {
            A1I.put(AbstractC111324zv.A00(1237), jl6.Boj());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
