package X;

import java.util.Map;

/* renamed from: X.T2z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64190T2z implements InterfaceC65507Tlc {
    public SE2 A00;
    public SPN A01;
    public final C2GS A02;
    public final C63345Si1 A03;
    public final C58443PvM A04;
    public final Object A05;
    public final String A06;
    public final Map A07;
    public final C58770Q8c A08;

    @Override // X.InterfaceC65507Tlc
    public final void CyK(SGB sgb) {
        C14360o3.A0B(sgb, 0);
        C63152Se0 c63152Se0 = sgb.A01;
        if (c63152Se0 != null) {
            String str = c63152Se0.A03;
            SPN spn = this.A01;
            if (spn != null) {
                if (!C14360o3.A0K(str, spn.A00)) {
                    throw AbstractC166987dD.A14("Auth Ticket type and current in progress auth factor can not be different.");
                }
            }
            C14360o3.A0F("inProgressAuthFactor");
            throw C00O.createAndThrow();
        }
        Map map = this.A07;
        SPN spn2 = this.A01;
        if (spn2 != null) {
            map.put(spn2, sgb);
            A00(sgb);
            return;
        }
        C14360o3.A0F("inProgressAuthFactor");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r1.A00 == 10) goto L11;
     */
    @Override // X.InterfaceC65507Tlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CyJ(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r2 = r5 instanceof X.C64864TXp
            if (r2 == 0) goto Ld
            r0 = r5
            X.TXp r0 = (X.C64864TXp) r0
            int r1 = r0.A00
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L36
        Ld:
            boolean r0 = r5 instanceof X.C64852TXc
            r3 = 0
            if (r0 != 0) goto L21
            if (r2 == 0) goto L37
            r1 = r5
            X.TXp r1 = (X.C64864TXp) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r1 = r1.A00
            r0 = 10
            if (r1 != r0) goto L37
        L21:
            X.Q8c r0 = r4.A08
            r0.A01()
            X.2GS r1 = r4.A02
            if (r5 == 0) goto L42
            X.TXc r0 = new X.TXc
            r0.<init>(r5)
            X.Sjd r0 = X.C63406Sjd.A05(r3, r0)
        L33:
            r1.A0A(r0)
        L36:
            return
        L37:
            boolean r0 = r5 instanceof X.REY
            if (r0 == 0) goto L47
            X.2GS r1 = r4.A02
            X.Sjd r0 = X.C63406Sjd.A05(r3, r5)
            goto L33
        L42:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L47:
            X.SPN r2 = r4.A01
            java.lang.String r0 = "inProgressAuthFactor"
            if (r2 != 0) goto L55
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L55:
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "BIO"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L64
            java.util.Map r0 = r4.A07
            r0.remove(r2)
        L64:
            r4.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64190T2z.CyJ(java.lang.Throwable):void");
    }

    public C64190T2z(C2GS c2gs, C58770Q8c c58770Q8c, C63345Si1 c63345Si1, C58443PvM c58443PvM, Object obj, String str) {
        AbstractC167017dG.A1R(c58443PvM, c58770Q8c);
        C14360o3.A0B(obj, 6);
        this.A03 = c63345Si1;
        this.A04 = c58443PvM;
        this.A08 = c58770Q8c;
        this.A02 = c2gs;
        this.A06 = str;
        this.A05 = obj;
        this.A07 = AbstractC166987dD.A1I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        X.C14360o3.A0F(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.SGB r14) {
        /*
            r13 = this;
            java.util.LinkedHashSet r12 = X.AbstractC31171DnF.A0l()
            java.util.Map r4 = r13.A07
            java.util.Iterator r3 = X.AbstractC43593JPy.A12(r4)
        La:
            boolean r0 = r3.hasNext()
            r5 = 1
            if (r0 == 0) goto L25
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.SPN r0 = (X.SPN) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "BIO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto La
            r6 = 1
            if (r2 != 0) goto L26
        L25:
            r6 = 0
        L26:
            java.util.Iterator r4 = X.AbstractC166997dE.A15(r4)
        L2a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4d
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r4)
            java.lang.Object r3 = r0.getKey()
            X.SPN r3 = (X.SPN) r3
            java.lang.Object r2 = r0.getValue()
            X.SGB r2 = (X.SGB) r2
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lb3
            if (r6 == 0) goto Lb3
            goto L2a
        L4d:
            X.T3c r2 = new X.T3c
            r2.<init>(r5, r14, r13)
            java.lang.String r5 = r13.A06
            java.lang.Object r4 = r13.A05
            X.SE2 r0 = r13.A00
            java.lang.String r3 = "inProgressAuthObject"
            r9 = 0
            if (r0 == 0) goto Lcb
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_ACCOUNT_ID"
            java.lang.String r6 = r1.getString(r0)
            X.SE2 r0 = r13.A00
            if (r0 == 0) goto Lcb
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_OTC_SESSION_ID"
            java.lang.String r7 = r1.getString(r0)
            X.SE2 r0 = r13.A00
            if (r0 == 0) goto Lcb
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_OTC_TYPE"
            java.lang.String r8 = r1.getString(r0)
            X.SE2 r0 = r13.A00
            if (r0 == 0) goto Lcb
            android.os.Bundle r0 = r0.A01
            java.util.Map r11 = X.SSA.A01(r0)
            X.C14360o3.A07(r11)
            X.T3Z r3 = X.AbstractC63063Sbk.A00(r2, r12)
            X.SXG r2 = new X.SXG
            r10 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.PvM r1 = r13.A04
            X.SeZ r0 = X.C2FP.A04()
            X.C14360o3.A07(r0)
            X.REi r0 = X.AbstractC63245Sfz.A03(r0, r1, r2)
            X.AbstractC63144Sdq.A02(r0)
            X.Q8J r1 = r0.A03
            X.C14360o3.A07(r1)
            r0 = 55
            X.Sqa r0 = X.C63628Sqa.A00(r13, r0)
            X.AbstractC63246Sg0.A01(r9, r1, r0)
            return
        Lb3:
            if (r2 != 0) goto Ld3
            X.Si1 r1 = r13.A03
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>(r5)
            r6.add(r3)
            X.2GS r2 = r13.A02
            java.lang.String r5 = r13.A06
            java.lang.Object r4 = r13.A05
            X.SE2 r3 = r13.A00
            if (r3 != 0) goto Ldc
            java.lang.String r3 = "inProgressAuthObject"
        Lcb:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Ld3:
            X.Se0 r0 = r2.A01
            if (r0 == 0) goto L2a
            r12.add(r0)
            goto L2a
        Ldc:
            r1.A06(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64190T2z.A00(X.SGB):void");
    }
}
