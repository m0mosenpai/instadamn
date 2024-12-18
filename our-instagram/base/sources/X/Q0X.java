package X;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class Q0X {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        Object A0a = MSY.A0a(c6fw);
        C14360o3.A0C(A0a, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A0a;
        C1LN.A01("InflateSync");
        try {
            try {
                Q0W q0w = new Q0W(C1LZ.A00().A04, c6fq, AbstractC166997dE.A15(map));
                q0w.Csy();
                obj = AbstractC102864kN.A01(null, q0w);
            } catch (IOException e) {
                AbstractC25241Le.A03("inflate_sync_error", e);
                obj = null;
            }
            return obj;
        } finally {
            C1LN.A00();
        }
    }
}
