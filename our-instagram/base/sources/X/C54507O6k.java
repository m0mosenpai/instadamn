package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.O6k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54507O6k {
    public final XC1 A00;
    public final HashMap A01;

    public C54507O6k(XC1 xc1, String str, Map map) {
        C14360o3.A0B(str, 2);
        this.A00 = xc1;
        HashMap A1G = AbstractC166987dD.A1G();
        this.A01 = A1G;
        A1G.put("waterfall_id", str);
        if (map != null) {
            A1G.putAll(map);
        }
    }
}
