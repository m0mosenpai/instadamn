package X;

/* renamed from: X.4VP, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4VP implements C4VQ {
    public final C96604Vv A00 = new C96604Vv();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r16 < r7.A02()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(int r16, long r17) {
        /*
            r15 = this;
            r9 = r15
            boolean r0 = r15 instanceof X.C4VO
            r10 = r16
            r13 = r17
            if (r0 == 0) goto Lc0
            r3 = r9
            X.4VO r3 = (X.C4VO) r3
            X.4WW r0 = r3.A0B
            com.google.android.exoplayer2.Timeline r7 = r0.A03
            if (r16 < 0) goto Lba
            int r0 = r7.A02()
            r1 = 0
            if (r0 != 0) goto Lb2
            r1 = 1
        L1a:
            r2 = 1
            r3.A0K = r2
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            boolean r0 = r3.CaX()
            r6 = 0
            if (r0 == 0) goto L46
            r0 = 3600(0xe10, float:5.045E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            r0 = 5266(0x1492, float:7.379E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            android.util.Log.w(r1, r0)
            android.os.Handler r4 = r3.A0O
            r1 = -1
            X.4WW r0 = r3.A0B
            android.os.Message r0 = r4.obtainMessage(r6, r2, r1, r0)
            r0.sendToTarget()
        L45:
            return
        L46:
            r3.A01 = r10
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 == 0) goto L88
            if (r0 != 0) goto L86
            r0 = 0
        L55:
            r3.A06 = r0
        L57:
            r3.A00 = r6
            X.4Wa r4 = r3.A0R
            java.util.UUID r0 = X.C4YL.A04
            long r0 = com.google.android.exoplayer2.util.Util.A07(r13)
            X.4Wm r5 = r4.A0g
            X.4ZA r4 = new X.4ZA
            r4.<init>(r7, r10, r0)
            r0 = 3
            X.4Wt r0 = r5.Ctn(r4, r0)
            r0.A01()
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A0b
            java.util.Iterator r1 = r0.iterator()
        L76:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r1.next()
            X.4W9 r0 = (X.C4W9) r0
            r0.DZn(r2)
            goto L76
        L86:
            r0 = r13
            goto L55
        L88:
            if (r0 != 0) goto Lab
            X.4Vv r4 = r3.A00
            r0 = 0
            X.4Vv r0 = r7.A0E(r4, r10, r0)
            long r11 = r0.A02
        L94:
            X.4Vv r9 = r3.A00
            X.4WJ r8 = r3.A0U
            android.util.Pair r4 = r7.A09(r8, r9, r10, r11)
            java.util.UUID r0 = X.C4YL.A04
            long r0 = com.google.android.exoplayer2.util.Util.A08(r11)
            r3.A06 = r0
            java.lang.Object r0 = r4.first
            int r6 = r7.A06(r0)
            goto L57
        Lab:
            java.util.UUID r0 = X.C4YL.A04
            long r11 = com.google.android.exoplayer2.util.Util.A07(r13)
            goto L94
        Lb2:
            int r0 = r7.A02()
            if (r10 >= r0) goto Lba
            goto L1a
        Lba:
            X.VII r0 = new X.VII
            r0.<init>(r7)
            throw r0
        Lc0:
            r11 = 10
            r12 = 0
            r9.A0K(r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4VP.A0J(int, long):void");
    }

    public void A0K(int i, int i2, boolean z, long j) {
    }
}
