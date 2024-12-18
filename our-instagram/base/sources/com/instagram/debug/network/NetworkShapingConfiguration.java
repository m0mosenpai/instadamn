package com.instagram.debug.network;

/* loaded from: classes.dex */
public abstract class NetworkShapingConfiguration {
    public abstract int getFailNetworkRequestAfterBytesCount();

    public abstract int getFailNetworkRequestProbability();

    public abstract long getSleepTimePerChunk();

    public final boolean isNetworkShapingOn() {
        if (getSleepTimePerChunk() <= 0 && getFailNetworkRequestAfterBytesCount() == -1) {
            return false;
        }
        return true;
    }
}
