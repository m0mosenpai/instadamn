package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SYK {
    public Map A00 = AbstractC166987dD.A1G();
    public Map A01 = AbstractC166987dD.A1G();

    public final void A01(Enum protoEnum, Object objectEnum) {
        this.A00.put(protoEnum, objectEnum);
        this.A01.put(objectEnum, protoEnum);
    }

    public static C62717SNg A00(SYK syk, Enum r2, Object obj) {
        syk.A01(r2, obj);
        return new C62717SNg(Collections.unmodifiableMap(syk.A00), Collections.unmodifiableMap(syk.A01));
    }
}
