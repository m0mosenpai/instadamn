package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class LI7 {
    public static final java.util.Set A05 = AbstractC16830sb.A07(EnumC46307Ked.A05, EnumC46307Ked.A02, EnumC46307Ked.A06, EnumC46307Ked.A0A);
    public C47505KyY A00;
    public AnonymousClass195 A01;
    public final boolean A02;
    public final int A03;
    public final Map A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1 < 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(X.C47505KyY r8, X.LI7 r9, X.EnumC46307Ked r10) {
        /*
            java.util.Map r5 = r8.A01
            java.lang.Number r0 = X.AbstractC37300Gc1.A0Q(r10, r5)
            long r6 = X.AbstractC31178DnM.A03(r0)
            java.util.Map r0 = r9.A04
            java.lang.Number r0 = X.AbstractC37300Gc1.A0Q(r10, r0)
            r3 = 0
            if (r0 == 0) goto L1f
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L21
        L1c:
            X.0sl r4 = X.C16930sl.A00
            return r4
        L1f:
            r1 = 0
        L21:
            long r6 = r6 + r1
            long r1 = android.os.SystemClock.uptimeMillis()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L1c
            long r0 = android.os.SystemClock.uptimeMillis()
            X.AbstractC43592JPx.A1V(r10, r0, r5)
            java.util.List r0 = r8.A00
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r0.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.JyZ r0 = (X.C45133JyZ) r0
            X.Ked r0 = r0.A01
            if (r0 != r10) goto L3b
            r3.add(r1)
            goto L3b
        L50:
            int r0 = r9.A03
            java.util.List r4 = X.AbstractC001800i.A0d(r3, r0)
            java.util.List r0 = r8.A00
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r0.iterator()
        L60:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.JyZ r0 = (X.C45133JyZ) r0
            X.Ked r0 = r0.A01
            if (r0 == r10) goto L60
            r3.add(r1)
            goto L60
        L75:
            java.util.List r1 = X.C15500q5.A02(r3)
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r8.A00 = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LI7.A00(X.KyY, X.LI7, X.Ked):java.util.List");
    }

    public LI7(long j, long j2, long j3, boolean z, int i) {
        this.A02 = z;
        this.A03 = i;
        this.A04 = AbstractC06930Yk.A07(AbstractC167007dF.A1b(EnumC46307Ked.A0A, Long.valueOf(j3), AbstractC167007dF.A0p(EnumC46307Ked.A02, j), AbstractC167007dF.A0p(EnumC46307Ked.A06, j2)));
    }
}
