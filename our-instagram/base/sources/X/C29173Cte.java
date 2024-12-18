package X;

import java.util.List;

/* renamed from: X.Cte, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29173Cte implements C3ZQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C50525MSe A05;
    public final C0f6 A06;
    public final C27086BxB A07;
    public final C3ZQ A08;
    public final List A09;
    public final InterfaceC16660sJ A0A;
    public final C3ZQ A0B;
    public final C3ZQ A0C;
    public final /* synthetic */ C5H0 A0D;

    @Override // X.C3ZQ
    public final Object Ava() {
        return null;
    }

    @Override // X.C3ZQ
    public final /* synthetic */ void DR7(Object obj) {
    }

    public C29173Cte(C50525MSe c50525MSe, C0f6 c0f6, C27086BxB c27086BxB, C5H0 c5h0, C3ZQ c3zq, C3ZQ c3zq2, List list, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, int i4, int i5) {
        C3ZQ c903040p;
        this.A0D = c5h0;
        this.A07 = c27086BxB;
        this.A05 = c50525MSe;
        this.A06 = c0f6;
        this.A0A = interfaceC16660sJ;
        this.A09 = list;
        this.A01 = i;
        this.A02 = i2;
        this.A0B = c3zq;
        this.A04 = i3;
        this.A03 = i4;
        this.A08 = c3zq2;
        this.A00 = i5;
        C3ZO c3zo = (C3ZO) list.get(i);
        if (C9BP.A00(c3zo, 1)) {
            c903040p = new C3ZW((C9BP) c3zo);
        } else if (C9BP.A00(c3zo, 0)) {
            c903040p = new C9QL((C9BP) c3zo);
        } else if (c3zo instanceof C902940o) {
            c903040p = new C903040p(this.A05, this.A06, (C902940o) c3zo, this.A0A);
        } else {
            throw AbstractC166987dD.A12(AbstractC111324zv.A00(1851));
        }
        this.A0C = c903040p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r0 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        X.AbstractC166997dE.A1R(r0, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r0 != null) goto L6;
     */
    @Override // X.C3ZQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Iterable BWV(X.C206209Bd r8, X.C3AW r9, int r10) {
        /*
            r7 = this;
            X.3ZQ r1 = r7.A0C
            r0 = 0
            X.0e4 r0 = X.AbstractC167007dF.A0o(r1, r0)
            X.0e4[] r0 = new X.C09530e4[]{r0}
            java.util.ArrayList r6 = X.AbstractC16960so.A1N(r0)
            X.3ZQ r1 = r7.A0B
            int r0 = r7.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            X.AbstractC166997dE.A1R(r1, r5, r6)
            X.5H0 r4 = r7.A0D
            int r3 = r7.A01
            int r1 = r3 + 1
            java.util.List r0 = r7.A09
            int r0 = r0.size()
            if (r1 >= r0) goto L3f
            X.BxB r2 = r7.A07
            int r0 = r7.A02
            int r0 = r0 + r3
            int r1 = r0 + 1
            r0 = 16
            X.DGn r0 = X.C29899DGn.A00(r4, r7, r0)
            X.Cte r0 = X.C5H0.A00(r2, r4, r0, r1)
            if (r0 == 0) goto L3f
        L3b:
            X.AbstractC166997dE.A1R(r0, r5, r6)
        L3e:
            return r6
        L3f:
            X.3ZQ r0 = r7.A08
            if (r0 == 0) goto L3e
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29173Cte.BWV(X.9Bd, X.3AW, int):java.lang.Iterable");
    }

    @Override // X.C3ZQ
    public final /* synthetic */ boolean DR6(Object obj) {
        return true;
    }
}
