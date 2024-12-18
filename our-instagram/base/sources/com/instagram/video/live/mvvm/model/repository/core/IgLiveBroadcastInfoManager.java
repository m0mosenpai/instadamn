package com.instagram.video.live.mvvm.model.repository.core;

import X.AbstractC208910l;
import X.AnonymousClass189;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C18A;
import X.C1OU;
import X.EnumC142806cg;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi;

/* loaded from: classes3.dex */
public final class IgLiveBroadcastInfoManager {
    public final UserSession A00;
    public final ReelStore A01;
    public final C18A A02;
    public final IgLiveBroadcastInfoApi A03;
    public final EnumC142806cg A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        if (r1 == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager.A01(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 4
            boolean r0 = X.C9CZ.A00(r7, r3)
            if (r0 == 0) goto L4e
            r4 = r7
            X.9CZ r4 = (X.C9CZ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L54
            java.lang.Object r0 = r4.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager) r0
            X.AbstractC09560e7.A00(r1)
        L27:
            if (r1 == 0) goto L2e
            X.05A r0 = r0.A05
            r0.Egh(r1)
        L2e:
            X.0eB r3 = X.C0eB.A00
        L30:
            return r3
        L31:
            X.AbstractC09560e7.A00(r1)
            com.instagram.reels.store.ReelStore r0 = r5.A01
            com.instagram.model.reels.Reel r0 = r0.A0M(r6)
            if (r0 == 0) goto L2e
            X.4pt r1 = r0.A0H
            if (r1 == 0) goto L2e
            com.instagram.common.session.UserSession r0 = r5.A00
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A01(r0, r1, r4)
            if (r1 == r3) goto L30
            r0 = r5
            goto L27
        L4e:
            X.9CZ r4 = new X.9CZ
            r4.<init>(r5, r7, r3)
            goto L15
        L54:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ IgLiveBroadcastInfoManager(UserSession userSession, EnumC142806cg enumC142806cg) {
        IgLiveBroadcastInfoApi igLiveBroadcastInfoApi = new IgLiveBroadcastInfoApi(userSession);
        ReelStore A04 = C1OU.A04(userSession);
        C18A A00 = AnonymousClass189.A00(userSession);
        C14360o3.A0B(A00, 5);
        this.A00 = userSession;
        this.A04 = enumC142806cg;
        this.A03 = igLiveBroadcastInfoApi;
        this.A01 = A04;
        this.A02 = A00;
        C008002u A002 = C10E.A00(null);
        this.A05 = A002;
        this.A06 = AbstractC208910l.A02(A002);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C3PO r34, java.lang.String r35, java.util.List r36, X.InterfaceC23621Ds r37, boolean r38) {
        /*
            r33 = this;
            r12 = r35
            r11 = r34
            r4 = r38
            r3 = 5
            r5 = r37
            boolean r0 = X.PX2.A01(r5, r3)
            r8 = r33
            if (r0 == 0) goto Laf
            r7 = r5
            X.PX2 r7 = (X.PX2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r7.A00 = r2
        L1f:
            java.lang.Object r1 = r7.A06
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L7a
            if (r0 != r5) goto Lb6
            boolean r4 = r7.A08
            java.lang.Object r0 = r7.A05
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r10 = r7.A04
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.Object r3 = r7.A03
            X.05A r3 = (X.C05A) r3
            java.lang.Object r11 = r7.A02
            X.3PO r11 = (X.C3PO) r11
            java.lang.Object r12 = r7.A01
            java.lang.String r12 = (java.lang.String) r12
            X.AbstractC09560e7.A00(r1)
        L43:
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            java.lang.String r13 = "0"
            r24 = 0
            X.0sl r20 = X.C16930sl.A00
            java.lang.String r18 = ""
            X.Mse r5 = new X.Mse
            r7 = r6
            r8 = r6
            r9 = r6
            r14 = r13
            r15 = r6
            r16 = r6
            r17 = r6
            r19 = r1
            r21 = r20
            r22 = r20
            r23 = r0
            r25 = r24
            r26 = r24
            r27 = r4
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r32 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.Egh(r5)
        L77:
            X.0eB r6 = X.C0eB.A00
            return r6
        L7a:
            X.AbstractC09560e7.A00(r1)
            X.05A r3 = r8.A05
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L77
            X.18A r2 = r8.A02
            com.instagram.common.session.UserSession r1 = r8.A00
            java.lang.String r0 = r1.userId
            com.instagram.user.model.User r10 = r2.A02(r0)
            if (r10 != 0) goto L96
            com.instagram.user.model.User r10 = new com.instagram.user.model.User
            r10.<init>()
        L96:
            X.0sj r0 = X.C16910sj.A00
            r7.A01 = r12
            r7.A02 = r11
            r7.A03 = r3
            r7.A04 = r10
            r7.A05 = r0
            r7.A08 = r4
            r7.A00 = r5
            r2 = r36
            java.lang.Object r1 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveSponsorKt.A00(r1, r2, r7)
            if (r1 != r6) goto L43
            return r6
        Laf:
            X.PX2 r7 = new X.PX2
            r7.<init>(r8, r5, r3)
            goto L1f
        Lb6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager.A00(X.3PO, java.lang.String, java.util.List, X.1Ds, boolean):java.lang.Object");
    }
}
