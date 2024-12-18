package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2XK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XK {
    public final int A02;
    public final AtomicInteger A01 = new AtomicInteger(1);
    public final HashMap A00 = new HashMap();

    public final long A00(String str, int i) {
        int intValue;
        synchronized (this) {
            HashMap hashMap = this.A00;
            Object obj = hashMap.get(str);
            if (obj == null) {
                obj = Integer.valueOf(this.A01.getAndIncrement());
                hashMap.put(str, obj);
            }
            intValue = ((Number) obj).intValue();
        }
        return (i << 32) | intValue | (this.A02 << 35);
    }

    public C2XK(int i) {
        this.A02 = i;
    }
}
