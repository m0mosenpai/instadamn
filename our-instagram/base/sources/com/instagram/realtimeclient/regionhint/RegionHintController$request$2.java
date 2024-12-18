package com.instagram.realtimeclient.regionhint;

import X.C0YY;
import X.C1Dk;
import X.InterfaceC16820sZ;
import com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryImpl;

/* loaded from: classes.dex */
public final class RegionHintController$request$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ RegionHintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionHintController$request$2(RegionHintController regionHintController) {
        super(0);
        this.this$0 = regionHintController;
    }

    @Override // X.InterfaceC16820sZ
    public final C1Dk invoke() {
        long ttlMs;
        long ttlMs2;
        C1Dk A00 = new IGRealtimeRegionHintQueryImpl.Builder().A00();
        ttlMs = this.this$0.getTtlMs();
        C1Dk freshCacheAgeMs = A00.setFreshCacheAgeMs(ttlMs);
        ttlMs2 = this.this$0.getTtlMs();
        return freshCacheAgeMs.setMaxToleratedCacheAgeMs(ttlMs2);
    }
}
