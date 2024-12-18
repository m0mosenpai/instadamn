package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.16j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C223016j {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final int A06;
    public final LinkedHashMap A07;
    public final int A08;

    public int A01(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized LinkedHashMap A04() {
        return new LinkedHashMap(this.A07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        throw new java.lang.IllegalStateException(X.AnonymousClass001.A0R(getClass().getName(), ".sizeOf() is reporting inconsistent results!"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.A02     // Catch: java.lang.Throwable -> L6e
            if (r0 > r7) goto L7
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6e
            return
        L7:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6e
            r5 = 0
        L9:
            monitor-enter(r6)
            int r2 = r6.A02     // Catch: java.lang.Throwable -> L6b
            if (r2 < 0) goto L57
            java.util.LinkedHashMap r1 = r6.A07     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L18
            if (r2 != 0) goto L57
        L18:
            int r0 = r6.A06     // Catch: java.lang.Throwable -> L6b
            r4 = 0
            if (r5 < r0) goto L1f
            if (r2 <= r7) goto L55
        L1f:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L55
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L6b
            r1.remove(r3)     // Catch: java.lang.Throwable -> L6b
            int r1 = r6.A02     // Catch: java.lang.Throwable -> L6b
            int r0 = r6.A00(r3, r2)     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 - r0
            r6.A02 = r1     // Catch: java.lang.Throwable -> L6b
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L6b
            r1 = 1
            int r0 = r0 + 1
            r6.A00 = r0     // Catch: java.lang.Throwable -> L6b
            int r5 = r5 + 1
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
            r6.A07(r1, r3, r2, r4)
            goto L9
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
            return
        L57:
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L6e:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223016j.A05(int):void");
    }

    public final void A06(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap;
        Object put;
        Object key;
        Object value;
        if (obj != null && obj2 != null) {
            synchronized (this) {
                this.A05++;
                this.A02 += A00(obj, obj2);
                linkedHashMap = this.A07;
                put = linkedHashMap.put(obj, obj2);
                if (put != null) {
                    this.A02 -= A00(obj, put);
                }
            }
            if (put != null) {
                A07(false, obj, put, obj2);
            }
            int i = this.A01;
            int i2 = this.A08;
            A05(i);
            synchronized (this) {
                if (linkedHashMap.size() <= i2) {
                    return;
                }
                int i3 = 0;
                while (true) {
                    synchronized (this) {
                        if ((i3 < this.A06 || linkedHashMap.size() > i2) && !linkedHashMap.isEmpty()) {
                            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                            key = entry.getKey();
                            value = entry.getValue();
                            linkedHashMap.remove(key);
                            this.A02 -= A00(key, value);
                            this.A00++;
                            i3++;
                        }
                    }
                    A07(true, key, value, null);
                }
                return;
            }
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void A07(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        i = this.A03;
        i2 = this.A04;
        int i4 = i2 + i;
        if (i4 != 0) {
            i3 = (i * 100) / i4;
        } else {
            i3 = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.A01), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public final Object A02(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.A07.get(obj);
                if (obj2 != null) {
                    this.A03++;
                    return obj2;
                }
                this.A04++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final Object A03(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.A07.remove(obj);
                if (remove != null) {
                    this.A02 -= A00(obj, remove);
                }
            }
            if (remove != null) {
                A07(false, obj, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public C223016j(int i) {
        this(Integer.MAX_VALUE, i, 0);
    }

    private int A00(Object obj, Object obj2) {
        int A01 = A01(obj, obj2);
        if (A01 >= 0) {
            return A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(obj);
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public C223016j(int i, int i2, int i3) {
        if (i > 0) {
            if (i2 > 0) {
                this.A06 = i3;
                this.A01 = i;
                this.A08 = i2;
                this.A07 = new LinkedHashMap(0, 0.75f, true);
                return;
            }
            throw new IllegalArgumentException("maxEntries <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
