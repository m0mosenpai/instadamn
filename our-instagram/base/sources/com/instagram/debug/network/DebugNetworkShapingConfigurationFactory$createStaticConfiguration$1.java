package com.instagram.debug.network;

/* loaded from: classes.dex */
public final class DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1 extends NetworkShapingConfiguration {
    public final int failNetworkRequestAfterBytesCount;
    public final int failNetworkRequestProbability;
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

    public DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1(long j, int i, int i2) {
        this.sleepTimePerChunk = j;
        this.failNetworkRequestAfterBytesCount = i;
        this.failNetworkRequestProbability = i2;
    }
}
