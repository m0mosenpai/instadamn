package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36331mr implements C0KV {
    public static final C36331mr A00 = new C36331mr();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-951157410);
        int A032 = C0f9.A03(624945736);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4LN
            public final C2DS A00;

            {
                C14360o3.A0B(A002, 1);
                this.A00 = A002;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[Catch: all -> 0x00c7, TryCatch #2 {, blocks: (B:15:0x004b, B:17:0x0051, B:19:0x0061, B:21:0x006e, B:23:0x0075, B:25:0x007c, B:29:0x0089, B:31:0x008f, B:33:0x00a8, B:34:0x00ab, B:38:0x0096, B:40:0x009c, B:51:0x00c2, B:43:0x00a0, B:44:0x00a2, B:47:0x00a5, B:50:0x00c1, B:46:0x00a3, B:27:0x0083), top: B:14:0x004b, inners: #0, #1 }] */
            @Override // X.C4L3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC1333760g E6D(X.C5lP r16, X.C125205lR r17, java.util.List r18, java.util.Map r19, X.InterfaceC16620sF r20, X.InterfaceC16620sF r21, boolean r22) {
                /*
                    r15 = this;
                    r0 = 0
                    r1 = r19
                    X.C14360o3.A0B(r1, r0)
                    r0 = 1
                    r5 = r16
                    X.C14360o3.A0B(r5, r0)
                    r0 = 2
                    r6 = r17
                    X.C14360o3.A0B(r6, r0)
                    r0 = 5
                    r4 = r20
                    X.C14360o3.A0B(r4, r0)
                    java.lang.String r0 = "direct_v2_thread_id"
                    java.lang.Object r3 = r1.get(r0)
                    java.lang.String r0 = r6.A02
                    java.lang.Boolean r2 = X.AbstractC22717A0n.A00(r0)
                    if (r3 == 0) goto Lca
                    if (r2 == 0) goto Lca
                    java.lang.String r1 = r6.A00
                    java.lang.String r0 = "replace"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto Lca
                    boolean r7 = r2.booleanValue()
                    java.lang.Object r0 = r4.invoke(r3, r5)
                    X.2ED r0 = (X.C2ED) r0
                    if (r0 != 0) goto L41
                    X.XZZ r0 = X.XZZ.A00
                    return r0
                L41:
                    X.2DS r2 = r15.A00
                    com.instagram.model.direct.DirectThreadKey r9 = r0.BKb()
                    X.2DU r2 = (X.C2DU) r2
                    monitor-enter(r2)
                    r14 = 0
                    X.4GV r6 = r2.A0P(r9)     // Catch: java.lang.Throwable -> Lc7
                    if (r6 == 0) goto Lc3
                    X.3kb r8 = r6.A0I     // Catch: java.lang.Throwable -> Lc7
                    X.0do r0 = r8.A05     // Catch: java.lang.Throwable -> Lc7
                    java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lc7
                    java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lc7
                    boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc7
                    if (r0 == 0) goto La0
                    java.util.concurrent.locks.ReentrantReadWriteLock r1 = r8.A03     // Catch: java.lang.Throwable -> Lc7
                    java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()     // Catch: java.lang.Throwable -> Lc7
                    int r0 = r1.getWriteHoldCount()     // Catch: java.lang.Throwable -> Lc7
                    r4 = 0
                    if (r0 != 0) goto L7b
                    int r3 = r1.getReadHoldCount()     // Catch: java.lang.Throwable -> Lc7
                    r0 = 0
                L73:
                    if (r0 >= r3) goto L7c
                    r5.unlock()     // Catch: java.lang.Throwable -> Lc7
                    int r0 = r0 + 1
                    goto L73
                L7b:
                    r3 = 0
                L7c:
                    java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()     // Catch: java.lang.Throwable -> Lc7
                    r1.lock()     // Catch: java.lang.Throwable -> Lc7
                    X.3iy r0 = r8.A01     // Catch: java.lang.Throwable -> L93
                    r0.A2T = r7     // Catch: java.lang.Throwable -> L93
                L87:
                    if (r4 >= r3) goto L8f
                    r5.lock()     // Catch: java.lang.Throwable -> Lc7
                    int r4 = r4 + 1
                    goto L87
                L8f:
                    r1.unlock()     // Catch: java.lang.Throwable -> Lc7
                    goto La6
                L93:
                    r0 = move-exception
                L94:
                    if (r4 >= r3) goto L9c
                    r5.lock()     // Catch: java.lang.Throwable -> Lc7
                    int r4 = r4 + 1
                    goto L94
                L9c:
                    r1.unlock()     // Catch: java.lang.Throwable -> Lc7
                    goto Lc2
                La0:
                    X.3iy r1 = r8.A01     // Catch: java.lang.Throwable -> Lc7
                    monitor-enter(r1)     // Catch: java.lang.Throwable -> Lc7
                    r1.A2T = r7     // Catch: java.lang.Throwable -> Lc0
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc7
                La6:
                    if (r22 == 0) goto Lab
                    X.C2DU.A0F(r2, r6)     // Catch: java.lang.Throwable -> Lc7
                Lab:
                    r11 = 0
                    java.lang.Integer r10 = X.C05F.A0D     // Catch: java.lang.Throwable -> Lc7
                    X.2Io r8 = new X.2Io     // Catch: java.lang.Throwable -> Lc7
                    r12 = r11
                    r13 = r11
                    r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lc7
                    X.1My r0 = r2.A06     // Catch: java.lang.Throwable -> Lc7
                    r0.E4s(r8)     // Catch: java.lang.Throwable -> Lc7
                    X.2ES r0 = r2.A09     // Catch: java.lang.Throwable -> Lc7
                    r0.accept(r8)     // Catch: java.lang.Throwable -> Lc7
                    goto Lc3
                Lc0:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc7
                Lc2:
                    throw r0     // Catch: java.lang.Throwable -> Lc7
                Lc3:
                    monitor-exit(r2)
                    X.60e r0 = X.C1333660e.A00
                    return r0
                Lc7:
                    r0 = move-exception
                    monitor-exit(r2)
                    throw r0
                Lca:
                    X.60h r0 = X.C1333860h.A00
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4LN.E6D(X.5lP, X.5lR, java.util.List, java.util.Map, X.0sF, X.0sF, boolean):X.60g");
            }
        };
        C0f9.A0A(10761727, A032);
        C0f9.A0A(1272781180, A03);
        return c4l3;
    }
}
