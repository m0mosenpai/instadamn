package androidx.paging;

import X.AnonymousClass139;
import X.OJN;

/* loaded from: classes9.dex */
public final class FlattenedPageController {
    public final OJN A01 = new OJN();
    public final AnonymousClass139 A02 = new AnonymousClass139();
    public int A00 = -1;

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:11:0x004b, B:13:0x005f, B:19:0x00e7, B:20:0x00f4, B:21:0x00f9, B:26:0x007a, B:27:0x0081, B:28:0x0095, B:30:0x009b, B:32:0x00ac, B:34:0x00b0, B:35:0x00be, B:37:0x00c2, B:39:0x00c8, B:40:0x00cd, B:42:0x00d1, B:43:0x00d3), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:11:0x004b, B:13:0x005f, B:19:0x00e7, B:20:0x00f4, B:21:0x00f9, B:26:0x007a, B:27:0x0081, B:28:0x0095, B:30:0x009b, B:32:0x00ac, B:34:0x00b0, B:35:0x00be, B:37:0x00c2, B:39:0x00c8, B:40:0x00cd, B:42:0x00d1, B:43:0x00d3), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C0eP r9, X.InterfaceC23621Ds r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.A00(X.0eP, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:11:0x0047, B:12:0x005f, B:14:0x0065, B:18:0x006d, B:19:0x0074, B:16:0x0075), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r10) {
        /*
            r9 = this;
            r4 = 6
            boolean r0 = X.MAO.A02(r10, r4)
            if (r0 == 0) goto L2d
            r3 = r10
            X.MAO r3 = (X.MAO) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r2 = r3.A03
            X.1JX r8 = X.C1JX.A02
            int r1 = r3.A00
            r7 = 0
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L33
            java.lang.Object r6 = r3.A02
            X.139 r6 = (X.AnonymousClass139) r6
            java.lang.Object r1 = r3.A01
            androidx.paging.FlattenedPageController r1 = (androidx.paging.FlattenedPageController) r1
            X.AbstractC09560e7.A00(r2)
            goto L47
        L2d:
            X.MAO r3 = new X.MAO
            r3.<init>(r9, r10, r4)
            goto L15
        L33:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L38:
            X.AbstractC09560e7.A00(r2)
            X.139 r6 = r9.A02
            X.MAO.A00(r9, r6, r3, r0)
            java.lang.Object r0 = X.AnonymousClass139.A00(r3, r6)
            if (r0 == r8) goto L8b
            r1 = r9
        L47:
            X.OJN r0 = r1.A01     // Catch: java.lang.Throwable -> L86
            java.util.List r2 = r0.A00()     // Catch: java.lang.Throwable -> L86
            int r1 = r1.A00     // Catch: java.lang.Throwable -> L86
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L86
            int r1 = r1 - r0
            int r5 = r1 + 1
            java.util.ArrayList r8 = X.AbstractC167017dG.A0q(r2)     // Catch: java.lang.Throwable -> L86
            r4 = 0
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L86
        L5f:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L82
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L86
            int r1 = r4 + 1
            if (r4 >= 0) goto L75
            X.AbstractC16960so.A1U()     // Catch: java.lang.Throwable -> L86
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L75:
            X.NnZ r2 = (X.AbstractC53628NnZ) r2     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + r5
            X.0eP r0 = new X.0eP     // Catch: java.lang.Throwable -> L86
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L86
            r8.add(r0)     // Catch: java.lang.Throwable -> L86
            r4 = r1
            goto L5f
        L82:
            r6.A04(r7)
            return r8
        L86:
            r0 = move-exception
            r6.A04(r7)
            throw r0
        L8b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.A01(X.1Ds):java.lang.Object");
    }
}
