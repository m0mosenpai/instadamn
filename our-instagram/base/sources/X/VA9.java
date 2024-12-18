package X;

/* loaded from: classes11.dex */
public final class VA9 extends Tx3 {
    public final C31699Dw4 A00;
    public final C34707FQs A01;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if (abstractC127945qN instanceof VA9) {
            VA9 va9 = (VA9) abstractC127945qN;
            if (C14360o3.A0K(this.A00, va9.A00) && C14360o3.A0K(this.A01, va9.A01)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.FQs] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Dw4, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VA9(java.lang.String r3, int r4, boolean r5) {
        /*
            r2 = this;
            X.Dw4 r1 = new X.Dw4
            r1.<init>()
            java.lang.String r0 = ""
            r1.A01 = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.A00 = r0
            r1.A01 = r3
            r1.A00 = r4
            X.FQs r0 = new X.FQs
            r0.<init>()
            r0.A00 = r5
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VA9.<init>(java.lang.String, int, boolean):void");
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VA9(C31699Dw4 c31699Dw4, C34707FQs c34707FQs) {
        super("search_footer");
        AbstractC167017dG.A1P(c31699Dw4, c34707FQs);
        this.A00 = c31699Dw4;
        this.A01 = c34707FQs;
    }
}
