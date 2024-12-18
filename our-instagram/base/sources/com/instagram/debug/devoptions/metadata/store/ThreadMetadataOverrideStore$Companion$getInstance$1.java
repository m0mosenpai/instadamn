package com.instagram.debug.devoptions.metadata.store;

import X.C0YY;
import X.InterfaceC16820sZ;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class ThreadMetadataOverrideStore$Companion$getInstance$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ UserSession $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideStore$Companion$getInstance$1(UserSession userSession) {
        super(0);
        this.$userSession = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final ThreadMetadataOverrideStore invoke() {
        return new ThreadMetadataOverrideStore(this.$userSession);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        return new ThreadMetadataOverrideStore(this.$userSession);
    }
}
