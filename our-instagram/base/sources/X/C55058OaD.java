package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OaD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55058OaD {
    public C55072OaS A00;
    public final C54825OLj A01;
    public final Map A02 = AbstractC166987dD.A1G();

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r6 != r3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r9 == r2) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C55058OaD r7, X.C54825OLj r8, X.EnumC53187Nfj r9) {
        /*
            X.Nfj r6 = r8.A00
            if (r6 == r9) goto L20
            java.lang.String r5 = "ConferenceState"
            X.C11T.A00()
            if (r6 == r9) goto L13
            X.Nfj r4 = X.EnumC53187Nfj.A03
            if (r6 != r4) goto L21
            X.Nfj r0 = X.EnumC53187Nfj.A04
            if (r9 != r0) goto L21
        L13:
            java.lang.String r1 = "Disallowed state transition %s -> %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r9}
            java.lang.String r0 = X.AbstractC13670mt.A06(r1, r0)
            X.C0w9.A03(r5, r0)
        L20:
            return
        L21:
            X.Nfj r0 = X.EnumC53187Nfj.A07
            if (r6 != r0) goto L2e
            X.Nfj r0 = X.EnumC53187Nfj.A05
            if (r9 == r0) goto L13
            X.Nfj r0 = X.EnumC53187Nfj.A06
            if (r9 != r0) goto L2e
            goto L13
        L2e:
            X.Nfj r3 = X.EnumC53187Nfj.A02
            if (r9 != r3) goto L39
            if (r6 == r4) goto L39
            X.Nfj r0 = X.EnumC53187Nfj.A0A
            if (r6 == r0) goto L39
            goto L13
        L39:
            X.Nfj r2 = X.EnumC53187Nfj.A0A
            if (r9 != r2) goto L40
            if (r6 == r3) goto L52
            goto L13
        L40:
            if (r9 != r4) goto L52
            if (r6 != r3) goto L52
            java.lang.String r1 = "Unexpected state transition %s -> %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r9}
            java.lang.String r0 = X.AbstractC13670mt.A06(r1, r0)
            X.C0w9.A03(r5, r0)
            goto L13
        L52:
            r8.A00 = r9
            boolean r1 = r8.A01
            X.Nfj r0 = X.EnumC53187Nfj.A08
            boolean r0 = X.AbstractC25229BEm.A1a(r9, r0)
            r1 = r1 & r0
            r8.A01 = r1
            if (r9 == r4) goto L66
            if (r9 == r3) goto L66
            r0 = 0
            if (r9 != r2) goto L67
        L66:
            r0 = 1
        L67:
            r0 = r0 | r1
            r8.A01 = r0
            X.OaS r0 = r7.A00
            if (r0 == 0) goto L20
            r0.A02(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55058OaD.A01(X.OaD, X.OLj, X.Nfj):void");
    }

    public C55058OaD(String str) {
        this.A01 = A00(this, str);
    }

    public static C54825OLj A00(C55058OaD c55058OaD, String str) {
        C11T.A00();
        Map map = c55058OaD.A02;
        C54825OLj c54825OLj = (C54825OLj) map.get(str);
        if (c54825OLj == null) {
            C54825OLj c54825OLj2 = new C54825OLj(str);
            map.put(str, c54825OLj2);
            return c54825OLj2;
        }
        return c54825OLj;
    }

    public final HashSet A02(java.util.Set set, boolean z) {
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            C54825OLj c54825OLj = (C54825OLj) A16.next();
            if (set.contains(c54825OLj.A00) && (z || c54825OLj != this.A01)) {
                A1H.add(c54825OLj);
            }
        }
        return A1H;
    }
}
