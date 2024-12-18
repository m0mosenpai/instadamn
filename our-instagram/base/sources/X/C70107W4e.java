package X;

/* renamed from: X.W4e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70107W4e {
    public boolean A05;
    public final boolean A06;
    public final /* synthetic */ AbstractC71188Wpa A07;
    public long A01 = -1;
    public long A03 = -1;
    public long A00 = -1;
    public long A02 = -1;
    public long A04 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r7 <= r2) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A01(long r7, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r2 = r6.A01     // Catch: java.lang.Throwable -> L18
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto Le
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L11
        Le:
            r0 = 1
            r6.A02 = r9     // Catch: java.lang.Throwable -> L18
        L11:
            r6.A03 = r7     // Catch: java.lang.Throwable -> L18
            A00(r6)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r6)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70107W4e.A01(long, long):boolean");
    }

    public C70107W4e(AbstractC71188Wpa abstractC71188Wpa, boolean z) {
        this.A07 = abstractC71188Wpa;
        this.A06 = z;
    }

    public static void A00(C70107W4e c70107W4e) {
        if (!c70107W4e.A05) {
            long j = c70107W4e.A00;
            if (j < 0) {
                long j2 = c70107W4e.A01;
                if (j2 >= 0 && c70107W4e.A03 >= j2) {
                    j = c70107W4e.A02;
                    if (j >= 0) {
                        c70107W4e.A00 = j;
                    }
                    c70107W4e.A07.A0N.post(new RunnableC71222WqD(c70107W4e));
                    c70107W4e.A05 = true;
                }
            }
            if (j < 0 || j > c70107W4e.A04) {
                return;
            }
            c70107W4e.A07.A0N.post(new RunnableC71222WqD(c70107W4e));
            c70107W4e.A05 = true;
        }
    }
}
