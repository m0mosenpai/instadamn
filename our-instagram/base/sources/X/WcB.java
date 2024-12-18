package X;

/* loaded from: classes11.dex */
public final class WcB implements C4YW {
    public C98014ag A00;
    public final /* synthetic */ C4XU A01;

    public WcB(C4XU c4xu) {
        this.A01 = c4xu;
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPZ(InterfaceC98244b3 interfaceC98244b3, long j, long j2, boolean z) {
        this.A01.A0D((WcC) interfaceC98244b3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0167, code lost:
    
        if (r16 < r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0228, code lost:
    
        if (r22 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022b, code lost:
    
        if (r22 != false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.4b3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.4af] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.4Ap] */
    @Override // X.C4YW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DPd(X.InterfaceC98244b3 r41, long r42, long r44) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WcB.DPd(X.4b3, long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (X.W6R.A02(r1) == false) goto L6;
     */
    @Override // X.C4YW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C98014ag DPf(X.InterfaceC98244b3 r29, java.io.IOException r30, int r31, long r32, long r34) {
        /*
            r28 = this;
            r4 = r29
            X.WcC r4 = (X.WcC) r4
            r6 = r28
            X.4XU r5 = r6.A01
            X.4XU r0 = X.C4XU.$redex_init_class
            r11 = r30
            boolean r0 = r11 instanceof X.C93204Fw
            r2 = 1
            if (r0 == 0) goto L22
            r0 = r11
            X.4Fw r0 = (X.C93204Fw) r0
            java.util.Map r1 = r0.A01
            X.4V3 r0 = r5.A0N
            X.C14360o3.A0B(r0, r2)
            boolean r0 = X.W6R.A02(r1)
            r7 = 1
            if (r0 != 0) goto L23
        L22:
            r7 = 0
        L23:
            boolean r0 = r11 instanceof X.C93194Fv
            if (r0 != 0) goto L28
            r2 = 0
        L28:
            X.4C7 r3 = r4.A02
            X.4b4 r0 = r4.A03
            android.net.Uri r1 = r0.A01
            java.util.Map r0 = r0.A02
            X.4b5 r10 = new X.4b5
            r10.<init>(r1, r3, r0)
            int r13 = r4.A00
            r14 = -1
            r9 = 0
            r15 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.4bW r0 = new X.4bW
            r18 = r0
            r19 = r9
            r20 = r9
            r21 = r13
            r22 = r14
            r23 = r15
            r24 = r16
            r26 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            X.Tvh r4 = new X.Tvh
            r1 = r31
            r4.<init>(r10, r0, r11, r1)
            X.4XX r8 = r5.A0P
            r12 = r9
            r18 = r16
            r20 = r2
            r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            if (r2 == 0) goto L92
            X.4ag r2 = X.C98004af.A05
        L69:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L7c
            X.4XO r0 = r5.A0R
            long r0 = r0.Boy(r4)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L8c
            X.4ag r2 = X.C98004af.A05
        L7c:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            java.lang.Object r0 = r0.first
            X.4ag r0 = (X.C98014ag) r0
            r6.A00 = r0
            return r0
        L8c:
            X.4ag r2 = new X.4ag
            r2.<init>(r15, r0)
            goto L7c
        L92:
            int r0 = r31 + (-1)
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r0 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 + r0
            r0 = 5000(0x1388, double:2.4703E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r2 = (int) r0
            long r0 = (long) r2
            X.4ag r2 = new X.4ag
            r2.<init>(r15, r0)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WcB.DPf(X.4b3, java.io.IOException, int, long, long):X.4ag");
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPv(InterfaceC98244b3 interfaceC98244b3, int i, long j, long j2) {
        WcC wcC = (WcC) interfaceC98244b3;
        C4XU c4xu = this.A01;
        if (c4xu.A0V) {
            C4C7 c4c7 = wcC.A02;
            C98254b4 c98254b4 = wcC.A03;
            C98264b5 c98264b5 = new C98264b5(c98254b4.A01, c4c7, c98254b4.A02);
            if (i > 0) {
                c4xu.A0P.A02(null, c98264b5, null, wcC.A00, -1, 0, i, -9223372036854775807L, -9223372036854775807L);
            }
        }
    }
}
