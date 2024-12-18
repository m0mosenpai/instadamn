package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40249HtF {
    public static Map A00(JL8 jl8) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        jl8.B1r();
        A1I.put("end", Integer.valueOf(jl8.B1r()));
        jl8.BzY();
        A1I.put("start", Integer.valueOf(jl8.BzY()));
        if (jl8.getText() != null) {
            AbstractC37300Gc1.A15(jl8.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
