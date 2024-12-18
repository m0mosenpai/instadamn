package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDL extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumC142806cg A03;

    public NDL(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A03 = enumC142806cg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r0 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    @Override // X.AbstractC61132qb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.AbstractC52922bZ create() {
        /*
            r28 = this;
            r3 = r28
            X.6cg r13 = r3.A03
            int r1 = r13.ordinal()
            r14 = 0
            r0 = 0
            if (r1 != r0) goto Lbb
            X.8bo r2 = X.C190298bn.A03
            android.content.Context r1 = r3.A00
            com.instagram.common.session.UserSession r0 = r3.A02
            X.8bn r2 = r2.A00(r1, r0)
        L16:
            com.instagram.common.session.UserSession r8 = r3.A02
            X.NZa r1 = X.AbstractC54266Nym.A00(r8, r13)
            X.6cg r0 = X.EnumC142806cg.A03
            if (r13 != r0) goto Lb8
            X.0iw r0 = r3.A01
            X.NYV r10 = X.OQX.A01(r0, r8)
        L26:
            X.6lA r11 = r1.A03
            X.0do r0 = r1.A05
            java.lang.Object r7 = r0.getValue()
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r7 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager) r7
            X.0do r0 = r1.A08
            java.lang.Object r6 = r0.getValue()
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r6 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager) r6
            X.0do r0 = r1.A09
            java.lang.Object r5 = r0.getValue()
            com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository) r5
            android.content.Context r9 = r3.A00
            com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository r15 = r1.A00(r9, r8)
            X.0do r0 = r1.A01
            java.lang.Object r4 = r0.getValue()
            X.ODQ r4 = (X.ODQ) r4
            X.OLC r25 = r1.A02()
            X.0do r0 = r1.A07
            java.lang.Object r3 = r0.getValue()
            X.OKs r3 = (X.C54817OKs) r3
            if (r2 == 0) goto Lb5
            X.OJz r16 = r2.A01()
        L60:
            boolean r0 = r1 instanceof X.NZZ
            if (r0 == 0) goto Laf
            r2 = r1
            X.NZZ r2 = (X.NZZ) r2
            if (r2 == 0) goto Laf
            X.0do r0 = r2.A02
            java.lang.Object r2 = r0.getValue()
            com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r2 = (com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository) r2
        L71:
            X.NZZ r1 = (X.NZZ) r1
            if (r1 == 0) goto Lb3
            X.0do r0 = r1.A01
            java.lang.Object r1 = r0.getValue()
            X.O95 r1 = (X.O95) r1
        L7d:
            if (r10 == 0) goto L83
            X.PIw r14 = r10.A01(r9)
        L83:
            X.0Tz r0 = X.AbstractC166997dE.A0U(r8)
            r9 = 36318024411715385(0x81070d00011739, double:3.031003106690445E-306)
            boolean r26 = X.C18U.A06(r0, r8, r9)
            r9 = 36318024411649848(0x81070d00001738, double:3.031003106648999E-306)
            boolean r27 = X.C18U.A06(r0, r8, r9)
            X.MgS r12 = new X.MgS
            r23 = r4
            r24 = r6
            r20 = r5
            r21 = r7
            r22 = r11
            r17 = r3
            r18 = r1
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r12
        Laf:
            r2 = r14
            if (r0 == 0) goto Lb3
            goto L71
        Lb3:
            r1 = r14
            goto L7d
        Lb5:
            r16 = r14
            goto L60
        Lb8:
            r10 = r14
            goto L26
        Lbb:
            r2 = r14
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NDL.create():X.2bZ");
    }
}
