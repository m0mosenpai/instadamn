package com.instagram.schools.tab.data;

import X.C60266Qwe;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class SchoolTabDataSource {
    public C60266Qwe A00;
    public final UserSession A01;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|(1:(1:9)(2:66|67))(4:68|(1:70)|71|(1:73))|10|11|12|(3:14|(1:59)(13:20|(1:22)|23|(1:25)|26|(5:28|(1:30)|31|(1:33)|34)(1:58)|35|(1:37)|38|(1:40)(1:57)|41|(1:43)|44)|45)(2:60|(2:62|63))|46|47|(2:49|50)(2:52|(2:54|55)(1:56))))|74|6|(0)(0)|10|11|12|(0)(0)|46|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
    
        r1 = r0.A00;
        X.C14360o3.A0C(r1, "null cannot be cast to non-null type com.meta.kotlin.Try<Value of com.meta.kotlin.Try.Companion.build, Error of com.meta.kotlin.Try.Companion.build>");
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: PW6 -> 0x0178, TryCatch #0 {PW6 -> 0x0178, blocks: (B:12:0x008f, B:14:0x0093, B:16:0x009d, B:18:0x00a3, B:20:0x00b0, B:22:0x00b9, B:23:0x00bb, B:26:0x00c6, B:28:0x00db, B:31:0x00e4, B:34:0x00f0, B:35:0x00f7, B:37:0x0114, B:38:0x0116, B:40:0x0130, B:41:0x0135, B:43:0x013d, B:44:0x0143, B:45:0x016b, B:46:0x016f, B:59:0x015a, B:60:0x0151, B:62:0x0155, B:63:0x0159), top: B:11:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151 A[Catch: PW6 -> 0x0178, TryCatch #0 {PW6 -> 0x0178, blocks: (B:12:0x008f, B:14:0x0093, B:16:0x009d, B:18:0x00a3, B:20:0x00b0, B:22:0x00b9, B:23:0x00bb, B:26:0x00c6, B:28:0x00db, B:31:0x00e4, B:34:0x00f0, B:35:0x00f7, B:37:0x0114, B:38:0x0116, B:40:0x0130, B:41:0x0135, B:43:0x013d, B:44:0x0143, B:45:0x016b, B:46:0x016f, B:59:0x015a, B:60:0x0151, B:62:0x0155, B:63:0x0159), top: B:11:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.schools.tab.data.SchoolTabDataSource r16, java.lang.String r17, java.lang.String r18, X.InterfaceC23621Ds r19, int r20) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabDataSource.A00(com.instagram.schools.tab.data.SchoolTabDataSource, java.lang.String, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.schools.tab.data.SchoolTabDataSource r5, java.lang.String r6, X.InterfaceC23621Ds r7, int r8) {
        /*
            r3 = 8
            boolean r0 = X.PXC.A03(r7, r3)
            if (r0 == 0) goto L41
            r4 = r7
            X.PXC r4 = (X.PXC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L34
            if (r2 != r1) goto L46
            X.AbstractC09560e7.A00(r0)
        L24:
            if (r0 != 0) goto L2e
            java.lang.String r1 = "Failed to load data"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r1 = 0
        L2e:
            X.MU9 r3 = new X.MU9
            r3.<init>(r0, r1)
            return r3
        L34:
            X.AbstractC09560e7.A00(r0)
            r0 = 0
            r4.A00 = r1
            java.lang.Object r0 = A00(r5, r6, r0, r4, r8)
            if (r0 != r3) goto L24
            return r3
        L41:
            X.PXC r4 = X.PXC.A00(r5, r7, r3)
            goto L16
        L46:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabDataSource.A01(com.instagram.schools.tab.data.SchoolTabDataSource, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.schools.tab.data.SchoolTabDataSource r6, java.lang.String r7, X.InterfaceC23621Ds r8, int r9) {
        /*
            r3 = 9
            boolean r0 = X.PXC.A03(r8, r3)
            if (r0 == 0) goto L4d
            r5 = r8
            X.PXC r5 = (X.PXC) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L60
            X.AbstractC09560e7.A00(r1)
        L24:
            if (r1 == 0) goto L52
            X.MU9 r4 = new X.MU9
            r4.<init>(r1, r3)
            return r4
        L2c:
            X.AbstractC09560e7.A00(r1)
            X.Qwe r1 = r6.A00
            r0 = 0
            if (r1 == 0) goto L65
            java.lang.String r2 = "end_cursor"
            java.lang.String r1 = r1.getOptionalStringField(r3, r2)
            if (r1 == 0) goto L65
            X.Qwe r1 = r6.A00
            if (r1 == 0) goto L44
            java.lang.String r0 = r1.getOptionalStringField(r3, r2)
        L44:
            r5.A00 = r3
            java.lang.Object r1 = A00(r6, r7, r0, r5, r9)
            if (r1 != r4) goto L24
            return r4
        L4d:
            X.PXC r5 = X.PXC.A00(r6, r8, r3)
            goto L16
        L52:
            java.lang.String r0 = "Failed to load data"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r0 = 0
            X.MU9 r4 = new X.MU9
            r4.<init>(r1, r0)
            return r4
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L65:
            java.lang.String r0 = "No next data"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r0 = 0
            X.MU9 r4 = new X.MU9
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabDataSource.A02(com.instagram.schools.tab.data.SchoolTabDataSource, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    public SchoolTabDataSource(UserSession userSession) {
        this.A01 = userSession;
    }
}
