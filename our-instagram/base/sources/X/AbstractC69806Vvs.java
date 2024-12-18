package X;

/* renamed from: X.Vvs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69806Vvs {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r2 != 3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.WFa r9, X.XG2[] r10, long r11) {
        /*
        L0:
            int r5 = r9.A00
            int r0 = r9.A01
            int r0 = r5 - r0
            r4 = 1
            if (r0 <= r4) goto L88
            r3 = 0
        La:
            int r0 = r9.A01
            int r0 = r5 - r0
            if (r0 != 0) goto L7e
            r3 = -1
        L11:
            r2 = 0
        L12:
            int r0 = r9.A01
            int r0 = r5 - r0
            if (r0 != 0) goto L74
            r2 = -1
        L19:
            int r1 = r9.A01
            int r8 = r1 + r2
            r0 = -1
            if (r2 == r0) goto L66
            int r5 = r5 - r1
            if (r2 > r5) goto L66
            r0 = 4
            if (r3 != r0) goto L60
            r0 = 8
            if (r2 < r0) goto L60
            int r7 = r9.A05()
            int r6 = r9.A08()
            r5 = 49
            if (r6 != r5) goto L64
            int r3 = r9.A01()
        L3a:
            int r2 = r9.A05()
            r1 = 47
            if (r6 != r1) goto L45
            r9.A0P(r4)
        L45:
            r0 = 181(0xb5, float:2.54E-43)
            if (r7 != r0) goto L51
            if (r6 == r5) goto L4d
            if (r6 != r1) goto L51
        L4d:
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L52
        L51:
            r1 = 0
        L52:
            if (r6 != r5) goto L5b
            r0 = 1195456820(0x47413934, float:49465.203)
            if (r3 == r0) goto L5a
            r4 = 0
        L5a:
            r1 = r1 & r4
        L5b:
            if (r1 == 0) goto L60
            A01(r9, r10, r11)
        L60:
            r9.A0O(r8)
            goto L0
        L64:
            r3 = 0
            goto L3a
        L66:
            java.lang.String r1 = "CeaUtil"
            r0 = 689(0x2b1, float:9.65E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.AbstractC63374Sil.A04(r1, r0)
            int r8 = r9.A00
            goto L60
        L74:
            int r1 = r9.A05()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L12
            goto L19
        L7e:
            int r1 = r9.A05()
            int r3 = r3 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto La
            goto L11
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69806Vvs.A00(X.WFa, X.XG2[], long):void");
    }

    public static void A01(WFa wFa, XG2[] xg2Arr, long j) {
        int A05 = wFa.A05();
        if ((A05 & 64) != 0) {
            wFa.A0P(1);
            int i = (A05 & 31) * 3;
            int i2 = wFa.A01;
            for (XG2 xg2 : xg2Arr) {
                wFa.A0O(i2);
                xg2.ELL(wFa, i);
                WDn.A02(AbstractC167007dF.A1M((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
                xg2.ELS(null, 1, i, 0, j);
            }
        }
    }
}
