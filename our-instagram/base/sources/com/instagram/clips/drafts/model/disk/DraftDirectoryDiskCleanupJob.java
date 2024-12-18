package com.instagram.clips.drafts.model.disk;

import X.C14360o3;
import X.C2PV;
import X.C49602Pt;

/* loaded from: classes2.dex */
public final class DraftDirectoryDiskCleanupJob {
    public final C2PV A00;
    public final C49602Pt A01;

    public DraftDirectoryDiskCleanupJob(C2PV c2pv, C49602Pt c49602Pt) {
        C14360o3.A0B(c2pv, 1);
        C14360o3.A0B(c49602Pt, 2);
        this.A00 = c2pv;
        this.A01 = c49602Pt;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[LOOP:0: B:11:0x0035->B:13:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 16
            boolean r0 = X.C9CW.A00(r6, r3)
            if (r0 == 0) goto L55
            r4 = r6
            X.9CW r4 = (X.C9CW) r4
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
            if (r0 != r1) goto L62
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
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r1.next()
            X.5Ns r0 = (X.C116135Ns) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L35
        L47:
            X.AbstractC09560e7.A00(r3)
            X.2PV r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r3 = r0.A0M(r4)
            if (r3 != r2) goto L24
            return r2
        L55:
            r0 = 42
            X.9CW r4 = new X.9CW
            r4.<init>(r5, r6, r3, r0)
            goto L16
        L5d:
            java.util.Set r2 = X.AbstractC001800i.A0k(r2)
            return r2
        L62:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob.A00(com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r4 = 8
            boolean r0 = X.C206459Cc.A00(r9, r4)
            if (r0 == 0) goto L7a
            r3 = r9
            X.9Cc r3 = (X.C206459Cc) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r5 = r3.A03
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L61
            if (r0 != r4) goto L80
            java.lang.Object r8 = r3.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r6 = r3.A01
            com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r6 = (com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob) r6
            X.AbstractC09560e7.A00(r5)
        L2c:
            java.util.Set r5 = (java.util.Set) r5
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.C25A.A00(r8)
            java.lang.Integer r0 = X.C05F.A02
            java.util.List r0 = r1.A09(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r1 = r2.next()
            X.47Z r1 = (X.C47Z) r1
            X.5Kv r0 = r1.A1O
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L5d
        L59:
            java.lang.String r0 = r1.A3w
            if (r0 == 0) goto L45
        L5d:
            r3.add(r0)
            goto L45
        L61:
            X.AbstractC09560e7.A00(r5)
            X.2Pt r0 = r7.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto Lb1
            r3.A01 = r7
            r3.A02 = r8
            r3.A00 = r4
            java.lang.Object r5 = A00(r7, r3)
            if (r5 == r1) goto Lb3
            r6 = r7
            goto L2c
        L7a:
            X.9Cc r3 = new X.9Cc
            r3.<init>(r7, r9, r4)
            goto L16
        L80:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L88:
            java.util.Set r1 = X.AbstractC001800i.A0k(r3)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb4
            java.util.LinkedHashSet r5 = X.AnonymousClass090.A00(r1, r5)
        L98:
            X.2Pt r3 = r6.A01
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.C25A.A00(r8)
            java.util.HashSet r2 = r0.A06()
            X.C14360o3.A0B(r5, r4)
            X.0nS r1 = X.C14120nc.A00()
            X.4NE r0 = new X.4NE
            r0.<init>()
            r1.ATO(r0)
        Lb1:
            X.0eB r1 = X.C0eB.A00
        Lb3:
            return r1
        Lb4:
            X.AnonymousClass090.A00(r1, r5)
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob.A01(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }
}
