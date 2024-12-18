package X;

import java.util.Map;

/* renamed from: X.IlJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42109IlJ implements C2n2 {
    public final /* synthetic */ C3NJ A00;

    public C42109IlJ(C3NJ c3nj) {
        this.A00 = c3nj;
    }

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        long parseLong = Long.parseLong((String) obj);
        Map map = AbstractC37491Gf9.A00;
        if (map.isEmpty()) {
            for (EnumC71343Hv enumC71343Hv : EnumC71343Hv.values()) {
                map.put(Long.valueOf(enumC71343Hv.A00), enumC71343Hv);
            }
        }
        Object obj2 = map.get(Long.valueOf(parseLong));
        if (obj2 == null) {
            return "";
        }
        return obj2.toString();
    }
}
