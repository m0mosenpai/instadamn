package X;

import java.util.Map;

/* renamed from: X.Dw9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31704Dw9 {
    public static final Object A00(C6FW c6fw) {
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Map map = (Map) c6fw.A00.get(2);
        if (map != null) {
            java.util.Set<Map.Entry> entrySet = C6BQ.A0H(map).entrySet();
            C14360o3.A07(entrySet);
            for (Map.Entry entry : entrySet) {
                C006802i.A0p.markerAnnotate(A0D, A0D2, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        return null;
    }
}
