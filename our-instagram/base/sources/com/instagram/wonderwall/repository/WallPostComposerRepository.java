package com.instagram.wonderwall.repository;

import X.AbstractC166997dE;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C25671My;
import X.InterfaceC58259Ps3;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;

/* loaded from: classes5.dex */
public final class WallPostComposerRepository {
    public final C25671My A00;
    public final UserSession A01;
    public final User A02;
    public final InterfaceC58259Ps3 A03;
    public final WallInfo A04;
    public final WallPendingPostManager A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.music.common.model.AudioOverlayTrack r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 14
            boolean r0 = X.C57147PWz.A02(r10, r3)
            if (r0 == 0) goto L79
            r7 = r10
            X.PWz r7 = (X.C57147PWz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r3 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 != r1) goto L7f
            java.lang.Object r9 = r7.A02
            com.instagram.music.common.model.AudioOverlayTrack r9 = (com.instagram.music.common.model.AudioOverlayTrack) r9
            java.lang.Object r2 = r7.A01
            com.instagram.wonderwall.repository.WallPostComposerRepository r2 = (com.instagram.wonderwall.repository.WallPostComposerRepository) r2
            X.AbstractC09560e7.A00(r3)
        L2c:
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            java.lang.String r0 = r9.A0A
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r3 != 0) goto L3c
            X.0sl r3 = X.C16930sl.A00
        L3c:
            X.Biy r1 = new X.Biy
            r1.<init>(r9, r0, r3)
            X.05A r0 = r2.A06
            r0.Egh(r1)
            X.0eB r0 = X.C0eB.A00
            return r0
        L49:
            X.AbstractC09560e7.A00(r3)
            com.instagram.common.session.UserSession r5 = r8.A01
            com.instagram.music.common.model.MusicAssetModel r0 = r9.A08
            if (r0 == 0) goto L75
            com.instagram.common.typedurl.ImageUrl r0 = r0.A03
            if (r0 == 0) goto L75
            java.lang.String r4 = r0.getUrl()
        L5a:
            r7.A01 = r8
            r7.A02 = r9
            r7.A00 = r1
            X.12L r0 = X.C12L.A00
            r3 = 0
            X.0nZ r2 = X.AbstractC25231BEo.A0e(r0)
            r1 = 40
            X.MCF r0 = new X.MCF
            r0.<init>(r5, r4, r3, r1)
            java.lang.Object r3 = X.AbstractC23641Du.A00(r7, r2, r0)
            if (r3 != r6) goto L77
            return r6
        L75:
            r4 = 0
            goto L5a
        L77:
            r2 = r8
            goto L2c
        L79:
            X.PWz r7 = new X.PWz
            r7.<init>(r8, r10, r3)
            goto L16
        L7f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPostComposerRepository.A00(com.instagram.music.common.model.AudioOverlayTrack, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ WallPostComposerRepository(UserSession userSession, InterfaceC58259Ps3 interfaceC58259Ps3, WallInfo wallInfo, WallPendingPostManager wallPendingPostManager, String str) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        AbstractC25229BEm.A1I(wallPendingPostManager, 3, A00);
        this.A04 = wallInfo;
        this.A01 = userSession;
        this.A05 = wallPendingPostManager;
        this.A03 = interfaceC58259Ps3;
        this.A00 = A00;
        C008002u A1H = AbstractC25225BEi.A1H(str);
        this.A07 = A1H;
        this.A09 = AbstractC208910l.A02(A1H);
        C008002u A002 = C10E.A00(interfaceC58259Ps3);
        this.A06 = A002;
        this.A08 = A002;
        this.A02 = AbstractC166997dE.A0Y(userSession);
    }
}
