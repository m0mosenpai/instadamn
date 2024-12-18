package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.2C5, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2C5 {
    public static final Map A02 = new EnumMap(C2C1.class);
    public static final Map A00 = new EnumMap(C2C6.class);
    public static final Map A01 = new EnumMap(C2C7.class);

    public static final boolean A02(C2C1 c2c1) {
        Boolean bool = true;
        return bool.equals(A02.get(c2c1));
    }

    static {
        for (C2C1 c2c1 : C2C1.values()) {
            A02.put(c2c1, false);
        }
        for (C2C6 c2c6 : C2C6.values()) {
            A00.put(c2c6, -1);
        }
        for (C2C7 c2c7 : C2C7.values()) {
            A01.put(c2c7, -1L);
        }
        Map map = A02;
        map.put(C2C1.A0Q, true);
        map.put(C2C1.A0M, true);
        map.put(C2C1.A1F, true);
        A00.put(C2C6.A03, 100);
    }

    public static final int A00(C2C6 c2c6) {
        Object obj = A00.get(c2c6);
        if (obj != null) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(C2C1 c2c1, boolean z) {
        A02.put(c2c1, Boolean.valueOf(z));
    }
}
