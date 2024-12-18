package com.instagram.debug.network;

/* loaded from: classes5.dex */
public final class DebugNetworkShapingConfigurationFactory$createNetworkShapingCallbackConfiguration$1 extends NetworkShapingConfiguration {
    public final int failNetworkRequestAfterBytesCount = -1;
    public final int failNetworkRequestProbability = 1;
    public final long sleepTimePerChunk;

    @Override // com.instagram.debug.network.NetworkShapingConfiguration
    public int getFailNetworkRequestAfterBytesCount() {
        return this.failNetworkRequestAfterBytesCount;
    }

    @Override // com.instagram.debug.network.NetworkShapingConfiguration
    public int getFailNetworkRequestProbability() {
        return this.failNetworkRequestProbability;
    }

    @Override // com.instagram.debug.network.NetworkShapingConfiguration
    public long getSleepTimePerChunk() {
        return this.sleepTimePerChunk;
    }
}
