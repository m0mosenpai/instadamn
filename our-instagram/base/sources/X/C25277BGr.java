package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.BGr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25277BGr implements InterfaceC30985Djh, C6NF {
    public InterfaceC31050Dko A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public CSM A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final C6MI A08;
    public final /* synthetic */ C138126Nq A09;

    @Override // X.InterfaceC30985Djh
    public final void Cmw() {
        this.A03 = true;
    }

    public C25277BGr(C138126Nq c138126Nq, C6MI c6mi, int i, long j) {
        this.A09 = c138126Nq;
        this.A06 = i;
        this.A07 = j;
        this.A08 = c6mi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r0 < r1) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0276 A[Catch: all -> 0x02e3, TryCatch #0 {all -> 0x02e3, blocks: (B:136:0x0270, B:138:0x0276, B:140:0x027c, B:142:0x0282, B:144:0x0289, B:161:0x02cb, B:164:0x02e2, B:163:0x02db, B:165:0x02d3), top: B:135:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d3 A[Catch: all -> 0x02e3, TryCatch #0 {all -> 0x02e3, blocks: (B:136:0x0270, B:138:0x0276, B:140:0x027c, B:142:0x0282, B:144:0x0289, B:161:0x02cb, B:164:0x02e2, B:163:0x02db, B:165:0x02d3), top: B:135:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:23:0x007e, B:25:0x0082, B:28:0x0090, B:30:0x0094, B:45:0x00b3, B:49:0x00c2, B:48:0x00bb), top: B:22:0x007e }] */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.0ps, java.lang.Object] */
    @Override // X.C6NF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ATS(X.InterfaceC30771Dg8 r19) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25277BGr.ATS(X.Dg8):boolean");
    }

    @Override // X.InterfaceC30985Djh
    public final void cancel() {
        if (!this.A01) {
            this.A01 = true;
            InterfaceC31050Dko interfaceC31050Dko = this.A00;
            if (interfaceC31050Dko != null) {
                interfaceC31050Dko.dispose();
            }
            this.A00 = null;
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HandleAndRequestImpl { index = ");
        A1C.append(this.A06);
        A1C.append(", constraints = ");
        A1C.append((Object) Constraints.A05(this.A07));
        A1C.append(", isComposed = ");
        A1C.append(AbstractC167007dF.A1W(this.A00));
        A1C.append(", isMeasured = ");
        A1C.append(this.A02);
        A1C.append(", isCanceled = ");
        A1C.append(this.A01);
        return AbstractC166997dE.A0x(" }", A1C);
    }
}
