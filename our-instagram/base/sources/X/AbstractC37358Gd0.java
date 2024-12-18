package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gd0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37358Gd0 {
    public static Map A00(C3XK c3xk) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        c3xk.B8q();
        A1I.put("fsr_quality", Integer.valueOf(c3xk.B8q()));
        if (c3xk.BlL() != null) {
            A1I.put("redeliver_reason", c3xk.BlL());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
