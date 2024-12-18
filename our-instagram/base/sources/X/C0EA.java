package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* renamed from: X.0EA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EA {
    public Map A00 = new HashMap();

    public static synchronized void A00(C0EA c0ea, Object obj) {
        synchronized (c0ea) {
            Map map = c0ea.A00;
            C0E9 c0e9 = (C0E9) map.get(obj);
            AbstractC05810Sj.A00(c0e9);
            int i = c0e9.A00 - 1;
            c0e9.A00 = i;
            if (i == 0) {
                map.remove(obj);
            }
        }
    }

    public final synchronized void A01(Object obj) {
        C0E9 c0e9 = (C0E9) this.A00.get(obj);
        AbstractC05810Sj.A00(c0e9);
        Semaphore semaphore = c0e9.A01;
        boolean z = false;
        if (semaphore.availablePermits() == 0) {
            z = true;
        }
        AbstractC05810Sj.A02(z);
        semaphore.release();
        A00(this, obj);
    }
}
