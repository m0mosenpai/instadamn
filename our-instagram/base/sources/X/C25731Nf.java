package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25731Nf extends C0YY implements InterfaceC16820sZ {
    public static final C25731Nf A00 = new C25731Nf();

    public C25731Nf() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        java.util.Set<Map.Entry> entrySet;
        HashMap A08 = AbstractC13670mt.A08("", C04830Nb.A00);
        if (A08 != null && (entrySet = A08.entrySet()) != null) {
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(entrySet, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
            }
            return linkedHashMap;
        }
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c16920sk;
    }
}
