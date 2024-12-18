package com.facebook.graphservice.config;

import X.AbstractC72467XeJ;
import X.C72550XgK;

/* loaded from: classes12.dex */
public class GraphQLConsistencyConfig {
    public boolean disableGBNS;
    public boolean disableQueueHealthCheck;
    public boolean enableBlackboxConsistencyService;
    public boolean enableGlobalFullConsistency;
    public int minFlushesToSkip;
    public int prunePersistentStoreStrategy;
    public int queueHealthCheckInterval;
    public int writeBufferColdAge;
    public int writeBufferMandatoryFlushAge;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XgK, java.lang.Object] */
    public static C72550XgK Builder() {
        return new Object();
    }

    public boolean disableGBNS() {
        return this.disableGBNS;
    }

    public boolean disableQueueHealthCheck() {
        return this.disableQueueHealthCheck;
    }

    public boolean enableGlobalFullConsistency() {
        return this.enableGlobalFullConsistency;
    }

    public int getMinFlushesToSkip() {
        return this.minFlushesToSkip;
    }

    public int getWriteBufferColdAge() {
        return this.writeBufferColdAge;
    }

    public int getWriteBufferMandatoryFlushAge() {
        return this.writeBufferMandatoryFlushAge;
    }

    public boolean isEnableBlackboxConsistencyService() {
        return this.enableBlackboxConsistencyService;
    }

    public int prunePersistentStoreStrategy() {
        return this.prunePersistentStoreStrategy;
    }

    public int queueHealthCheckInterval() {
        return this.queueHealthCheckInterval;
    }

    public /* synthetic */ GraphQLConsistencyConfig(AbstractC72467XeJ abstractC72467XeJ) {
    }

    public GraphQLConsistencyConfig() {
    }
}
