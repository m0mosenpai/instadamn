package com.facebook.commonavatarliveediting;

import X.AbstractC166987dD;
import X.AnonymousClass139;
import X.C0JO;
import X.C38684GzP;
import X.C53672NoN;
import X.MSW;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class PrefetchQueue {
    public static PrefetchQueue A07;
    public static final C53672NoN A08 = new Object();
    public final C0JO A06;
    public final AnonymousClass139 A05 = new AnonymousClass139();
    public final AnonymousClass139 A04 = new AnonymousClass139();
    public final List A01 = AbstractC166987dD.A1E();
    public C38684GzP A00 = new C38684GzP(null, null, null, null, null, null, null, null, null, null, 511, 0);
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicInteger A03 = MSW.A1C(0);

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:11:0x0051, B:13:0x005f, B:15:0x0071, B:18:0x0080, B:19:0x0089), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.commonavatarliveediting.PrefetchQueue r12, X.C38684GzP r13, X.InterfaceC23621Ds r14) {
        /*
            r3 = 14
            boolean r0 = X.MAL.A01(r14, r3)
            if (r0 == 0) goto L32
            r4 = r14
            X.MAL r4 = (X.MAL) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A04
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L3d
            if (r1 != r0) goto L38
            java.lang.Object r1 = r4.A03
            X.139 r1 = (X.AnonymousClass139) r1
            java.lang.Object r13 = r4.A02
            X.GzP r13 = (X.C38684GzP) r13
            java.lang.Object r12 = r4.A01
            com.facebook.commonavatarliveediting.PrefetchQueue r12 = (com.facebook.commonavatarliveediting.PrefetchQueue) r12
            X.AbstractC09560e7.A00(r3)
            goto L51
        L32:
            X.MAL r4 = new X.MAL
            r4.<init>(r12, r14, r3)
            goto L16
        L38:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L3d:
            X.AbstractC09560e7.A00(r3)
            X.139 r1 = r12.A04
            r4.A01 = r12
            r4.A02 = r13
            r4.A03 = r1
            r4.A00 = r0
            java.lang.Object r0 = X.AnonymousClass139.A00(r4, r1)
            if (r0 != r5) goto L51
            return r5
        L51:
            java.lang.Object r7 = r13.A00     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r8 = r13.A05     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r9 = r13.A06     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L7d
            X.0JO r0 = r12.A06     // Catch: java.lang.Throwable -> Laa
            long r5 = r0.now()     // Catch: java.lang.Throwable -> Laa
            long r3 = r7.longValue()     // Catch: java.lang.Throwable -> Laa
            long r5 = r5 - r3
            long r3 = r3 + r5
            java.lang.Long r7 = X.MSW.A0z(r3)     // Catch: java.lang.Throwable -> Laa
            if (r8 == 0) goto L7a
            long r3 = r8.longValue()     // Catch: java.lang.Throwable -> Laa
            long r3 = r3 + r5
            java.lang.Long r8 = X.MSW.A0z(r3)     // Catch: java.lang.Throwable -> Laa
        L7a:
            if (r9 == 0) goto L89
            goto L80
        L7d:
            r8 = r2
            r9 = r2
            goto L89
        L80:
            long r3 = r9.longValue()     // Catch: java.lang.Throwable -> Laa
            long r3 = r3 + r5
            java.lang.Long r9 = X.MSW.A0z(r3)     // Catch: java.lang.Throwable -> Laa
        L89:
            java.lang.Object r6 = r13.A01     // Catch: java.lang.Throwable -> Laa
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r14 = r13.A02     // Catch: java.lang.Throwable -> Laa
            java.util.Map r14 = (java.util.Map) r14     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r10 = r13.A03     // Catch: java.lang.Throwable -> Laa
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r11 = r13.A04     // Catch: java.lang.Throwable -> Laa
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r12 = r13.A07     // Catch: java.lang.Throwable -> Laa
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r13 = r13.A08     // Catch: java.lang.Throwable -> Laa
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> Laa
            X.GzP r5 = new X.GzP     // Catch: java.lang.Throwable -> Laa
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Laa
            r1.A04(r2)
            return r5
        Laa:
            r0 = move-exception
            r1.A04(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue.A00(com.facebook.commonavatarliveediting.PrefetchQueue, X.GzP, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[Catch: all -> 0x01d6, TryCatch #0 {all -> 0x01d6, blocks: (B:11:0x0057, B:12:0x0085, B:14:0x008c, B:16:0x00a2, B:17:0x00a6, B:19:0x00b5, B:21:0x00bf, B:22:0x00c3, B:24:0x00cc, B:26:0x00d0, B:28:0x00d8, B:29:0x00dc, B:31:0x00e5, B:35:0x00f5, B:36:0x010a, B:38:0x0110, B:40:0x011c, B:42:0x0120, B:46:0x012a, B:47:0x0144, B:49:0x014a, B:51:0x0156, B:53:0x015a, B:57:0x0164, B:59:0x016f, B:61:0x017a, B:65:0x018e, B:66:0x0193, B:68:0x01a5, B:70:0x01ab, B:71:0x01b0, B:77:0x0188), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[EDGE_INSN: B:34:0x00f5->B:35:0x00f5 BREAK  A[LOOP:0: B:12:0x0085->B:31:0x00e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110 A[Catch: all -> 0x01d6, TryCatch #0 {all -> 0x01d6, blocks: (B:11:0x0057, B:12:0x0085, B:14:0x008c, B:16:0x00a2, B:17:0x00a6, B:19:0x00b5, B:21:0x00bf, B:22:0x00c3, B:24:0x00cc, B:26:0x00d0, B:28:0x00d8, B:29:0x00dc, B:31:0x00e5, B:35:0x00f5, B:36:0x010a, B:38:0x0110, B:40:0x011c, B:42:0x0120, B:46:0x012a, B:47:0x0144, B:49:0x014a, B:51:0x0156, B:53:0x015a, B:57:0x0164, B:59:0x016f, B:61:0x017a, B:65:0x018e, B:66:0x0193, B:68:0x01a5, B:70:0x01ab, B:71:0x01b0, B:77:0x0188), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a A[Catch: all -> 0x01d6, TryCatch #0 {all -> 0x01d6, blocks: (B:11:0x0057, B:12:0x0085, B:14:0x008c, B:16:0x00a2, B:17:0x00a6, B:19:0x00b5, B:21:0x00bf, B:22:0x00c3, B:24:0x00cc, B:26:0x00d0, B:28:0x00d8, B:29:0x00dc, B:31:0x00e5, B:35:0x00f5, B:36:0x010a, B:38:0x0110, B:40:0x011c, B:42:0x0120, B:46:0x012a, B:47:0x0144, B:49:0x014a, B:51:0x0156, B:53:0x015a, B:57:0x0164, B:59:0x016f, B:61:0x017a, B:65:0x018e, B:66:0x0193, B:68:0x01a5, B:70:0x01ab, B:71:0x01b0, B:77:0x0188), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f A[Catch: all -> 0x01d6, TryCatch #0 {all -> 0x01d6, blocks: (B:11:0x0057, B:12:0x0085, B:14:0x008c, B:16:0x00a2, B:17:0x00a6, B:19:0x00b5, B:21:0x00bf, B:22:0x00c3, B:24:0x00cc, B:26:0x00d0, B:28:0x00d8, B:29:0x00dc, B:31:0x00e5, B:35:0x00f5, B:36:0x010a, B:38:0x0110, B:40:0x011c, B:42:0x0120, B:46:0x012a, B:47:0x0144, B:49:0x014a, B:51:0x0156, B:53:0x015a, B:57:0x0164, B:59:0x016f, B:61:0x017a, B:65:0x018e, B:66:0x0193, B:68:0x01a5, B:70:0x01ab, B:71:0x01b0, B:77:0x0188), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.commonavatarliveediting.PrefetchQueue r29, java.util.List r30, X.InterfaceC23621Ds r31) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue.A01(com.facebook.commonavatarliveediting.PrefetchQueue, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8 A[Catch: all -> 0x0122, LOOP:0: B:19:0x00c2->B:21:0x00c8, LOOP_END, TryCatch #0 {all -> 0x0122, blocks: (B:18:0x00b0, B:19:0x00c2, B:21:0x00c8, B:23:0x00e1, B:25:0x00e8), top: B:17:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #0 {all -> 0x0122, blocks: (B:18:0x00b0, B:19:0x00c2, B:21:0x00c8, B:23:0x00e1, B:25:0x00e8), top: B:17:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC58017Po2 r26, X.EnumC53207Ng5 r27, X.OMg r28, java.lang.String r29, java.util.List r30, X.InterfaceC23621Ds r31, X.C12T r32, X.C19L r33, int r34) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue.A02(X.Po2, X.Ng5, X.OMg, java.lang.String, java.util.List, X.1Ds, X.12T, X.19L, int):java.lang.Object");
    }

    public PrefetchQueue(C0JO c0jo) {
        this.A06 = c0jo;
    }
}
