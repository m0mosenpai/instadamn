package com.instagram.creation.drafts.model.datasource.clips;

import X.C14360o3;
import X.C2PV;
import X.C40121td;
import X.C47Z;
import X.C49602Pt;
import X.C5JK;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* loaded from: classes.dex */
public final class ClipsDraftLocalDataSource {
    public final UserSession A00;
    public final C2PV A01;
    public final PendingMediaStore A02;
    public final C49602Pt A03;
    public final Context A04;

    public ClipsDraftLocalDataSource(Context context, UserSession userSession, C2PV c2pv, PendingMediaStore pendingMediaStore, C49602Pt c49602Pt) {
        C14360o3.A0B(pendingMediaStore, 3);
        C14360o3.A0B(c49602Pt, 4);
        this.A00 = userSession;
        this.A01 = c2pv;
        this.A02 = pendingMediaStore;
        this.A03 = c49602Pt;
        this.A04 = context;
    }

    public static final void A00(C5JK c5jk, ClipsDraftLocalDataSource clipsDraftLocalDataSource, String str) {
        PendingMediaStore pendingMediaStore;
        C47Z A03;
        if (c5jk == C5JK.A06 || c5jk == C5JK.A05) {
            clipsDraftLocalDataSource.A02.A04(str, "maybeDeleteMediaFromPendingMediaStore");
        }
        if ((c5jk == C5JK.A04 || c5jk == C5JK.A07) && (A03 = (pendingMediaStore = clipsDraftLocalDataSource.A02).A03(str)) != null) {
            C40121td.A0G.A01(clipsDraftLocalDataSource.A04, clipsDraftLocalDataSource.A00).A05(A03);
            pendingMediaStore.A0A();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02f7 A[Catch: SQLiteException -> 0x03e7, TryCatch #0 {SQLiteException -> 0x03e7, blocks: (B:12:0x02e8, B:13:0x02eb, B:15:0x02f7, B:17:0x0307, B:21:0x030c, B:23:0x0310, B:26:0x032b, B:28:0x0341, B:29:0x035a, B:32:0x0365, B:33:0x0369, B:35:0x0380, B:38:0x0388, B:40:0x03e3), top: B:11:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x030c A[Catch: SQLiteException -> 0x03e7, TryCatch #0 {SQLiteException -> 0x03e7, blocks: (B:12:0x02e8, B:13:0x02eb, B:15:0x02f7, B:17:0x0307, B:21:0x030c, B:23:0x0310, B:26:0x032b, B:28:0x0341, B:29:0x035a, B:32:0x0365, B:33:0x0369, B:35:0x0380, B:38:0x0388, B:40:0x03e3), top: B:11:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.BDI r98, X.C128175qm r99, X.InterfaceC23621Ds r100, boolean r101) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A01(X.BDI, X.5qm, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.5qm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C5JK r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 12
            boolean r0 = X.C206489Cf.A00(r11, r3)
            if (r0 == 0) goto Laf
            r4 = r11
            X.9Cf r4 = (X.C206489Cf) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r8 = r4.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 2
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L58
            if (r0 == r2) goto L51
            if (r0 != r6) goto Lb6
            java.lang.Object r3 = r4.A03
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r2 = r4.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r4.A01
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = (com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource) r1
            X.AbstractC09560e7.A00(r8)
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r3.next()
            X.MVn r0 = (X.C50602MVn) r0
            java.lang.String r0 = r0.A0W
            r4.A01 = r1
            r4.A02 = r2
            r4.A03 = r3
            r4.A00 = r6
            java.lang.Object r0 = r1.A06(r0, r4)
            if (r0 != r5) goto L34
        L50:
            return r5
        L51:
            java.lang.Object r10 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = (com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource) r1
            goto L6b
        L58:
            X.AbstractC09560e7.A00(r8)
            X.2PV r0 = r9.A01     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> Lbe
            r4.A01 = r9     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> Lbe
            r4.A02 = r10     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> Lbe
            r4.A00 = r2     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> Lbe
            java.lang.Object r8 = r0.A02(r10, r4)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> Lbe
            if (r8 == r5) goto L50
            r1 = r9
            goto L6e
        L6b:
            X.AbstractC09560e7.A00(r8)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> Lbe
        L6e:
            java.util.List r8 = (java.util.List) r8     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> Lbe
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Lae
            java.util.List r0 = X.AbstractC001800i.A0c(r8, r2)
            java.util.Iterator r3 = r0.iterator()
            r2 = r8
            goto L34
        L80:
            r3 = 0
            java.lang.Object r0 = r2.get(r3)
            X.MVn r0 = (X.C50602MVn) r0
            com.instagram.common.session.UserSession r2 = r1.A00
            X.5qm r5 = X.MW5.A01(r2, r0)
            java.lang.Integer r0 = X.C05F.A15
            com.instagram.creation.drafts.model.validation.clips.ClipsDraftValidator r4 = new com.instagram.creation.drafts.model.validation.clips.ClipsDraftValidator
            r4.<init>(r2, r1, r0)
            X.C14360o3.A0B(r5, r3)
            java.lang.String r3 = r5.A0T
            java.util.List r2 = r5.A0v
            r1 = 17
            X.Jxw r0 = new X.Jxw
            r0.<init>(r2, r1, r3)
            X.JXC r0 = r4.A00(r0)
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L50
        Lae:
            return r7
        Laf:
            X.9Cf r4 = new X.9Cf
            r4.<init>(r9, r11, r3)
            goto L16
        Lb6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbe:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SQLiteBlobTooBigException getUnsavedDraft() , clips creation type "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ClipsDraftLocalDataSource"
            X.C0w9.A03(r1, r0)
            java.lang.String r0 = r2.getMessage()
            X.C0K8.A0K(r1, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A02(X.5JK, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.C5JK r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 21
            boolean r0 = X.C206459Cc.A00(r9, r3)
            if (r0 == 0) goto L5e
            r6 = r9
            X.9Cc r6 = (X.C206459Cc) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r5 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L3b
            if (r0 != r3) goto L64
            X.AbstractC09560e7.A00(r5)
        L27:
            return r5
        L28:
            X.AbstractC09560e7.A00(r5)
            X.2PV r0 = r7.A01
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r2
            java.lang.Object r5 = r0.A03(r8, r6)
            if (r5 == r4) goto L5d
            r1 = r7
            goto L46
        L3b:
            java.lang.Object r8 = r6.A02
            X.5JK r8 = (X.C5JK) r8
            java.lang.Object r1 = r6.A01
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = (com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource) r1
            X.AbstractC09560e7.A00(r5)
        L46:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            if (r0 != 0) goto L6c
            X.2PV r1 = r1.A01
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A00 = r3
            java.lang.Object r5 = r1.A05(r8, r6)
            if (r5 != r4) goto L27
        L5d:
            return r4
        L5e:
            X.9Cc r6 = new X.9Cc
            r6.<init>(r7, r9, r3)
            goto L16
        L64:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L6c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A03(X.5JK, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.C5JK r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 10
            boolean r0 = X.C9CX.A00(r7, r3)
            if (r0 == 0) goto L38
            r4 = r7
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L40
            X.AbstractC09560e7.A00(r3)
        L24:
            if (r3 != 0) goto L27
            r0 = 0
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.AbstractC09560e7.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = r5.A02(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L38:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r5, r7, r3, r0)
            goto L16
        L40:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A04(X.5JK, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 22
            boolean r0 = X.C206459Cc.A00(r9, r3)
            if (r0 == 0) goto L58
            r5 = r9
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L2a
            if (r0 != r3) goto L5e
            X.AbstractC09560e7.A00(r1)
        L27:
            X.0eB r4 = X.C0eB.A00
        L29:
            return r4
        L2a:
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r5.A01
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = (com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource) r0
            X.AbstractC09560e7.A00(r1)
            goto L48
        L36:
            X.AbstractC09560e7.A00(r1)
            X.2PV r0 = r6.A01
            r5.A01 = r6
            r5.A02 = r7
            r5.A00 = r2
            java.lang.Object r0 = r0.A08(r7, r8, r5)
            if (r0 == r4) goto L29
            r0 = r6
        L48:
            X.2PV r1 = r0.A01
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r1.A0I(r7, r5, r2)
            if (r0 != r4) goto L27
            return r4
        L58:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r6, r9, r3)
            goto L16
        L5e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A05(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 19
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L5d
            r5 = r8
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L2a
            if (r0 != r2) goto L63
            X.AbstractC09560e7.A00(r4)
        L27:
            X.0eB r3 = X.C0eB.A00
        L29:
            return r3
        L2a:
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r5.A01
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = (com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource) r0
            X.AbstractC09560e7.A00(r4)
            goto L48
        L36:
            X.AbstractC09560e7.A00(r4)
            X.2PV r0 = r6.A01
            r5.A01 = r6
            r5.A02 = r7
            r5.A00 = r1
            java.lang.Object r4 = r0.A0D(r7, r5)
            if (r4 == r3) goto L29
            r0 = r6
        L48:
            X.5JK r4 = (X.C5JK) r4
            A00(r4, r0, r7)
            X.2PV r1 = r0.A01
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r2
            java.lang.Object r0 = r1.A09(r7, r5)
            if (r0 != r3) goto L27
            return r3
        L5d:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r6, r8, r3)
            goto L16
        L63:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A06(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24)(1:25))|12|(2:14|15)|18))|28|6|7|(0)(0)|12|(0)|18) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        X.C0w9.A03("ClipsDraftLocalDataSource", X.AnonymousClass001.A0R("SQLiteBlobTooBigException getClipsDraft(), id ", r7));
        X.C0K8.A0K("ClipsDraftLocalDataSource", r2.getMessage(), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: SQLiteBlobTooBigException -> 0x005b, TryCatch #0 {SQLiteBlobTooBigException -> 0x005b, blocks: (B:11:0x004d, B:12:0x0050, B:14:0x0054, B:22:0x003c), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 20
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L2b
            r5 = r8
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L31
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r5.A01
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = (com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource) r0
            goto L4d
        L2b:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r6, r8, r3)
            goto L16
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L39:
            X.AbstractC09560e7.A00(r4)
            X.2PV r0 = r6.A01     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            r5.A01 = r6     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            r5.A02 = r7     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            r5.A00 = r1     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            java.lang.Object r4 = r0.A0C(r7, r5)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            if (r4 != r2) goto L4b
            return r2
        L4b:
            r0 = r6
            goto L50
        L4d:
            X.AbstractC09560e7.A00(r4)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
        L50:
            X.MVn r4 = (X.C50602MVn) r4     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            if (r4 == 0) goto L6e
            com.instagram.common.session.UserSession r0 = r0.A00     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            X.5qm r3 = X.MW5.A01(r0, r4)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L5b
            return r3
        L5b:
            r2 = move-exception
            java.lang.String r0 = "SQLiteBlobTooBigException getClipsDraft(), id "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r7)
            java.lang.String r1 = "ClipsDraftLocalDataSource"
            X.C0w9.A03(r1, r0)
            java.lang.String r0 = r2.getMessage()
            X.C0K8.A0K(r1, r0, r2)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A07(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(2:14|15)|18))|27|6|7|(0)(0)|12|(0)|18) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        X.C0w9.A03("ClipsDraftLocalDataSource", X.AnonymousClass001.A0R("SQLiteBlobTooBigException getClipsDraftForValidation(), id + ", r7));
        X.C0K8.A0K("ClipsDraftLocalDataSource", r2.getMessage(), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[Catch: SQLiteBlobTooBigException -> 0x0058, TryCatch #0 {SQLiteBlobTooBigException -> 0x0058, blocks: (B:11:0x0045, B:12:0x0048, B:14:0x004c, B:22:0x0038), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r4 = 41
            boolean r0 = X.MAG.A01(r8, r4)
            if (r0 == 0) goto L27
            r3 = r8
            X.MAG r3 = (X.MAG) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r5 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            java.lang.Object r7 = r3.A01
            java.lang.String r7 = (java.lang.String) r7
            goto L45
        L27:
            X.MAG r3 = new X.MAG
            r3.<init>(r6, r8, r4)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r5)
            X.2PV r0 = r6.A01     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            r3.A01 = r7     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            r3.A00 = r1     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            java.lang.Object r5 = r0.A0E(r7, r3)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            if (r5 != r2) goto L48
            return r2
        L45:
            X.AbstractC09560e7.A00(r5)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
        L48:
            X.O7S r5 = (X.O7S) r5     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            if (r5 == 0) goto L6b
            java.lang.String r3 = r5.A00     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            java.util.List r2 = r5.A01     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            r1 = 17
            X.Jxw r0 = new X.Jxw     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            r0.<init>(r2, r1, r3)     // Catch: android.database.sqlite.SQLiteBlobTooBigException -> L58
            return r0
        L58:
            r2 = move-exception
            java.lang.String r0 = "SQLiteBlobTooBigException getClipsDraftForValidation(), id + "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r7)
            java.lang.String r1 = "ClipsDraftLocalDataSource"
            X.C0w9.A03(r1, r0)
            java.lang.String r0 = r2.getMessage()
            X.C0K8.A0K(r1, r0, r2)
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A08(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 30
            boolean r0 = X.C9CY.A00(r7, r3)
            if (r0 == 0) goto L3d
            r4 = r7
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L45
            X.AbstractC09560e7.A00(r3)
        L24:
            X.MWL r3 = (X.MWL) r3
            if (r3 == 0) goto L43
            X.9J0 r1 = X.MW5.A00(r3)
            return r1
        L2d:
            X.AbstractC09560e7.A00(r3)
            X.2PV r0 = r5.A01
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A0G(r6, r4)
            if (r3 != r1) goto L24
            return r1
        L3d:
            X.9CY r4 = new X.9CY
            r4.<init>(r5, r7, r3)
            goto L16
        L43:
            r1 = 0
            return r1
        L45:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A09(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r3 == r2) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[LOOP:0: B:11:0x0035->B:13:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = X.C9CX.A00(r6, r3)
            if (r0 == 0) goto L55
            r4 = r6
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L47
            if (r0 != r1) goto L5d
            X.AbstractC09560e7.A00(r3)
        L24:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r3, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.next()
            X.5Ns r0 = (X.C116135Ns) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L35
        L47:
            X.AbstractC09560e7.A00(r3)
            X.2PV r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A0M(r4)
            if (r3 != r2) goto L24
        L54:
            return r2
        L55:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r5, r6, r3, r0)
            goto L16
        L5d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A0A(X.1Ds):java.lang.Object");
    }
}
