package com.instagram.realtimeclient.regionhint;

import X.C0YY;
import X.InterfaceC16820sZ;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.regionhint.L;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class RegionHintController$ttlMs$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ UserSession $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionHintController$ttlMs$2(UserSession userSession) {
        super(0);
        this.$userSession = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final Long invoke() {
        return Long.valueOf(TimeUnit.HOURS.toMillis(L.igd_android_capacity_optimizations.region_hint_cache_ttl_hours.getAndExpose(this.$userSession).longValue()));
    }
}
