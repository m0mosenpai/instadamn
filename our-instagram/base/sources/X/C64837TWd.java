package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.TWd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64837TWd implements InterfaceC65679Tr9 {
    public boolean A00;
    public boolean A01;
    public final TWX A02 = new Object();
    public final /* synthetic */ C63029Sb0 A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TWX, java.lang.Object] */
    public C64837TWd(C63029Sb0 c63029Sb0) {
        this.A03 = c63029Sb0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        throw X.MSW.A0y("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
    
        r11 = (int) java.lang.Math.min(r4, r2);
        r12 = r8.A0J;
        r11 = java.lang.Math.min(r11, r12.A00);
        r0 = r11;
        r8.A03 = r2 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0047, code lost:
    
        if (r4 != r7.A00) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(boolean r16) {
        /*
            r15 = this;
            X.Sb0 r9 = r15.A03
            monitor-enter(r9)
            X.Teh r6 = r9.A0B     // Catch: java.lang.Throwable -> Lb7
            r6.A08()     // Catch: java.lang.Throwable -> Lb7
        L8:
            long r1 = r9.A00     // Catch: java.lang.Throwable -> Lb2
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L29
            boolean r0 = r15.A01     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L29
            boolean r0 = r15.A00     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L29
            java.lang.Integer r0 = r9.A03     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L29
            r9.wait()     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> Lb2
            goto L8
        L20:
            X.AbstractC58318PtA.A18()     // Catch: java.lang.Throwable -> Lb2
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lb2
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        L29:
            r6.A0B()     // Catch: java.lang.Throwable -> Lb7
            r9.A03()     // Catch: java.lang.Throwable -> Lb7
            long r0 = r9.A00     // Catch: java.lang.Throwable -> Lb7
            X.TWX r7 = r15.A02     // Catch: java.lang.Throwable -> Lb7
            long r2 = r7.A00     // Catch: java.lang.Throwable -> Lb7
            long r4 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> Lb7
            long r0 = r0 - r4
            r9.A00 = r0     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb7
            r6.A08()
            if (r16 == 0) goto L49
            long r0 = r7.A00     // Catch: java.lang.Throwable -> Lad
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r10 = 1
            if (r2 == 0) goto L4a
        L49:
            r10 = 0
        L4a:
            X.THU r8 = r9.A07     // Catch: java.lang.Throwable -> Lad
            int r9 = r9.A05     // Catch: java.lang.Throwable -> Lad
            r1 = 0
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L5b
            X.THS r0 = r8.A0J     // Catch: java.lang.Throwable -> Lad
            r0.A04(r7, r9, r1, r10)     // Catch: java.lang.Throwable -> Lad
            goto La9
        L5b:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto La9
            monitor-enter(r8)     // Catch: java.lang.Throwable -> Lad
        L60:
            long r2 = r8.A03     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La6
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 > 0) goto L76
            java.util.Map r1 = r8.A0E     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La6
            boolean r0 = r1.containsKey(r0)     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La6
            if (r0 == 0) goto L95
            r8.wait()     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La6
            goto L60
        L76:
            long r0 = java.lang.Math.min(r4, r2)     // Catch: java.lang.Throwable -> La6
            int r11 = (int) r0     // Catch: java.lang.Throwable -> La6
            X.THS r12 = r8.A0J     // Catch: java.lang.Throwable -> La6
            int r0 = r12.A00     // Catch: java.lang.Throwable -> La6
            int r11 = java.lang.Math.min(r11, r0)     // Catch: java.lang.Throwable -> La6
            long r0 = (long) r11     // Catch: java.lang.Throwable -> La6
            long r2 = r2 - r0
            r8.A03 = r2     // Catch: java.lang.Throwable -> La6
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La6
            long r4 = r4 - r0
            if (r10 == 0) goto L90
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L91
        L90:
            r0 = 0
        L91:
            r12.A04(r7, r9, r11, r0)     // Catch: java.lang.Throwable -> Lad
            goto L5b
        L95:
            java.lang.String r0 = "stream closed"
            java.io.IOException r0 = X.MSW.A0y(r0)     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La6
        L9d:
            X.AbstractC58318PtA.A18()     // Catch: java.lang.Throwable -> La6
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.Throwable -> Lad
        La9:
            r6.A0B()
            return
        Lad:
            r0 = move-exception
            r6.A0B()
            throw r0
        Lb2:
            r0 = move-exception
            r6.A0B()     // Catch: java.lang.Throwable -> Lb7
            throw r0     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64837TWd.A00(boolean):void");
    }

    @Override // X.InterfaceC65679Tr9
    public final C63030Sb2 Eq9() {
        return this.A03.A0B;
    }

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        TWX twx2 = this.A02;
        twx2.FEM(twx, j);
        while (twx2.A00 >= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED) {
            A00(false);
        }
    }

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        C63029Sb0 c63029Sb0 = this.A03;
        synchronized (c63029Sb0) {
            if (this.A00) {
                return;
            }
            if (!c63029Sb0.A08.A01) {
                TWX twx = this.A02;
                if (twx.A00 <= 0) {
                    THU thu = c63029Sb0.A07;
                    thu.A0J.A04(null, c63029Sb0.A05, 0, true);
                } else {
                    while (twx.A00 > 0) {
                        A00(true);
                    }
                }
            }
            synchronized (c63029Sb0) {
                this.A00 = true;
            }
            c63029Sb0.A07.A0J.A00();
            c63029Sb0.A02();
        }
    }

    @Override // X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
        C63029Sb0 c63029Sb0 = this.A03;
        synchronized (c63029Sb0) {
            c63029Sb0.A03();
        }
        while (this.A02.A00 > 0) {
            A00(false);
            c63029Sb0.A07.A0J.A00();
        }
    }
}
