package X;

/* renamed from: X.01c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C003701c {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final C005401t A06;
    public final C005501u A07;

    public int A01(Object obj, Object obj2) {
        return 1;
    }

    public final Object A02(Object obj) {
        C14360o3.A0B(obj, 0);
        synchronized (this.A06) {
            Object obj2 = this.A07.A00.get(obj);
            if (obj2 != null) {
                this.A01++;
                return obj2;
            }
            this.A03++;
            return null;
        }
    }

    public final Object A03(Object obj) {
        Object remove;
        C14360o3.A0B(obj, 0);
        synchronized (this.A06) {
            remove = this.A07.A00.remove(obj);
            if (remove != null) {
                this.A05 -= A00(obj, remove);
            }
        }
        if (remove != null) {
            A06(false, obj, remove, null);
        }
        return remove;
    }

    public final void A05(Object obj, Object obj2) {
        Object put;
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        synchronized (this.A06) {
            this.A04++;
            this.A05 += A00(obj, obj2);
            put = this.A07.A00.put(obj, obj2);
            if (put != null) {
                this.A05 -= A00(obj, put);
            }
        }
        if (put != null) {
            A06(false, obj, put, obj2);
        }
        A04(this.A02);
    }

    public void A06(boolean z, Object obj, Object obj2, Object obj3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(int r7) {
        /*
            r6 = this;
        L0:
            X.01t r4 = r6.A06
            monitor-enter(r4)
            int r2 = r6.A05     // Catch: java.lang.Throwable -> L59
            r5 = 1
            if (r2 < 0) goto L51
            X.01u r0 = r6.A07     // Catch: java.lang.Throwable -> L59
            java.util.LinkedHashMap r1 = r0.A00     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L14
            if (r2 != 0) goto L51
        L14:
            if (r2 <= r7) goto L4f
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L4f
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L59
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = X.AbstractC001800i.A0A(r0)     // Catch: java.lang.Throwable -> L59
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L4f
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L59
            r0 = 0
            X.C14360o3.A0B(r3, r0)     // Catch: java.lang.Throwable -> L59
            r1.remove(r3)     // Catch: java.lang.Throwable -> L59
            int r1 = r6.A05     // Catch: java.lang.Throwable -> L59
            int r0 = r6.A00(r3, r2)     // Catch: java.lang.Throwable -> L59
            int r1 = r1 - r0
            r6.A05 = r1     // Catch: java.lang.Throwable -> L59
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L59
            int r0 = r0 + 1
            r6.A00 = r0     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            r0 = 0
            r6.A06(r5, r3, r2, r0)
            goto L0
        L4f:
            monitor-exit(r4)
            return
        L51:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L59:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003701c.A04(int):void");
    }

    public final String toString() {
        int i;
        String obj;
        synchronized (this.A06) {
            int i2 = this.A01;
            int i3 = this.A03;
            int i4 = i3 + i2;
            if (i4 != 0) {
                i = (i2 * 100) / i4;
            } else {
                i = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("LruCache[maxSize=");
            sb.append(this.A02);
            sb.append(",hits=");
            sb.append(i2);
            sb.append(",misses=");
            sb.append(i3);
            sb.append(",hitRate=");
            sb.append(i);
            sb.append("%]");
            obj = sb.toString();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01t, java.lang.Object] */
    public C003701c(int i) {
        this.A02 = i;
        if (i > 0) {
            this.A07 = new C005501u(0);
            this.A06 = new Object();
        } else {
            AbstractC005601v.A00("maxSize <= 0");
            throw C00O.createAndThrow();
        }
    }

    private final int A00(Object obj, Object obj2) {
        int A01 = A01(obj, obj2);
        if (A01 >= 0) {
            return A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(obj);
        sb.append('=');
        sb.append(obj2);
        String obj3 = sb.toString();
        C14360o3.A0B(obj3, 0);
        throw new IllegalStateException(obj3);
    }
}
