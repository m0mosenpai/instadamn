package X;

import java.util.HashMap;

/* renamed from: X.XjV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72642XjV {
    public static final void A00(Object obj, HashMap hashMap, C17u c17u, int i) {
        Number number;
        if ((obj instanceof Integer) && (number = (Number) obj) != null) {
            int intValue = number.intValue();
            if (c17u.A01(intValue)) {
                MSX.A1N(Integer.valueOf(i), hashMap, intValue);
            }
        }
    }
}
