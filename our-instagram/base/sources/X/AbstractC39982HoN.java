package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HoN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39982HoN {
    public static Map A00(C5L5 c5l5) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5l5.BIM() != null) {
            A1I.put(AbstractC111324zv.A00(121), c5l5.BIM());
        }
        if (c5l5.BIN() != null) {
            A1I.put("instagram_data_policy_url", c5l5.BIN());
        }
        if (c5l5.BeG() != null) {
            A1I.put("policy_url", c5l5.BeG());
        }
        if (c5l5.Bge() != null) {
            A1I.put(AbstractC111324zv.A00(257), c5l5.Bge());
        }
        if (c5l5.Brn() != null) {
            A1I.put("secure_sharing_text_instagram", c5l5.Brn());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
