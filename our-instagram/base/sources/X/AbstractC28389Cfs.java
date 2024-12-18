package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Cfs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28389Cfs {
    public static final void A00(C5Tl c5Tl) {
        A02(c5Tl, null, 0.0f, 0, 7, 0L);
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier) {
        A02(c5Tl, modifier, 0.0f, 6, 6, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r14.AH3(r10) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r14, androidx.compose.ui.Modifier r15, float r16, int r17, int r18, long r19) {
        /*
            r7 = r16
            r10 = r19
            r6 = r15
            r0 = 1262749876(0x4b4408b4, float:1.2847284E7)
            r5 = r14
            r14.Enr(r0)
            r16 = r18
            r4 = r18 & 1
            r15 = r17
            if (r4 == 0) goto La9
            r0 = r17 | 6
        L16:
            r1 = r17 & 48
            if (r1 != 0) goto L29
            r1 = r18 & 2
            if (r1 != 0) goto L26
            boolean r2 = r14.AH3(r10)
            r1 = 32
            if (r2 != 0) goto L28
        L26:
            r1 = 16
        L28:
            r0 = r0 | r1
        L29:
            r3 = r18 & 4
            if (r3 == 0) goto L9f
            r0 = r0 | 384(0x180, float:5.38E-43)
        L2f:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L52
            boolean r1 = r14.Bxj()
            if (r1 == 0) goto L52
            r14.Em9()
        L3e:
            X.5UU r0 = r14.ASZ()
            if (r0 == 0) goto L51
            r17 = 1
            X.DTS r12 = new X.DTS
            r13 = r6
            r14 = r7
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A06 = r12
        L51:
            return
        L52:
            r14.EnE()
            r1 = r17 & 1
            if (r1 == 0) goto L8d
            boolean r1 = r14.AwS()
            if (r1 != 0) goto L8d
            r14.Em9()
            r1 = r18 & 2
            if (r1 == 0) goto L68
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
        L68:
            boolean r1 = X.AbstractC25227BEk.A1S(r14)
            if (r1 == 0) goto L76
            r2 = -512155087(0xffffffffe1792231, float:-2.8723144E20)
            java.lang.String r1 = "com.instagram.compose.ui.divider.Divider (Divider.kt:23)"
            X.C0fH.A01(r2, r1)
        L76:
            r12 = 0
            int r8 = X.AbstractC25230BEn.A03(r0)
            r9 = 8
            X.AbstractC27717CKk.A00(r5, r6, r7, r8, r9, r10, r12)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L3e
            r0 = 648067646(0x26a0ba3e, float:1.1152711E-15)
            X.C0fH.A00(r0)
            goto L3e
        L8d:
            if (r4 == 0) goto L91
            X.58n r6 = androidx.compose.ui.Modifier.A00
        L91:
            r1 = r18 & 2
            if (r1 == 0) goto L9b
            long r10 = X.AbstractC25225BEi.A0D(r14)
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
        L9b:
            if (r3 == 0) goto L68
            r7 = 0
            goto L68
        L9f:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L2f
            int r1 = X.AbstractC25232BEp.A05(r14, r7)
            r0 = r0 | r1
            goto L2f
        La9:
            r0 = r17 & 6
            if (r0 != 0) goto Lb5
            int r0 = X.AbstractC25232BEp.A0R(r14, r6)
            r0 = r0 | r17
            goto L16
        Lb5:
            r0 = r15
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28389Cfs.A02(X.5Tl, androidx.compose.ui.Modifier, float, int, int, long):void");
    }

    public static boolean A03(C5Tl c5Tl, Modifier modifier, long j) {
        A02(c5Tl, AbstractC118185Wd.A08(AbstractC118175Wb.A0A(modifier, 0.0f, 16.0f), 6.0f), 0.0f, 6, 4, j);
        return C0fH.A02();
    }
}
