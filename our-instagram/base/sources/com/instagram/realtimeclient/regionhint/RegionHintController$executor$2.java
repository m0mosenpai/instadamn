package com.instagram.realtimeclient.regionhint;

import X.AbstractC40691uc;
import X.C0YY;
import X.C40701ud;
import X.InterfaceC16820sZ;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class RegionHintController$executor$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ UserSession $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionHintController$executor$2(UserSession userSession) {
        super(0);
        this.$userSession = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final C40701ud invoke() {
        return AbstractC40691uc.A01(this.$userSession);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        return AbstractC40691uc.A01(this.$userSession);
    }
}
