package com.instagram.video.live.mvvm.model.repository.core;

import X.AbstractC208910l;
import X.C008002u;
import X.C05A;
import X.C06090Tz;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C147856lA;
import X.C18U;
import X.C1OU;
import X.EnumC142806cg;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveHeartbeatApi;

/* loaded from: classes3.dex */
public final class IgLiveHeartbeatManager {
    public C05A A00;
    public final long A01;
    public final UserSession A02;
    public final ReelStore A03;
    public final IgLiveHeartbeatApi A04;
    public final EnumC142806cg A05;
    public final IgLiveBroadcastInfoManager A06;
    public final C147856lA A07;
    public final C0UO A08;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:17:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1JX A01(X.InterfaceC23621Ds r8, boolean r9) {
        /*
            r7 = this;
            r3 = 5
            boolean r0 = X.C9CZ.A00(r8, r3)
            if (r0 == 0) goto L2e
            r5 = r8
            X.9CZ r5 = (X.C9CZ) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L34
            if (r0 == r3) goto L5a
            if (r0 == r4) goto L34
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L2e:
            X.9CZ r5 = new X.9CZ
            r5.<init>(r7, r8, r3)
            goto L15
        L34:
            java.lang.Object r2 = r5.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r2 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager) r2
            X.AbstractC09560e7.A00(r1)
            goto L4f
        L3c:
            X.AbstractC09560e7.A00(r1)
            if (r9 == 0) goto L4e
            long r0 = r7.A01
            r5.A01 = r7
            r5.A00 = r2
            java.lang.Object r0 = X.AbstractC89993zf.A01(r5, r0)
            if (r0 != r6) goto L4e
            return r6
        L4e:
            r2 = r7
        L4f:
            r5.A01 = r2
            r5.A00 = r3
            java.lang.Object r0 = A00(r2, r5)
            if (r0 != r6) goto L61
            return r6
        L5a:
            java.lang.Object r2 = r5.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r2 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager) r2
            X.AbstractC09560e7.A00(r1)
        L61:
            long r0 = r2.A01
            r5.A01 = r2
            r5.A00 = r4
            java.lang.Object r0 = X.AbstractC89993zf.A01(r5, r0)
            if (r0 != r6) goto L4f
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager.A01(X.1Ds, boolean):X.1JX");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r8, X.InterfaceC23621Ds r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager.A00(com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ IgLiveHeartbeatManager(UserSession userSession, EnumC142806cg enumC142806cg, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA) {
        ReelStore A04 = C1OU.A04(userSession);
        IgLiveHeartbeatApi igLiveHeartbeatApi = new IgLiveHeartbeatApi(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        long A00 = ((int) C18U.A00(c06090Tz, userSession, 37170008484610563L)) * 1000;
        long A002 = ((int) C18U.A00(c06090Tz, userSession, 37170008484676100L)) * 1000;
        C14360o3.A0B(c147856lA, 3);
        C14360o3.A0B(igLiveBroadcastInfoManager, 4);
        this.A02 = userSession;
        this.A05 = enumC142806cg;
        this.A07 = c147856lA;
        this.A06 = igLiveBroadcastInfoManager;
        this.A03 = A04;
        this.A04 = igLiveHeartbeatApi;
        C008002u A003 = C10E.A00(null);
        this.A00 = A003;
        this.A08 = AbstractC208910l.A02(A003);
        this.A01 = enumC142806cg == EnumC142806cg.A05 ? A002 : A00;
    }
}
