package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HpR {
    public static Map A00(JKN jkn) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jkn.BL7() != null) {
            A1I.put("language", jkn.BL7());
        }
        if (jkn.getUri() != null) {
            A1I.put("uri", jkn.getUri());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
