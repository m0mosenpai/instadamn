package X;

/* renamed from: X.5BM, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5BM {
    public final C57S A00 = new C57S(new C5BN[16]);

    public final void A01() {
        int i = 0;
        while (true) {
            C57S c57s = this.A00;
            if (i < c57s.A00) {
                C5BN c5bn = (C5BN) c57s.A02[i];
                if (!c5bn.A06.A08) {
                    c5bn.A00();
                    c57s.A00(i);
                } else {
                    i++;
                    c5bn.A01();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void A00() {
        if (this instanceof C5BN) {
            C5BN c5bn = (C5BN) this;
            C57S c57s = ((C5BM) c5bn).A00;
            int i = c57s.A00;
            if (i > 0) {
                Object[] objArr = c57s.A02;
                int i2 = 0;
                do {
                    ((C5BM) objArr[i2]).A00();
                    i2++;
                } while (i2 < i);
            }
            C5AY c5ay = c5bn.A06;
            ?? r3 = 0;
            while (c5ay != 0) {
                if (c5ay instanceof C5DX) {
                    ((C5DX) c5ay).E0S();
                } else if ((c5ay.A01 & 16) != 0 && (c5ay instanceof C5AY)) {
                    C58J c58j = c5ay.A00;
                    int i3 = 0;
                    r3 = r3;
                    c5ay = c5ay;
                    while (c58j != null) {
                        if ((c58j.A01 & 16) != 0) {
                            i3++;
                            r3 = r3;
                            if (i3 == 1) {
                                c5ay = c58j;
                            } else {
                                if (r3 == 0) {
                                    r3 = new C57S(new C58J[16]);
                                }
                                if (c5ay != 0) {
                                    r3.A09(c5ay);
                                    c5ay = 0;
                                }
                                r3.A09(c58j);
                            }
                        }
                        c58j = c58j.A02;
                        r3 = r3;
                        c5ay = c5ay;
                    }
                    if (i3 == 1) {
                    }
                }
                c5ay = AbstractC114335Dx.A00(r3);
            }
            return;
        }
        C57S c57s2 = this.A00;
        int i4 = c57s2.A00;
        if (i4 > 0) {
            int i5 = 0;
            Object[] objArr2 = c57s2.A02;
            do {
                ((C5BM) objArr2[i5]).A00();
                i5++;
            } while (i5 < i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r3 >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C18620vp r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C5BN
            if (r0 == 0) goto L4b
            r4 = r7
            X.5BN r4 = (X.C5BN) r4
            X.Pw0 r5 = r4.A07
            int r6 = r5.A00
            r3 = 0
        Lc:
            if (r3 >= r6) goto L27
            long[] r0 = r5.A01
            r1 = r0[r3]
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L48
            r3 = 0
            java.lang.Object[] r2 = r8.A01
            int r1 = r8.A00
        L1b:
            if (r3 >= r1) goto L3f
            r0 = r2[r3]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3c
            if (r3 < 0) goto L3f
        L27:
            X.57S r0 = r4.A00
        L29:
            int r3 = r0.A00
            if (r3 <= 0) goto L3b
            r2 = 0
            java.lang.Object[] r1 = r0.A02
        L30:
            r0 = r1[r2]
            X.5BM r0 = (X.C5BM) r0
            r0.A02(r8, r9)
            int r2 = r2 + 1
            if (r2 < r3) goto L30
        L3b:
            return
        L3c:
            int r3 = r3 + 1
            goto L1b
        L3f:
            r5.A01(r9)
            X.01a r0 = r4.A05
            r0.A08(r9)
            goto L27
        L48:
            int r3 = r3 + 1
            goto Lc
        L4b:
            X.57S r0 = r7.A00
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5BM.A02(X.0vp, long):void");
    }

    public void A03(C25256BFu c25256BFu) {
        C57S c57s = this.A00;
        int i = c57s.A00;
        while (true) {
            i--;
            if (-1 < i) {
                if (((C5BN) c57s.A02[i]).A07.A00 == 0) {
                    c57s.A00(i);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A04(X.C003501a r6, X.C25256BFu r7, X.InterfaceC1131459c r8, boolean r9) {
        /*
            r5 = this;
            X.57S r0 = r5.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto L1d
            java.lang.Object[] r3 = r0.A02
            r2 = 0
        La:
            r0 = r3[r2]
            X.5BM r0 = (X.C5BM) r0
            boolean r0 = r0.A04(r6, r7, r8, r9)
            if (r0 != 0) goto L18
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L19
        L18:
            r1 = 1
        L19:
            int r2 = r2 + 1
            if (r2 < r4) goto La
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5BM.A04(X.01a, X.BFu, X.59c, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0102, code lost:
    
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.58J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(X.C003501a r17, X.C25256BFu r18, X.InterfaceC1131459c r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5BM.A05(X.01a, X.BFu, X.59c, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [X.58J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(X.C25256BFu r17) {
        /*
            r16 = this;
            r6 = r16
            boolean r0 = r6 instanceof X.C5BN
            r5 = r17
            if (r0 == 0) goto L98
            r9 = r6
            X.5BN r9 = (X.C5BN) r9
            X.01a r8 = r9.A05
            int r0 = r8.A00()
            if (r0 == 0) goto L96
            r1 = 1
            r7 = 0
            X.58J r14 = r9.A06
            boolean r0 = r14.A08
            if (r0 == 0) goto L96
            X.6KW r13 = r9.A00
            X.C14360o3.A0A(r13)
            X.59c r0 = r9.A01
            X.C14360o3.A0A(r0)
            long r2 = r0.Bxd()
            r12 = r14
            r11 = 16
            r15 = 0
            r10 = r15
        L2e:
            boolean r0 = r12 instanceof X.C5DX
            if (r0 == 0) goto L60
            X.5DX r12 = (X.C5DX) r12
            X.BJd r0 = X.EnumC25334BJd.Final
            r12.DZQ(r13, r0, r2)
        L39:
            X.58J r12 = X.AbstractC114335Dx.A00(r10)
        L3d:
            if (r12 != 0) goto L2e
            boolean r0 = r14.A08
            if (r0 == 0) goto L56
            X.57S r0 = r9.A00
            int r3 = r0.A00
            if (r3 <= 0) goto L56
            java.lang.Object[] r2 = r0.A02
        L4b:
            r0 = r2[r7]
            X.5BM r0 = (X.C5BM) r0
            r0.A06(r5)
            int r7 = r7 + 1
            if (r7 < r3) goto L4b
        L56:
            r9.A03(r5)
            r8.A07()
            r0 = 0
            r9.A01 = r0
            return r1
        L60:
            int r0 = r12.A01
            r0 = r0 & 16
            if (r0 == 0) goto L39
            boolean r0 = r12 instanceof X.C5AY
            if (r0 == 0) goto L39
            r0 = r12
            X.5AY r0 = (X.C5AY) r0
            X.58J r6 = r0.A00
            r4 = 0
        L70:
            if (r6 == 0) goto L93
            int r0 = r6.A01
            r0 = r0 & 16
            if (r0 == 0) goto L7d
            int r4 = r4 + 1
            if (r4 != r1) goto L80
            r12 = r6
        L7d:
            X.58J r6 = r6.A02
            goto L70
        L80:
            if (r10 != 0) goto L89
            X.58J[] r0 = new X.C58J[r11]
            X.57S r10 = new X.57S
            r10.<init>(r0)
        L89:
            if (r12 == 0) goto L8f
            r10.A09(r12)
            r12 = r15
        L8f:
            r10.A09(r6)
            goto L7d
        L93:
            if (r4 != r1) goto L39
            goto L3d
        L96:
            r1 = 0
            goto L56
        L98:
            X.57S r0 = r6.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto Lb5
            java.lang.Object[] r3 = r0.A02
            r2 = 0
        La2:
            r0 = r3[r2]
            X.5BM r0 = (X.C5BM) r0
            boolean r0 = r0.A06(r5)
            if (r0 != 0) goto Lb0
            r0 = r1
            r1 = 0
            if (r0 == 0) goto Lb1
        Lb0:
            r1 = 1
        Lb1:
            int r2 = r2 + 1
            if (r2 < r4) goto La2
        Lb5:
            r6.A03(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5BM.A06(X.BFu):boolean");
    }
}
