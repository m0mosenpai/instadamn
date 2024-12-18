package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fao, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34964Fao {
    public final InterfaceC41501vz A00;
    public final InterfaceC41501vz A01;
    public final InterfaceC41501vz A02;
    public final InterfaceC41501vz A03;
    public final UserSession A04;
    public final EQI A05;
    public final InterfaceC37179GZq A06;
    public final InterfaceC09390do A07;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009c, code lost:
    
        if (r1.A04 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        r3 = r5.A01.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        if (r2 >= r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
    
        r1 = (com.instagram.save.model.SavedCollection) r5.A01.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
    
        if (X.C14360o3.A0K(r1.A0F, r12) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        r1.A0H = r10.getId();
        r1.A04 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        X.EQI.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        if (r13 != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C38321qM r10, X.C34964Fao r11, java.lang.String r12, boolean r13) {
        /*
            r9 = 1
            r4 = 0
            if (r12 != 0) goto L70
            boolean r0 = r10.CcN()
            X.EQI r6 = r11.A05
            if (r0 != 0) goto Ld3
            X.Eeg r5 = r6.A04
            X.C14360o3.A0B(r5, r4)
            java.util.List r0 = r5.A01
            int r3 = r0.size()
            r8 = 0
            r2 = 0
        L19:
            if (r2 >= r3) goto L63
            java.util.List r0 = r5.A01
            java.lang.Object r7 = r0.get(r2)
            com.instagram.save.model.SavedCollection r7 = (com.instagram.save.model.SavedCollection) r7
            X.Epn r1 = r7.A07
            X.Epn r0 = X.EnumC33416Epn.A05
            if (r1 != r0) goto L59
            java.util.List r0 = r7.A0L
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r1 = r0.size()
            r0 = 4
            r5 = 0
            if (r1 < r0) goto L38
            r5 = 1
        L38:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.List r0 = r7.A0L
            java.util.Iterator r3 = X.AbstractC31174DnI.A13(r0)
            r2 = 0
        L43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5c
            X.1qM r1 = X.AbstractC31172DnG.A0i(r3)
            boolean r0 = X.AbstractC35236FgV.A05(r10, r1)
            if (r0 == 0) goto L55
            r2 = 1
            goto L43
        L55:
            r4.add(r1)
            goto L43
        L59:
            int r2 = r2 + 1
            goto L19
        L5c:
            r7.A0L = r4
            if (r2 == 0) goto L63
            if (r5 == 0) goto L63
            r8 = 1
        L63:
            X.EQI.A00(r6)
            boolean r0 = r6.A02(r10)
            if (r8 != 0) goto L6f
            if (r0 != 0) goto L6f
            r9 = 0
        L6f:
            return r9
        L70:
            java.util.List r0 = r10.BqL()
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto Lc5
            X.EQI r6 = r11.A05
            X.Eeg r5 = r6.A04
            X.C14360o3.A0B(r5, r4)
            java.util.List r0 = r5.A01
            int r3 = r0.size()
            r2 = 0
        L88:
            if (r2 >= r3) goto L9e
            java.util.List r0 = r5.A01
            java.lang.Object r1 = r0.get(r2)
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            java.lang.String r0 = r1.A0F
            boolean r0 = X.C14360o3.A0K(r0, r12)
            if (r0 == 0) goto Lc2
            X.1qM r0 = r1.A04
            if (r0 != 0) goto Ld1
        L9e:
            java.util.List r0 = r5.A01
            int r3 = r0.size()
            r2 = 0
        La5:
            if (r2 >= r3) goto Lce
            java.util.List r0 = r5.A01
            java.lang.Object r1 = r0.get(r2)
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            java.lang.String r0 = r1.A0F
            boolean r0 = X.C14360o3.A0K(r0, r12)
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r10.getId()
            r1.A0H = r0
            r1.A04 = r10
        Lbf:
            int r2 = r2 + 1
            goto La5
        Lc2:
            int r2 = r2 + 1
            goto L88
        Lc5:
            X.EQI r0 = r11.A05
            boolean r0 = r0.A02(r10)
            if (r0 == 0) goto Ld6
            return r9
        Lce:
            X.EQI.A00(r6)
        Ld1:
            if (r13 == 0) goto Ld6
        Ld3:
            r6.A01(r10)
        Ld6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34964Fao.A00(X.1qM, X.Fao, java.lang.String, boolean):boolean");
    }

    public C34964Fao(UserSession userSession, EQI eqi, InterfaceC37179GZq interfaceC37179GZq) {
        AbstractC167017dG.A1R(interfaceC37179GZq, userSession);
        this.A05 = eqi;
        this.A06 = interfaceC37179GZq;
        this.A04 = userSession;
        C36155FxU c36155FxU = new C36155FxU(this, 12);
        this.A00 = c36155FxU;
        C36155FxU c36155FxU2 = new C36155FxU(this, 13);
        this.A01 = c36155FxU2;
        C36155FxU c36155FxU3 = new C36155FxU(this, 14);
        this.A02 = c36155FxU3;
        C36155FxU c36155FxU4 = new C36155FxU(this, 15);
        this.A03 = c36155FxU4;
        C17050sx A01 = AbstractC09440dt.A01(new C37016GSx(this, 27));
        this.A07 = A01;
        C25671My c25671My = (C25671My) A01.getValue();
        c25671My.A01(c36155FxU4, C3HW.class);
        c25671My.A01(c36155FxU2, C36110Fwk.class);
        c25671My.A01(c36155FxU3, C36116Fwq.class);
        c25671My.A01(c36155FxU, C36117Fwr.class);
    }
}
