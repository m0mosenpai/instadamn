package com.instagram.realtimeclient.regionhint;

import X.C0YY;
import X.InterfaceC16820sZ;

/* loaded from: classes.dex */
public final class RegionHintController$shouldFetchOverGQL$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ RegionHintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionHintController$shouldFetchOverGQL$2(RegionHintController regionHintController) {
        super(0);
        this.this$0 = regionHintController;
    }

    @Override // X.InterfaceC16820sZ
    public final Boolean invoke() {
        boolean shouldFetchOverMQTT;
        shouldFetchOverMQTT = this.this$0.getShouldFetchOverMQTT();
        return Boolean.valueOf(!shouldFetchOverMQTT);
    }
}
