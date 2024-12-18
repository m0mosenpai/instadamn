package X;

import com.facebook.perf.background.BackgroundStartupDetector;

/* renamed from: X.0ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14630ob implements C0OO, InterfaceC06220Um {
    public final C0LW A00;
    public final C005801x A01;

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    private void A00(C0LE c0le, String str) {
        C0Mq c0Mq = C04770Mv.A00;
        C0M6 c0m6 = C0M6.CRITICAL_REPORT;
        c0Mq.A02(c0le, c0m6, str);
        C024209q c024209q = new C024209q(null);
        C0LW c0lw = this.A00;
        c0lw.A09(c024209q, c0m6, this);
        c0lw.A09(c024209q, C0M6.LARGE_REPORT, this);
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A09;
    }

    @Override // X.InterfaceC06220Um
    public final void D5i(int i, boolean z) {
        String str;
        C10850hu c10850hu = C0LK.A5F;
        int i2 = BackgroundStartupDetector.A0D;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str = "pro_fg";
                    } else {
                        str = "def_fg";
                    }
                } else {
                    str = "pro_bg";
                }
            } else {
                str = "def_bg";
            }
        } else {
            str = "unknown";
        }
        A00(c10850hu, str);
    }

    @Override // X.InterfaceC06220Um
    public final void DN9(Boolean bool) {
        String obj;
        byte b;
        C005801x c005801x = this.A01;
        if (c005801x != null) {
            if (bool != null && bool.booleanValue()) {
                C005801x.A00();
            }
            C07960bG c07960bG = c005801x.A0F;
            if (c07960bG != null) {
                synchronized (c07960bG) {
                    if (bool != null) {
                        b = 2;
                        if (bool.booleanValue()) {
                            b = 1;
                        }
                    } else {
                        b = 0;
                    }
                    C07960bG.A02(c07960bG, C05F.A0D, b);
                }
            }
        }
        C10850hu c10850hu = C0LK.A6B;
        if (bool == null) {
            obj = "unknown";
        } else {
            obj = bool.toString();
        }
        A00(c10850hu, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        if (r2 == 4) goto L12;
     */
    @Override // X.C0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r6 = this;
            java.lang.Class<com.facebook.perf.background.BackgroundStartupDetector> r5 = com.facebook.perf.background.BackgroundStartupDetector.class
            monitor-enter(r5)
            X.0Uj r4 = com.facebook.perf.background.BackgroundStartupDetector.A0B     // Catch: java.lang.Throwable -> L2e
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L2e
            X.0Um r0 = com.facebook.perf.background.BackgroundStartupDetector.A08     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L23
            com.facebook.perf.background.BackgroundStartupDetector.A08 = r6     // Catch: java.lang.Throwable -> L2b
            int r3 = com.facebook.perf.background.BackgroundStartupDetector.A0D     // Catch: java.lang.Throwable -> L2b
            int r2 = com.facebook.perf.background.BackgroundStartupDetector.A0D     // Catch: java.lang.Throwable -> L2b
            r0 = 3
            if (r2 == r0) goto L17
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L18
        L17:
            r0 = 1
        L18:
            r6.D5i(r3, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r0 = com.facebook.perf.background.BackgroundStartupDetector.A0G     // Catch: java.lang.Throwable -> L2b
            r6.DN9(r0)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return
        L23:
            java.lang.String r1 = "Only one reliability listener is supported at this time."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14630ob.start():void");
    }

    public C14630ob(C0LW c0lw, C005801x c005801x) {
        this.A00 = c0lw;
        this.A01 = c005801x;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
