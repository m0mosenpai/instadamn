package X;

import java.util.HashSet;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SEA {
    public Map A00;
    public java.util.Set A01;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.SEA, java.lang.Object] */
    public static SXG A00(Object obj, Map map) {
        HashSet hashSet = new HashSet();
        hashSet.add(obj);
        C63346Si2 c63346Si2 = C2FP.A04().A01;
        ?? obj2 = new Object();
        obj2.A00 = map;
        obj2.A01 = hashSet;
        C16920sk A0E = AbstractC06930Yk.A0E();
        C14360o3.A0B(A0E, 8);
        C64192T3b c64192T3b = new C64192T3b(c63346Si2, 1);
        C16910sj c16910sj = C16910sj.A00;
        return new SXG(AbstractC63063Sbk.A00(c64192T3b, c16910sj), obj2, "SEND_E2EE_DATA", null, null, null, null, null, A0E, c16910sj);
    }
}
