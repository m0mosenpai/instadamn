package com.instagram.realtimeclient.regionhint;

import X.C0YY;
import X.InterfaceC16820sZ;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes.dex */
public final class RegionHintController$mqttTopics$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ UserSession $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionHintController$mqttTopics$2(UserSession userSession) {
        super(0);
        this.$userSession = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final List invoke() {
        return RegionHintController.Companion.mqttTopicsToHandle(this.$userSession);
    }
}
