package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hrc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40164Hrc {
    public static Map A00(JLU jlu) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlu.BEA() != null) {
            A1I.put("highlighted_media_id", jlu.BEA());
        }
        if (jlu.BQN() != null) {
            A1I.put("media", jlu.BQN().A1D());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
