package com.instagram.creator.agent.settings.facts.viewmodel;

import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C26045BfY;
import X.C3r5;
import X.C45116Jxl;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;

/* loaded from: classes5.dex */
public final class AddFactUseCase extends C3r5 {
    public C45116Jxl A00;
    public String A01;
    public String A02;
    public final C26045BfY A03;
    public final C05A A04;
    public final C0UO A05;
    public final FactsRepository A06;
    public static final C26045BfY A0A = new C26045BfY(null, null, null, Integer.MAX_VALUE, 2131957088, false, false, false);
    public static final C26045BfY A09 = new C26045BfY(null, 2131957121, null, Integer.MAX_VALUE, 2131957034, true, true, false);
    public static final C26045BfY A08 = new C26045BfY(null, 2131957026, 2131957019, 1, 2131957020, true, true, false);
    public static final C26045BfY A07 = new C26045BfY(null, 2131957122, 2131957090, Integer.MAX_VALUE, 2131957091, true, false, false);

    public AddFactUseCase(FactsRepository factsRepository, C26045BfY c26045BfY) {
        C14360o3.A0B(c26045BfY, 2);
        this.A06 = factsRepository;
        this.A03 = c26045BfY;
        C008002u A1H = AbstractC25225BEi.A1H(c26045BfY);
        this.A04 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r14, java.lang.String r15, X.InterfaceC23621Ds r16) {
        /*
            r13 = this;
            r3 = 7
            r4 = r16
            boolean r0 = X.MAF.A01(r4, r3)
            if (r0 == 0) goto L6f
            r12 = r4
            X.MAF r12 = (X.MAF) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r12.A00 = r2
        L17:
            java.lang.Object r6 = r12.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r12.A00
            r5 = 1
            if (r0 == 0) goto L45
            if (r0 != r5) goto L91
            java.lang.Object r1 = r12.A01
            com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase r1 = (com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase) r1
            X.AbstractC09560e7.A00(r6)
        L29:
            X.3NY r6 = (X.C3NY) r6
            boolean r0 = r6 instanceof X.C3NX
            if (r0 == 0) goto L75
            X.05A r3 = r1.A04
        L31:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.BfY r1 = (X.C26045BfY) r1
            X.C6R r0 = X.C6R.A04
            boolean r0 = X.C26045BfY.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L31
            X.3NX r6 = (X.C3NX) r6
            java.lang.Object r4 = r6.A00
        L44:
            return r4
        L45:
            X.AbstractC09560e7.A00(r6)
            X.05A r3 = r13.A04
        L4a:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.BfY r1 = (X.C26045BfY) r1
            X.C6R r0 = X.C6R.A03
            boolean r0 = X.C26045BfY.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L4a
            com.instagram.creator.agent.settings.facts.repository.FactsRepository r6 = r13.A06
            java.lang.String r10 = r13.A02
            X.Jxl r7 = r13.A00
            java.lang.String r11 = r13.A01
            r12.A01 = r13
            r12.A00 = r5
            r8 = r14
            r9 = r15
            java.lang.Object r6 = r6.A00(r7, r8, r9, r10, r11, r12)
            if (r6 == r4) goto L44
            r1 = r13
            goto L29
        L6f:
            X.MAF r12 = new X.MAF
            r12.<init>(r13, r4, r3)
            goto L17
        L75:
            boolean r0 = r6 instanceof X.C194848jk
            if (r0 == 0) goto L8c
            X.05A r3 = r1.A04
        L7b:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.BfY r1 = (X.C26045BfY) r1
            X.C6R r0 = X.C6R.A02
            r4 = 0
            boolean r0 = X.C26045BfY.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L7b
            return r4
        L8c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase.A05(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (X.AbstractC001900j.A0T(r15) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            X.0UO r0 = r13.A05
            java.lang.Object r0 = r0.getValue()
            X.BfY r0 = (X.C26045BfY) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L12
            boolean r0 = X.AbstractC001900j.A0T(r14)
            if (r0 != 0) goto L19
        L12:
            boolean r0 = X.AbstractC001900j.A0T(r15)
            r3 = 0
            if (r0 == 0) goto L1a
        L19:
            r3 = 1
        L1a:
            X.05A r2 = r13.A04
        L1c:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.BfY r0 = (X.C26045BfY) r0
            r12 = r3 ^ 1
            X.C6R r5 = r0.A02
            boolean r10 = r0.A07
            boolean r11 = r0.A05
            java.lang.Integer r6 = r0.A04
            int r8 = r0.A01
            int r9 = r0.A00
            java.lang.Integer r7 = r0.A03
            X.BfY r4 = new X.BfY
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r2.AIi(r1, r4)
            if (r0 == 0) goto L1c
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase.A06(java.lang.String, java.lang.String):void");
    }
}
