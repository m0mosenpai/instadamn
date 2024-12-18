package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.3QG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QG {
    public static final Map A03 = new IdentityHashMap();
    public int A00 = 1;
    public Object A01;
    public final C1VS A02;

    public static void A00(C3QG c3qg) {
        boolean z;
        synchronized (c3qg) {
            z = false;
            if (c3qg.A00 > 0) {
                z = true;
            }
        }
        if (z) {
        } else {
            throw new B4O();
        }
    }

    public final synchronized Object A01() {
        return this.A01;
    }

    public final void A02() {
        int i;
        Object obj;
        synchronized (this) {
            A00(this);
            boolean z = false;
            if (this.A00 > 0) {
                z = true;
            }
            C0Hf.A00(Boolean.valueOf(z));
            i = this.A00 - 1;
            this.A00 = i;
        }
        if (i == 0) {
            synchronized (this) {
                obj = this.A01;
                this.A01 = null;
            }
            if (obj != null) {
                C1VS c1vs = this.A02;
                if (c1vs != null) {
                    c1vs.EE3(obj);
                }
                Map map = A03;
                synchronized (map) {
                    Integer num = (Integer) map.get(obj);
                    if (num == null) {
                        Object[] objArr = {obj.getClass()};
                        C0I3 c0i3 = C0I2.A00;
                        if (c0i3.isLoggable(6)) {
                            c0i3.wtf("SharedReference", String.format(null, "No entry in sLiveObjects for value of type %s", objArr));
                        }
                    } else {
                        int intValue = num.intValue();
                        if (intValue == 1) {
                            map.remove(obj);
                        } else {
                            map.put(obj, Integer.valueOf(intValue - 1));
                        }
                    }
                }
            }
        }
    }

    public C3QG(C1VS c1vs, Object obj, boolean z) {
        this.A01 = obj;
        this.A02 = c1vs;
        if (z) {
            Map map = A03;
            synchronized (map) {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
    }
}
