package X;

/* loaded from: classes8.dex */
public final class LKi {
    public static final LKi A00 = new Object();

    public static final C6HI A00(InterfaceC99374d7 interfaceC99374d7, C132175xv c132175xv, boolean z) {
        return new C6HI(new C45123Jxs(interfaceC99374d7.B4T(), interfaceC99374d7.BGt(), interfaceC99374d7.Ayf(), interfaceC99374d7.getTitle(), interfaceC99374d7.getUrl(), interfaceC99374d7.BkY()), c132175xv, new C26036BfP(false, false, false, false, false), z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r3.A00(r28) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC132245y2 A03(X.C132175xv r26, com.instagram.common.session.UserSession r27, X.C38321qM r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            r25 = this;
            r7 = 0
            r14 = r28
            boolean r0 = r14.A5M()
            r4 = r26
            r13 = r27
            r8 = r29
            r9 = r30
            r11 = r32
            r16 = r33
            if (r0 == 0) goto L77
            X.1rF r0 = r14.A0C
            java.util.List r0 = r0.AmB()
            if (r0 == 0) goto L77
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()
            X.1qM r0 = (X.C38321qM) r0
            X.5xx r17 = X.InterfaceC132185xw.A00
            r22 = 0
            r18 = r13
            r19 = r0
            r20 = r7
            r21 = r16
            r23 = r22
            r24 = r22
            X.5xw r0 = r17.A00(r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L25
            r2.add(r0)
            goto L25
        L4b:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L77
            X.5Hc r16 = X.AbstractC133095zb.A00(r2)
            r18 = 0
            X.BfP r14 = new X.BfP
            r17 = r14
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r17.<init>(r18, r19, r20, r21, r22)
            r20 = 1
            X.69S r3 = new X.69S
            r12 = r3
            r13 = r4
            r15 = r7
            r17 = r8
            r18 = r9
            r19 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        L77:
            X.5xx r12 = X.InterfaceC132185xw.A00
            X.LFJ r3 = X.LFJ.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327602189056734(0x810fc300053ade, double:3.037060131647728E-306)
            boolean r19 = X.C18U.A06(r2, r13, r0)
            r17 = r34
            r18 = r35
            r15 = r7
            X.5xw r6 = r12.A00(r13, r14, r15, r16, r17, r18, r19)
            if (r6 != 0) goto L93
            r3 = 0
            return r3
        L93:
            if (r31 == 0) goto L9c
            boolean r0 = r3.A00(r14)
            r10 = 1
            if (r0 != 0) goto L9d
        L9c:
            r10 = 0
        L9d:
            r12 = 0
            X.BfP r5 = new X.BfP
            r13 = r5
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            X.5y7 r3 = new X.5y7
            r13 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKi.A03(X.5xv, com.instagram.common.session.UserSession, X.1qM, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.5y2");
    }

    public static final boolean A02(InterfaceC99334d2 interfaceC99334d2) {
        C4d0 BuA;
        Boolean Cbu;
        if (interfaceC99334d2 != null && (BuA = interfaceC99334d2.BuA()) != null && (Cbu = BuA.Cbu()) != null) {
            return Cbu.booleanValue();
        }
        return false;
    }

    public static final boolean A01(C38321qM c38321qM) {
        InterfaceC99384d8 BPK;
        InterfaceC99384d8 BPK2;
        C38321qM BPJ;
        InterfaceC99334d2 A0h;
        InterfaceC99384d8 BPK3;
        Boolean Cfv;
        InterfaceC99334d2 A0h2 = AbstractC43592JPx.A0h(c38321qM);
        if (A0h2 != null && (BPK2 = A0h2.BPK()) != null && (BPJ = BPK2.BPJ()) != null && (A0h = AbstractC43592JPx.A0h(BPJ)) != null && (BPK3 = A0h.BPK()) != null && (Cfv = BPK3.Cfv()) != null) {
            return Cfv.booleanValue();
        }
        InterfaceC99334d2 A0h3 = AbstractC43592JPx.A0h(c38321qM);
        if (A0h3 != null && (BPK = A0h3.BPK()) != null) {
            return AbstractC31177DnL.A1b(BPK.Cfv());
        }
        return false;
    }
}
