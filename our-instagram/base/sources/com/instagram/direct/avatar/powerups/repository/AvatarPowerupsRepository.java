package com.instagram.direct.avatar.powerups.repository;

import X.AbstractC25229BEm;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C1581277x;
import X.C20Y;
import X.C47549KzJ;
import X.L7A;
import X.MHS;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.powerups.api.AvatarPowerupsApi;

/* loaded from: classes8.dex */
public final class AvatarPowerupsRepository {
    public final AvatarStore A00;
    public final UserSession A01;
    public final AvatarPowerupsApi A02;
    public final C1581277x A03;
    public final L7A A04;
    public final C47549KzJ A05;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r10 == r7) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository.A00(X.1Ds):java.lang.Object");
    }

    public /* synthetic */ AvatarPowerupsRepository(UserSession userSession) {
        AvatarPowerupsApi avatarPowerupsApi = new AvatarPowerupsApi(userSession, AbstractC40691uc.A01(userSession));
        C1581277x c1581277x = new C1581277x(userSession);
        AvatarStore A00 = C20Y.A00(userSession);
        C47549KzJ c47549KzJ = new C47549KzJ(userSession);
        C14360o3.A0B(userSession, 0);
        L7A l7a = (L7A) userSession.A01(L7A.class, MHS.A00(userSession, 37));
        AbstractC25229BEm.A1I(A00, 4, l7a);
        this.A01 = userSession;
        this.A02 = avatarPowerupsApi;
        this.A03 = c1581277x;
        this.A00 = A00;
        this.A05 = c47549KzJ;
        this.A04 = l7a;
    }
}
