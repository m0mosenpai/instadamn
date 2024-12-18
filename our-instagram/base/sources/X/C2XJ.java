package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2XJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XJ {
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A01 = new HashMap();
    public java.util.Set A00 = new HashSet();

    public final synchronized void A00(C2XO c2xo) {
        java.util.Set set = this.A00;
        set.remove(c2xo);
        if (set.isEmpty()) {
            this.A01.clear();
            this.A02.clear();
        }
    }
}
