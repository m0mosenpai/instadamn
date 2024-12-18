package X;

/* renamed from: X.1HT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HT {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public final Object[] A03;

    public final synchronized Object A00() {
        Object obj;
        int i = this.A00;
        if (i > 0) {
            Object[] objArr = this.A03;
            int i2 = this.A01;
            obj = objArr[i2];
            objArr[i2] = null;
            this.A01 = (i2 + 1) % objArr.length;
            this.A00 = i - 1;
        } else {
            throw new IllegalStateException("Underflow");
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        throw new java.lang.IndexOutOfBoundsException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList A01() {
        /*
            r6 = this;
            r5 = r6
            monitor-enter(r5)
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r3 = 0
        La:
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L2a
            if (r3 >= r0) goto L26
            if (r0 <= r3) goto L20
            int r0 = r6.A01     // Catch: java.lang.Throwable -> L28
            int r2 = r3 + r0
            java.lang.Object[] r1 = r6.A03     // Catch: java.lang.Throwable -> L28
            int r0 = r1.length     // Catch: java.lang.Throwable -> L28
            int r2 = r2 % r0
            r0 = r1[r2]     // Catch: java.lang.Throwable -> L28
            r4.add(r0)     // Catch: java.lang.Throwable -> L2a
            int r3 = r3 + 1
            goto La
        L20:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            throw r0     // Catch: java.lang.Throwable -> L28
        L26:
            monitor-exit(r5)
            return r4
        L28:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2a
        L2a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1HT.A01():java.util.ArrayList");
    }

    public final synchronized void A02() {
        int i = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        while (true) {
            Object[] objArr = this.A03;
            if (i < objArr.length) {
                objArr[i] = null;
                i++;
            }
        }
    }

    public final synchronized void A03(Object obj) {
        Object[] objArr = this.A03;
        int length = objArr.length;
        if (length != 0) {
            try {
                if (this.A00 == length) {
                    A00();
                }
                int i = this.A00;
                if (i < length) {
                    int i2 = this.A02;
                    objArr[i2] = obj;
                    this.A02 = (i2 + 1) % length;
                    this.A00 = i + 1;
                } else {
                    throw new IllegalStateException("Overflow");
                }
            } catch (Throwable th) {
            }
        }
    }

    public C1HT(int i) {
        this.A03 = new Object[i];
    }
}
