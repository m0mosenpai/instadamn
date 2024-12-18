package com.instagram.debug.network;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C17280tP;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1 extends NetworkShapingConfiguration {
    public final int failNetworkRequestAfterBytesCount = -1;
    public final int failNetworkRequestProbability = 1;
    public final WeakReference sessionRef;

    @Override // com.instagram.debug.network.NetworkShapingConfiguration
    public long getSleepTimePerChunk() {
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.sessionRef.get();
        if (abstractC12990ll != null) {
            long sleepPerChunkOverride = DebugNetworkShapingServerOverrideHelper.getSleepPerChunkOverride(abstractC12990ll);
            if (sleepPerChunkOverride != 0) {
                return sleepPerChunkOverride;
            }
        }
        C17280tP A0y = AbstractC166987dD.A0y();
        return AbstractC166987dD.A0H(A0y.A0o.CES(A0y, C17280tP.A4G[139]));
    }

    public DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(AbstractC12990ll abstractC12990ll) {
        this.sessionRef = AbstractC25225BEi.A16(abstractC12990ll);
    }

    @Override // com.instagram.debug.network.NetworkShapingConfiguration
    public int getFailNetworkRequestAfterBytesCount() {
        return this.failNetworkRequestAfterBytesCount;
    }

    @Override // com.instagram.debug.network.NetworkShapingConfiguration
    public int getFailNetworkRequestProbability() {
        return this.failNetworkRequestProbability;
    }

    public final WeakReference getSessionRef() {
        return this.sessionRef;
    }
}
