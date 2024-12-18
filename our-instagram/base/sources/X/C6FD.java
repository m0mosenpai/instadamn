package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6FD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FD {
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();

    public final int A00(C102884kP c102884kP, C102884kP c102884kP2, String str) {
        int incrementAndGet;
        C6AR c6ar = new C6AR(c102884kP2.A04, c102884kP.A04, str);
        synchronized (this.A00) {
            Map map = this.A01;
            Integer num = (Integer) map.get(c6ar);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = AbstractC102944kV.A00.incrementAndGet();
                map.put(c6ar, Integer.valueOf(incrementAndGet));
            }
        }
        return incrementAndGet;
    }
}
