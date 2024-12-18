package com.instagram.realtimeclient.regionhint;

import X.AbstractC23021Ah;
import X.C0YY;
import X.C23031Ai;
import X.InterfaceC16820sZ;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class RegionHintController$userPreferenceProvider$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ UserSession $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionHintController$userPreferenceProvider$2(UserSession userSession) {
        super(0);
        this.$userSession = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final C23031Ai invoke() {
        return AbstractC23021Ah.A00(this.$userSession);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        return AbstractC23021Ah.A00(this.$userSession);
    }
}
