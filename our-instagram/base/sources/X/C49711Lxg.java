package X;

/* renamed from: X.Lxg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49711Lxg implements InterfaceC42241xE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ L9c A01;
    public final /* synthetic */ C47714L4v A02;

    public C49711Lxg(L9c l9c, C47714L4v c47714L4v, long j) {
        this.A01 = l9c;
        this.A02 = c47714L4v;
        this.A00 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC42241xE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r10) {
        /*
            r9 = this;
            X.KcE r10 = (X.EnumC46176KcE) r10
            r2 = -1
            if (r10 == 0) goto L6c
            int r1 = r10.ordinal()
            r0 = 0
            if (r1 == r0) goto L89
            r0 = 1
            if (r1 == r0) goto L47
            r0 = 5
            if (r1 == r0) goto L44
            r0 = 2
            if (r1 == r0) goto L41
            r0 = 3
            if (r1 == r0) goto L3e
            r0 = 4
            if (r1 != r0) goto L6c
            java.lang.String r5 = "processSyncPathNotification: invalid mailbox"
        L1d:
            X.L9c r0 = r9.A01
            com.instagram.common.session.UserSession r4 = r0.A01
            X.L4v r0 = r9.A02
            com.instagram.common.notifications.push.intf.PushChannelType r1 = com.instagram.common.notifications.push.intf.PushChannelType.A0F
            X.5Nu r3 = X.AbstractC46892KoZ.A00(r4, r0)
            r0 = 3
            X.C14360o3.A0B(r1, r0)
            java.lang.String r1 = "sync"
            r0 = 7
            X.AbstractC44086JeB.A02(r3, r4, r5, r1, r0)
            X.JQZ r0 = X.JQZ.A01
            long r7 = r9.A00
            r0.DW7(r7, r2, r5)
        L3a:
            X.LFY r2 = X.LFY.A00
            monitor-enter(r2)
            goto L77
        L3e:
            java.lang.String r5 = "processSyncPathNotification: mailbox code gen returns null result.value"
            goto L1d
        L41:
            java.lang.String r5 = "processSyncPathNotification: failed to insert into DB"
            goto L1d
        L44:
            java.lang.String r5 = "processSyncPathNotification: received processing state from CQL which is unexpected"
            goto L1d
        L47:
            java.lang.String r5 = "duplicate notification dropped in processSyncPathNotification"
            X.L9c r0 = r9.A01
            com.instagram.common.session.UserSession r4 = r0.A01
            X.L4v r0 = r9.A02
            com.instagram.common.notifications.push.intf.PushChannelType r3 = com.instagram.common.notifications.push.intf.PushChannelType.A0F
            X.5Nu r2 = X.AbstractC46892KoZ.A00(r4, r0)
            java.lang.String r1 = "sync"
            r0 = 6
            X.AbstractC44086JeB.A02(r2, r4, r5, r1, r0)
            java.lang.String r0 = "duplicate_dropped"
            X.AbstractC47872LCs.A01(r2, r3, r4, r0)
            X.JQZ r3 = X.JQZ.A01
            long r7 = r9.A00
            java.lang.Integer r4 = X.C05F.A00
            r6 = 1003(0x3eb, float:1.406E-42)
            r3.DWA(r4, r5, r6, r7)
            goto L3a
        L6c:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "processSyncPathNotification: unexpected result, result = "
            java.lang.String r5 = X.AbstractC167017dG.A0n(r10, r0, r1)
            goto L1d
        L77:
            java.util.Map r0 = X.LFY.A01     // Catch: java.lang.Throwable -> L85
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L85
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L85
            r1.remove(r0)     // Catch: java.lang.Throwable -> L85
            goto L88
        L85:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L88:
            monitor-exit(r2)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49711Lxg.accept(java.lang.Object):void");
    }
}
