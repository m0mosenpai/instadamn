package X;

/* renamed from: X.5S4, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5S4 {
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C4OV r29, java.lang.String r30, X.InterfaceC16620sF r31) {
        /*
            r0 = 0
            r11 = r30
            X.C14360o3.A0B(r11, r0)
            r0 = 1
            r14 = r29
            X.C14360o3.A0B(r14, r0)
            com.instagram.quickpromotion.intf.QuickPromotionSurface[] r10 = com.instagram.quickpromotion.intf.QuickPromotionSurface.values()
            int r9 = r10.length
            r8 = 0
        L12:
            if (r8 >= r9) goto Ld0
            r7 = r10[r8]
            java.util.List r1 = r14.A00(r7)
            if (r1 == 0) goto Lc1
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r16 = r1.iterator()
        L2b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r5 = r16.next()
            X.5Rm r5 = (X.C117035Rm) r5
            X.5Rn r12 = r5.A02
            X.5Rp r1 = r5.A01
            if (r1 == 0) goto Lb4
            java.lang.Long r0 = r1.A00
            if (r0 == 0) goto Lb4
            long r2 = r0.longValue()
        L45:
            java.lang.Long r0 = r1.A01
            if (r0 == 0) goto Lb9
            long r23 = r0.longValue()
        L4d:
            java.lang.Long r13 = r5.A03
            java.util.List r1 = r12.A06
            if (r1 == 0) goto Lc8
            r0 = 0
            java.lang.Object r4 = X.AbstractC001800i.A0O(r1, r0)
            X.4NM r4 = (X.C4NM) r4
            if (r4 == 0) goto Lc8
            X.5S6 r15 = X.C5S5.A03
            X.5S5 r1 = r15.A00()
            java.lang.String r0 = r12.A05
            X.4NQ r1 = r1.A00(r11, r0)
            if (r1 != 0) goto L80
            java.lang.String r0 = r12.A05
            X.4NQ r1 = new X.4NQ
            r1.<init>(r11, r0, r2)
            X.5S5 r0 = r15.A00()
            X.5S7 r12 = r0.A01
            monitor-enter(r12)
            java.lang.String r0 = X.C5S8.A00(r1)     // Catch: java.lang.Throwable -> Lc5
            X.C5S7.A00(r1, r12, r0)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r12)
        L80:
            X.5Rn r15 = r5.A02
            if (r13 == 0) goto Lae
            long r27 = r13.longValue()
        L88:
            int r13 = r5.A00
            boolean r12 = r5.A05
            boolean r0 = r5.A04
            r22 = r13
            r25 = r2
            r29 = r12
            r30 = r0
            r19 = r15
            r20 = r1
            r21 = r11
            r18 = r4
            r17 = r7
            X.4NJ r1 = X.C5SB.A00(r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r30)
            X.4Nf r0 = new X.4Nf
            r0.<init>(r1)
            r6.add(r0)
            goto L2b
        Lae:
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L88
        Lb4:
            r2 = 0
            if (r1 == 0) goto Lb9
            goto L45
        Lb9:
            r23 = 0
            goto L4d
        Lbc:
            r0 = r31
            r0.invoke(r7, r6)
        Lc1:
            int r8 = r8 + 1
            goto L12
        Lc5:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        Lc8:
            java.lang.String r1 = "Unexpected null creatives"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5S4.A00(X.4OV, java.lang.String, X.0sF):void");
    }
}
