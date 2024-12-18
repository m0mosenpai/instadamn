package X;

import android.os.Handler;

/* renamed from: X.OKp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54814OKp {
    public InterfaceC58056Poh A00;
    public final C18500vc A01;
    public final C18500vc A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r4.equals(r1) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(X.OKv r4) {
        /*
            r3 = this;
            boolean r0 = r3.A03
            r2 = 1
            X.0vc r1 = r3.A01
            if (r0 == 0) goto L1c
            boolean r0 = r1.A02
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r1.A01
            X.C14360o3.A0A(r1)
            X.OKv r1 = (X.OKv) r1
        L12:
            boolean r0 = r4.A04
            if (r0 == 0) goto L1b
            boolean r0 = r1.A04
            if (r0 != 0) goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
        L1c:
            java.lang.Object r1 = r1.A01
            X.OKv r1 = (X.OKv) r1
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L1a
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54814OKp.A00(X.OKv):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r1 > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r3 > 0) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0mQ, X.0vc] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mQ, X.0vc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54814OKp(X.InterfaceC58056Poh r8, java.lang.Long r9, java.lang.Long r10, boolean r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.A00 = r8
            r7.A03 = r11
            r0 = 0
            android.os.Handler r6 = X.AbstractC167007dF.A0J()
            X.Ox0 r5 = new X.Ox0
            r5.<init>(r7, r0)
            if (r9 == 0) goto L45
            long r1 = r9.longValue()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L45
        L1d:
            X.0vc r0 = new X.0vc
            r0.<init>(r6, r5, r1)
            r7.A01 = r0
            r0 = 1
            android.os.Handler r6 = X.AbstractC167007dF.A0J()
            X.Ox0 r5 = new X.Ox0
            r5.<init>(r7, r0)
            if (r10 == 0) goto L42
            long r3 = r10.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
        L3a:
            X.0vc r0 = new X.0vc
            r0.<init>(r6, r5, r3)
            r7.A02 = r0
            return
        L42:
            r3 = 200(0xc8, double:9.9E-322)
            goto L3a
        L45:
            r1 = 200(0xc8, double:9.9E-322)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54814OKp.<init>(X.Poh, java.lang.Long, java.lang.Long, boolean):void");
    }

    public final boolean A01(OKv oKv) {
        boolean z = !A00(oKv);
        if (z) {
            this.A01.A01(oKv);
            this.A02.A01(oKv);
        }
        C14360o3.A0B(oKv, 0);
        if (oKv.A03 || oKv.A04) {
            C18500vc c18500vc = this.A01;
            if (c18500vc.A02) {
                Handler handler = c18500vc.A05;
                Runnable runnable = c18500vc.A07;
                handler.removeCallbacks(runnable);
                runnable.run();
            }
            C18500vc c18500vc2 = this.A02;
            if (c18500vc2.A02) {
                Handler handler2 = c18500vc2.A05;
                Runnable runnable2 = c18500vc2.A07;
                handler2.removeCallbacks(runnable2);
                runnable2.run();
            }
        }
        return z;
    }
}
