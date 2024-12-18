package X;

/* loaded from: classes4.dex */
public final class AZN implements InterfaceC179077xJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C178907x2 A06;
    public C179427xs A07;
    public C179427xs A08;
    public C179427xs A09;
    public InterfaceC179037xF A0A;
    public InterfaceC179037xF A0B;
    public InterfaceC179037xF A0C;
    public InterfaceC179037xF A0D;
    public boolean A0E;
    public final C179107xM A0F;
    public final C178747wm A0G;
    public final C199478ro A0H;
    public final InterfaceC179077xJ A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final C199468rn A0L;
    public final InterfaceC179077xJ A0M;
    public final InterfaceC179077xJ[] A0N;

    public AZN(C199468rn c199468rn, C179107xM c179107xM, C178747wm c178747wm, InterfaceC179077xJ interfaceC179077xJ, InterfaceC179077xJ interfaceC179077xJ2, boolean z, boolean z2) {
        this.A0M = interfaceC179077xJ;
        this.A0F = c179107xM;
        this.A0I = interfaceC179077xJ2;
        this.A0G = c178747wm;
        this.A0J = z;
        this.A0K = z2;
        this.A0L = c199468rn;
        C199478ro c199478ro = new C199478ro(c178747wm);
        this.A0H = c199478ro;
        this.A0N = (InterfaceC179077xJ[]) AbstractC009903n.A0I(new InterfaceC179077xJ[]{interfaceC179077xJ, c179107xM, interfaceC179077xJ2, c199478ro}).toArray(new InterfaceC179077xJ[0]);
        this.A0E = true;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        C14360o3.A0B(interfaceC180227zC, 0);
        this.A0E = true;
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0N) {
            interfaceC179077xJ.ACv(interfaceC180227zC);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        this.A06 = c178907x2;
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0N) {
            interfaceC179077xJ.CNk(c178907x2);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        return interfaceC179467xw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x011e, code lost:
    
        if (r1 != null) goto L60;
     */
    @Override // X.InterfaceC179077xJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EGd(X.InterfaceC179037xF r8, java.lang.Long r9) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZN.EGd(X.7xF, java.lang.Long):void");
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        C14360o3.A0B(obj, 1);
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0N) {
            interfaceC179077xJ.FDL(i, obj);
        }
    }

    private final C179427xs A00() {
        return new C179427xs(this.A0G, new C179387xo(), new C179417xr(), true);
    }

    private final void A01(Long l) {
        String str;
        C179427xs c179427xs = this.A09;
        if (c179427xs != null) {
            c179427xs.A03(this.A01, this.A00, 0);
            InterfaceC179077xJ interfaceC179077xJ = this.A0M;
            InterfaceC179037xF interfaceC179037xF = this.A0D;
            if (interfaceC179037xF != null) {
                interfaceC179077xJ.EGd(interfaceC179037xF, l);
                return;
            }
            str = "preprocessIo";
        } else {
            str = "preprocessFramebuffer";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final boolean A02() {
        if (this.A03 < this.A01 && this.A02 < this.A00) {
            return true;
        }
        return false;
    }

    public final C179427xs A03() {
        C179427xs c179427xs = this.A08;
        if (c179427xs != null) {
            return c179427xs;
        }
        C14360o3.A0F("intermediateFramebuffer");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        int i = 0;
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0N) {
            i |= interfaceC179077xJ.AlT();
        }
        return i;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0N) {
            if (interfaceC179077xJ.CLu()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @Override // X.InterfaceC179077xJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBm(int r17, int r18, int r19, boolean r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            boolean r2 = r0.A02()
            r6 = r18
            r0.A03 = r6
            r7 = r19
            r0.A02 = r7
            r14 = r21
            r0.A05 = r14
            r15 = r22
            r0.A04 = r15
            r4 = r14
            r10 = r15
            float r3 = (float) r6
            float r1 = (float) r7
            float r3 = r3 / r1
            float r1 = (float) r14
            float r1 = r1 / r3
            int r1 = (int) r1
            if (r1 > r15) goto L8f
            r10 = r1
        L21:
            int[] r3 = new int[]{r4, r10}
            r1 = 0
            r9 = r3[r1]
            r0.A01 = r9
            r0.A00 = r10
            boolean r4 = r0.A0K
            boolean r3 = r0.A02()
            r5 = r17
            r8 = r20
            if (r4 != 0) goto L67
            if (r3 == 0) goto L7d
            X.7xJ r4 = r0.A0M
            r4.FBm(r5, r6, r7, r8, r9, r10)
            X.7xM r4 = r0.A0F
            if (r4 == 0) goto L4c
            int r6 = r0.A01
            int r7 = r0.A00
            r9 = r6
            r10 = r7
            r4.FBm(r5, r6, r7, r8, r9, r10)
        L4c:
            X.7xJ r9 = r0.A0I
            if (r9 == 0) goto L59
            int r11 = r0.A01
            int r12 = r0.A00
            r10 = r5
        L55:
            r13 = r8
            r9.FBm(r10, r11, r12, r13, r14, r15)
        L59:
            boolean r3 = r0.A0E
            if (r3 != 0) goto L63
            boolean r3 = r0.A02()
            if (r2 == r3) goto L64
        L63:
            r1 = 1
        L64:
            r0.A0E = r1
            return
        L67:
            if (r3 == 0) goto L7d
            X.7xM r3 = r0.A0F
            if (r3 == 0) goto L73
            r4 = r3
            r9 = r6
            r10 = r7
            r4.FBm(r5, r6, r7, r8, r9, r10)
        L73:
            X.7xJ r4 = r0.A0M
            int r9 = r0.A01
            int r10 = r0.A00
            r4.FBm(r5, r6, r7, r8, r9, r10)
            goto L4c
        L7d:
            X.7xM r3 = r0.A0F
            if (r3 == 0) goto L87
            r4 = r3
            r9 = r6
            r10 = r7
            r4.FBm(r5, r6, r7, r8, r9, r10)
        L87:
            X.7xJ r9 = r0.A0I
            if (r9 == 0) goto L59
            r10 = r5
            r11 = r6
            r12 = r7
            goto L55
        L8f:
            float r1 = (float) r15
            float r1 = r1 * r3
            int r4 = (int) r1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZN.FBm(int, int, int, boolean, int, int):void");
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0N) {
            interfaceC179077xJ.detach();
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0N) {
            interfaceC179077xJ.release();
        }
    }
}
