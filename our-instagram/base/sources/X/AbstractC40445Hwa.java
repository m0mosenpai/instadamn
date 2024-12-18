package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40445Hwa {
    public static Map A00(JLC jlc) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlc.B2B() != null) {
            A1I.put("end_ts", jlc.B2B());
        }
        if (jlc.BE7() != null) {
            A1I.put("highlight_text", jlc.BE7());
        }
        if (jlc.Bzr() != null) {
            A1I.put("start_ts", jlc.Bzr());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
