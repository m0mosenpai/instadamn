package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import libraries.zero.headers.ZeroHeadersEntry;

/* renamed from: X.OaJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55063OaJ {
    public final OVb A01;
    public final List A02;
    public final OFP A04;
    public final String[] A05;
    public final List A06;
    public Integer A00 = null;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    private String A00() {
        List list;
        OVb oVb = this.A01;
        int A00 = oVb.A00();
        if (A00 >= 0 && A00 <= 2) {
            int A002 = oVb.A00();
            if (A00 != 0) {
                if (A00 != 1) {
                    return this.A05[A002];
                }
                list = this.A02;
            } else {
                list = this.A06;
            }
            return AbstractC25226BEj.A1I(list, A002);
        }
        throw AbstractC25230BEn.A0n("unknown ref type: ", A00);
    }

    private void A01(int i, String str) {
        int A06;
        Integer num = this.A00;
        if (num != null) {
            try {
                OFP ofp = this.A04;
                String[] strArr = this.A05;
                int intValue = num.intValue();
                C14360o3.A0B(strArr, 0);
                String str2 = strArr[3];
                String str3 = strArr[2];
                String str4 = strArr[1];
                String str5 = strArr[0];
                try {
                    A06 = Integer.parseInt(str5);
                } catch (NumberFormatException unused) {
                    A06 = (int) AbstractC31177DnL.A06();
                }
                ZeroHeadersEntry zeroHeadersEntry = new ZeroHeadersEntry(str2, str3, ofp.A05, str5, str4, A06, A06 + (intValue / 1000));
                ofp.A00 = zeroHeadersEntry;
                C2ST.A00(AnonymousClass191.A00, new PZ0(zeroHeadersEntry, ofp, null, 19));
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        try {
            OFP ofp2 = this.A04;
            ofp2.A07.resumeWith(new C54822OLc(new C54510O6n(i, str), ofp2.A00));
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x001e, code lost:
    
        if (r6 != 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.PW3] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(int r25, java.lang.Throwable r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55063OaJ.A02(int, java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r5 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C55063OaJ(X.OVb r7, java.util.List r8, X.OFP r9, int r10) {
        /*
            r6 = this;
            r6.<init>()
            r3 = 0
            r6.A00 = r3
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r2)
            r6.A03 = r0
            r6.A01 = r7
            r6.A06 = r8
            r6.A04 = r9
            java.util.ArrayList r0 = X.AbstractC25225BEi.A17(r10)
            r6.A02 = r0
        L1a:
            if (r2 >= r10) goto L26
            java.util.List r1 = r6.A02
            java.lang.String r0 = ""
            r1.add(r0)
            int r2 = r2 + 1
            goto L1a
        L26:
            libraries.zero.headers.ZeroHeadersEntry r5 = r9.A09
            if (r5 == 0) goto L52
            int r0 = r5.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L30:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            if (r5 == 0) goto L38
            java.lang.String r3 = r5.A04
        L38:
            java.lang.String r2 = ""
            if (r3 != 0) goto L3d
            r3 = r2
        L3d:
            if (r5 == 0) goto L43
            java.lang.String r1 = r5.A05
            if (r1 != 0) goto L46
        L43:
            r1 = r2
            if (r5 == 0) goto L4b
        L46:
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L4b
            r2 = r0
        L4b:
            java.lang.String[] r0 = new java.lang.String[]{r4, r3, r1, r2}
            r6.A05 = r0
            return
        L52:
            r0 = r3
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55063OaJ.<init>(X.OVb, java.util.List, X.OFP, int):void");
    }
}
